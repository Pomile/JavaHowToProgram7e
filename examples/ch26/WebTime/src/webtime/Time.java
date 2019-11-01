// Fig 26.5: Time.java
// Page bean file that sets clockText to the time on the Web server.
package com.deteil.howtoprogram.examples.ch26.WebTime.src.webtime;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.StaticText;
import java.text.DateFormat;
import java.util.Date;

public class Time extends AbstractPageBean
{
   private int __placeholder;
   
   // auto-generated component initialization method.
   private void _init() throws Exception
   {
      // empty body
   } // end method _init
   
   private Page page = new Page();
   
   public Page getPage()
   {
      return page;
   } // end method getPage
   
   public void setPage( Page page )
   {
      this.page = page;
   } // end method setPage
   
   private Html html = new Html();
   
   public Html getHtml()
   {
      return html;
   } // end method getHtml
   
   public void setHtml( Html html )
   {
      this.html = html;
   } // end method setHtml
   
   private Head head = new Head();
   
   public Head getHead()
   {
      return head;
   } // end method getHead
   
   public void setHead( Head head )
   {
      this.head = head;
   } // end method setHead
   
   private Link link = new Link();
   
   public Link getLink()
   {
      return link;
   } // end method getLink
   
   public void setLink ( Link link )
   {
      this.link = link;
   } // end method setLink
   
   private Body body = new Body();
   
   public Body getBody()
   {
      return body;
   } // end method getBody
   
   public void setBody( Body body )
   {
      this.body = body;
   } // end method setBody
   
   private Form form = new Form();
   
   public Form getForm()
   {
      return form;
   } // end method getForm
   
   public void setForm( Form form )
   {
      this.form = form;
   } // end method setForm
   
   private StaticText timeHeader = new StaticText();
   
   public StaticText getTimeHeader()
   {
      return timeHeader;
   } // end method getTimeHeader
   
   public void setTimeHeader( StaticText st )
   {
      this.timeHeader = st;
   } // end method setTimeHeader

    private StaticText clockText = new StaticText();

    public StaticText getClockText() 
    {
        return clockText;
    } // end method getClockText

    public void setClockText(StaticText st) 
    {
        this.clockText = st;
    } // end method setClockText
   
   // Construct a new page bean instance
   public Time()
   {
      // empty constructor
   } // end constructor
   
   // Return a reference to the scoped data bean.
   protected RequestBean getRequestBean()
   {
      return (RequestBean) getBean( "RequestBean" );
   } // end method getRequestBean
   
   // Return a reference to the scoped data bean.
   protected ApplicationBean getApplicationBean()
   {
      return (ApplicationBean) getBean( "ApplicationBean" );
   } // end method getApplicationBean
   
   // Return a reference to the scoped data bean.
   protected SessionBean getSessionBean()
   {
      return (SessionBean) getBean( "SessionBean" );
   } // end method getSeesionBean
   
   // initializes page content
   public void init()
   {
      super.init();
      try
      {
         _init();
      } // end try
      catch ( Exception e )
      {
         log( "Time Initialization Failure", e );
         throw e instanceof FacesException ? ( FacesException ) e:
            new FacesException( e );
      } // end catch
   } // end method init

   // method called when a postback occurs.
   public void preprocess()
   {
      // empty body
   } // end method preprocess
   
   // method called before the page is rendered.
   public void prerender()
   {
      clockText.setValue( DateFormat.getTimeInstance(
         DateFormat.LONG ).format( new Date() ) );
   } // end method prerender
   
   // method called after rendering completes, if init was called.
   public void destroy()
   {
      // empty body
   } // end method destroy
} // end class Time

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