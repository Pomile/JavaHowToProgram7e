// Fig. 27.7: SessionBean1.java
// Session bean that initializes the data source for the 
// AddressBook database.
package com.deteil.howtoprogram.examples.ch27.part1.AddressBook.src.addressbook;

import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import javax.faces.FacesException;
import com.sun.sql.rowset.CachedRowSetXImpl;

public class SessionBean1 extends AbstractSessionBean 
{
   private int __placeholder;

   private void _init() throws Exception 
   {
      addressesRowSet.setDataSourceName(
         "java:comp/env/jdbc/AddressBook" );
      addressesRowSet.setCommand( 
         "SELECT ALL JHTP7.ADDRESSES.FIRSTNAME," +
         "\nJHTP7.ADDRESSES.LASTNAME," +
         "\nJHTP7.ADDRESSES.STREET," + 
         "\nJHTP7.ADDRESSES.CITY," +
         "\nJHTP7.ADDRESSES.STATE," + 
         "\nJHTP7.ADDRESSES.ZIP" + 
         "\nFROM JHTP7.ADDRESSES" + 
         "\nORDER BY JHTP7.ADDRESSES.LASTNAME ASC," + 
         "\nJHTP7.ADDRESSES.FIRSTNAME ASC " );
      addressesRowSet.setTableName( "ADDRESSES" );
   } // end method _init

   private CachedRowSetXImpl addressesRowSet = new CachedRowSetXImpl();

   public CachedRowSetXImpl getAddressesRowSet() 
   {
      return addressesRowSet;
   }

   public void setAddressesRowSet( CachedRowSetXImpl crsxi ) 
   {
      this.addressesRowSet = crsxi;
   }

   public SessionBean1() 
   {
   }

   protected ApplicationBean1 getApplicationBean1() 
   {
      return (ApplicationBean1) getBean( "ApplicationBean1" );
   }

   public void init() 
   {
      super.init();
      try 
      {
         _init();
      } 
      catch ( Exception e ) 
      {
         log( "SessionBean1 Initialization Failure", e );
         throw e instanceof FacesException ? 
            (FacesException) e : new FacesException(e);
      }
   }

   public void passivate() 
   {
   }

   public void activate() 
   {
   }

   public void destroy() 
   {
   }
} // end class SessionBean1

/*************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and              *
 * Pearson Education, Inc. All Rights Reserved.                          *
 *                                                                       *
 * DISCLAIMER: The authors and publisher of this book have used their    *
 * best efforts in preparing the book. These efforts include the         *
 * development, research, and testing of the theories and programs       *
 * to determine their effectiveness. The authors and publisher make      *
 * no warranty of any kind, expressed or implied, with regard to these   *
 * programs or to the documentation contained in these books. The authors*
 * and publisher shall not be liable in any event for incidental or      *
 * consequential damages in connection with, or arising out of, the      *
 * furnishing, performance, or use of these programs.                    *
 ************************************************************************/