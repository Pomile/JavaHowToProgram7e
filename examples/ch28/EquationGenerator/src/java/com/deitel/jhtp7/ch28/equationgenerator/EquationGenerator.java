// Fig. 22.20: Generator.java
// Web service that generates random equations
package com.deteil.howtoprogram.examples.ch28.EquationGenerator.src.java.com.deitel.jhtp7.ch28.equationgenerator;

import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService( name = "EquationGenerator", 
   serviceName = "EquationGeneratorService" )
public class EquationGenerator
{ 
   private int minimum;
   private int maximum;
   
   // generates a math equation and returns it as an Equation object
   @WebMethod( operationName = "generateEquation" )
   public Equation generateEquation( 
      @WebParam( name = "operation" ) String operation, 
      @WebParam( name = "difficulty" ) int difficulty )
   {
      minimum = ( int ) Math.pow( 10, difficulty - 1 );
      maximum = ( int ) Math.pow( 10, difficulty );
      
      Random randomObject = new Random();
      
      return new Equation(
         randomObject.nextInt( maximum - minimum ) + minimum,
         randomObject.nextInt( maximum - minimum ) + minimum, operation );
   } // end method generateEquation
} // end class EquationGenerator

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


