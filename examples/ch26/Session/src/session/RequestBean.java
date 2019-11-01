// RequestBean.java
package com.deteil.howtoprogram.examples.ch26.Session.src.session;

import com.sun.rave.web.ui.appbase.AbstractRequestBean;
import javax.faces.FacesException;

public class RequestBean extends AbstractRequestBean
{
   private int __placeholder;
   
   private void _init() throws Exception
   {
      // empty body
   } // end method _init
   
   public RequestBean()
   {
      // empty constructor
   } // end constructor
   
   protected ApplicationBean getApplicationBean()
   {
      return (ApplicationBean)getBean("ApplicationBean");
   } // end method getApplicationBean
   
   protected SessionBean getSessionBean()
   {
      return (SessionBean)getBean("SessionBean");
   } // end method getSessionBean
   
   public void init()
   {
      super.init();
      try
      {
         _init();
      } // end try
      catch ( Exception e )
      {
         log( "RequestBean Initialization Failure", e );
         throw e instanceof FacesException ? (FacesException) e: 
            new FacesException( e );
      } // end catch
   } // end method init
   
   public void destroy()
   {
      // empty body
   } // end method destroy
} // end class RequestBean

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
