// ApplicationBean.java
package com.deteil.howtoprogram.examples.ch26.Session.src.session;

import com.sun.rave.web.ui.appbase.AbstractApplicationBean;
import javax.faces.FacesException;

public class ApplicationBean extends AbstractApplicationBean
{
   private int __placeholder;
   
   private void _init() throws Exception
   {
      // empty body
   } // end method _init
   
   public ApplicationBean()
   {
      // empty constructor
   } // end constructor
   
   public void init()
   {
      super.init();
      try
      {
         _init();
      } // end try
      catch ( Exception e )
      {
         log( "ApplicationBean Initialization Failure", e );
         throw e instanceof FacesException ? (FacesException) e: 
            new FacesException( e );
      } // end catch
   } // end method init
   
   public void destroy()
   {
      // empty body
   } // end method destroy

   public String getLocaleCharacterEncoding()
   {
      return super.getLocaleCharacterEncoding();
   } // end method getLocaleCharacterEncoding
} // end class ApplicationBean

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
