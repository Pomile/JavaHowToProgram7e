// Fig. 27.7: SessionBean1.java
// Session bean that initializes the data source for the 
// AddressBook database.
package com.deteil.howtoprogram.examples.ch27.part2.AddressBook.src.addressbook;

import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import javax.faces.FacesException;
import com.sun.sql.rowset.CachedRowSetXImpl;

public class SessionBean1 extends AbstractSessionBean 
{
   private int __placeholder;

   /**
    * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
    * This method is automatically generated, so any user-specified code inserted
    * here is subject to being replaced.</p>
    */
   private void _init() throws Exception 
   {
      addressesRowSet.setDataSourceName("java:comp/env/jdbc/AddressBook");
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
      addressesRowSet.setTableName("ADDRESSES");
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
      // Perform initializations inherited from our superclass
      super.init();
      // Perform application initialization that must complete
      // *before* managed components are initialized
      // TODO - add your own initialiation code here

      // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
      // Perform application initialization that must complete
      // *after* managed components are initialized
      // TODO - add your own initialization code here
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
