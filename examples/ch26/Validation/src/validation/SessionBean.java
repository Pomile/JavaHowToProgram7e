// SessionBean.java
package com.deteil.howtoprogram.examples.ch26.Validation.src.validation;

import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import javax.faces.FacesException;

public class SessionBean extends AbstractSessionBean
{
   private int __placeholder;
   
   private void _init() throws Exception
   {
      // empty body
   } // end method _init
   
   public SessionBean()
   {
       // empty constructor
   } // end constructor
   
   protected ApplicationBean getApplicationBean()
   {
      return (ApplicationBean) getBean( "ApplicationBean" );
   } // end method getApplicationBean
   
   public void init()
   {
      super.init();
      try
      {
         _init();
      } // end try
      catch ( Exception e )
      {
         log( "SessionBean Initialization Failure", e );
         throw e instanceof FacesException ? (FacesException) e: 
            new FacesException( e );
      } // end catch
   } // end method init
   
   public void passivate()
   {
      // empty body
   } // end method passivate
   
   public void activate()
   {
       // empty body
   } // end method activate
   
   public void destroy()
   {
      // empty body
   } // end method activate
} // end class SessionBean

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
