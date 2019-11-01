// Fig. 28.2: HugeInteger.java
// HugeInteger web service that performs operations on large integers.
package com.deteil.howtoprogram.examples.ch28.HugeInteger.src.java.com.deitel.jhtp7.ch28.hugeinteger;

import javax.jws.WebService; // program uses the annotation @WebService
import javax.jws.WebMethod; // program uses the annotation @WebMethod
import javax.jws.WebParam; // program uses the annotation @WebParam

@WebService( // annotates the class as a web service
   name = "HugeInteger", // sets class name
   serviceName = "HugeIntegerService" ) // sets the service name
public class HugeInteger
{
   private final static int MAXIMUM = 100; // maximum number of digits
   public int[] number = new int[ MAXIMUM ]; // stores the huge integer
  
   // returns a String representation of a HugeInteger
   public String toString()
   {
      String value = "";
      
      // convert HugeInteger to a String
      for ( int digit : number )
         value = digit + value; // places next digit at beginning of value
      
      // locate position of first non-zero digit
      int length = value.length();
      int position = -1;
      
      for ( int i = 0; i < length; i++ ) 
      {
         if ( value.charAt( i ) != '0' ) 
         {
            position = i; // first non-zero digit
            break;
         }
      } // end for
         
      return ( position != -1 ? value.substring( position ) : "0" );
   } // end method toString
   
   // creates a HugeInteger from a String
   public static HugeInteger parseHugeInteger( String s )
   {
      HugeInteger temp = new HugeInteger();
      int size = s.length();
      
      for ( int i = 0; i < size; i++ )
         temp.number[ i ] = s.charAt( size - i - 1 ) - '0';
      
      return temp;
   } // end method parseHugeInteger
   
   // WebMethod that adds huge integers represented by String arguments
   @WebMethod( operationName = "add" ) 
   public String add( @WebParam( name = "first" ) String first,
      @WebParam( name = "second" ) String second ) 
   {
      int carry = 0; // the value to be carried
      HugeInteger operand1 = HugeInteger.parseHugeInteger( first );
      HugeInteger operand2 = HugeInteger.parseHugeInteger( second );
      HugeInteger result = new HugeInteger(); // stores addition result
      
      // perform addition on each digit
      for ( int i = 0; i < MAXIMUM; i++ )
      {
         // add corresponding digits in each number and the carried value;
         // store result in the corresponding column of HugeInteger result
         result.number[ i ] = 
            ( operand1.number[ i ] + operand2.number[ i ] + carry ) % 10;
         
         // set carry for next column
         carry = 
            ( operand1.number[ i ] + operand2.number[ i ] + carry ) / 10;
      } // end for
      
      return result.toString();
   } // end WebMethod add
   
   // WebMethod that subtracts integers represented by String arguments
   @WebMethod( operationName = "subtract" ) 
   public String subtract( @WebParam( name = "first" ) String first,
      @WebParam( name = "second" ) String second )
   {
      HugeInteger operand1 = HugeInteger.parseHugeInteger( first );
      HugeInteger operand2 = HugeInteger.parseHugeInteger( second );
      HugeInteger result = new HugeInteger(); // stores difference
      
      // subtract bottom digit from top digit
      for ( int i = 0; i < MAXIMUM; i++ )
      {
         // if the digit in operand1 is smaller than the corresponding 
         // digit in operand2, borrow from the next digit 
         if ( operand1.number[ i ] < operand2.number[ i ] )
            operand1.borrow( i );
         
         // subtract digits
         result.number[ i ] = operand1.number[ i ] - operand2.number[ i ];
      } // end for
      
      return result.toString();
   } // end WebMethod subtract
   
   // borrow 1 from next digit 
   private void borrow( int place )
   {
      if ( place >= MAXIMUM )
         throw new IndexOutOfBoundsException();
      else if ( number[ place + 1 ] == 0 ) // if next digit is zero
         borrow( place + 1 ); // borrow from next digit
      
      number[ place ] += 10; // add 10 to the borrowing digit
      --number[ place + 1 ]; // subtract one from the digit to the left
   } // end method borrow
   
   // WebMethod that returns true if first integer is greater than second
   @WebMethod( operationName = "bigger" ) 
   public boolean bigger( @WebParam( name = "first" ) String first,
      @WebParam( name = "second" ) String second )
   {
      try // try subtracting first from second
      {
         String difference = subtract( first, second );      
         return !difference.matches( "^[0]+$" ); 
      } // end try
      catch ( IndexOutOfBoundsException e ) // first is less than second
      {
         return false;
      } // end catch
   } // end WebMethod bigger
   
   // WebMethod that returns true if the first integer is less than second
   @WebMethod( operationName = "smaller" ) 
   public boolean smaller( @WebParam( name = "first" ) String first,
      @WebParam( name = "second" ) String second )
   {
      return bigger( second, first );
   } // end WebMethod smaller
   
   // WebMethod that returns true if the first integer equals the second
   @WebMethod( operationName = "equals" ) 
   public boolean equals( @WebParam( name = "first" ) String first,
      @WebParam( name = "second" ) String second )
   {
      return !( bigger( first, second ) || smaller( first, second ) ); 
   } // end WebMethod equals
} // end class HugeInteger


/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/


