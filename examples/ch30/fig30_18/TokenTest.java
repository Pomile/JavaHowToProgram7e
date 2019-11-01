// Fig. 30.18: TokenTest.java
// StringTokenizer class.
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest 
{
   // execute application
   public static void main( String args[] )
   {
      // get sentence
      Scanner scanner = new Scanner( System.in );
      System.out.println( "Enter a sentence and press Enter" );
      String sentence = scanner.nextLine();

      // process user sentence
      StringTokenizer tokens = new StringTokenizer( sentence );
      System.out.printf( "Number of elements: %d\nThe tokens are:\n",
         tokens.countTokens() );

      while ( tokens.hasMoreTokens() )
         System.out.println( tokens.nextToken() );
   } // end main
} // end class TokenTest

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
