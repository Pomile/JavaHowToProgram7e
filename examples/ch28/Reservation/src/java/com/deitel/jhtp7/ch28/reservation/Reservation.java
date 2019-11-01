// Fig. 28.17: Reservation.java
// Airline reservation web service.
package com.deteil.howtoprogram.examples.ch28.Reservation.src.java.com.deitel.jhtp7.ch28.reservation;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService( name = "Reservation", serviceName = "ReservationService" )
public class Reservation
{
   private static final String DATABASE_URL =
      "jdbc:derby://localhost:1527/Reservation";
   private static final String USERNAME = "jhtp7";
   private static final String PASSWORD = "jhtp7";
   private Connection connection;
   private Statement statement;
   
   // a WebMethod that can reserve a seat
   @WebMethod( operationName = "reserve" )
   public boolean reserve( @WebParam( name = "seatType" ) String seatType,
      @WebParam( name = "classType" ) String classType )
   {
      try
      {
         connection = DriverManager.getConnection( 
            DATABASE_URL, USERNAME, PASSWORD );
         statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(
            "SELECT \"Number\" FROM \"Seats\"" +
            "WHERE (\"Taken\" = 0) AND (\"Location\" = '" + seatType + 
            "') AND (\"Class\" = '" + classType + "')" );
         
         // if requested seat is available, reserve it
         if ( resultSet.next() )
         {
            int seat = resultSet.getInt( 1 );
            statement.executeUpdate( "UPDATE \"Seats\" " +
               "SET \"Taken\" = 1 WHERE \"Number\" = " + seat );
            return true;
         } // end if
         
         return false;
      } // end try
      catch ( SQLException e )
      {
         e.printStackTrace();
         return false;
      } // end catch
      catch ( Exception e )
      {
         e.printStackTrace();  
         return false;
      } // end catch
      finally
      {
         try
         {
            statement.close();
            connection.close();
         } // end try
         catch ( Exception e )
         {
            e.printStackTrace();
            return false;
         } // end catch
      } // end finally
   } // end WebMethod reserve
} // end class Reservation


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


