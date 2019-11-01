// Fig. 26.24: Recommendations.java
// Displays book recommendations based on cookies storing user's selected
// programming languages.
package com.deteil.howtoprogram.examples.ch26.Cookies.src.cookies;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.Listbox;
import com.sun.rave.web.ui.model.DefaultOptionsList;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.model.Option;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Cookie;
import com.sun.rave.web.ui.component.HiddenField;

public class Recommendations extends AbstractPageBean
{
   private int __placeholder;
   
   private void _init() throws Exception
   {
      // empty body
   } // end method _init()
   
   private Page page = new Page();
   
   public Page getPage()
   {
      return page;
   } // end method getPage1
   
   public void setPage(Page p)
   {
      this.page = p;
   } // end method setPage1
   
   private Html html = new Html();
   
   public Html getHtml()
   {
      return html;
   } // end method getHtml1
   
   public void setHtml(Html h)
   {
      this.html = h;
   } // end method setHtml1
   
   private Head head = new Head();
   
   public Head getHead()
   {
      return head;
   } // end method getHead1
   
   public void setHead(Head h)
   {
      this.head = h;
   } // end method setHead1
   
   private Link link = new Link();
   
   public Link getLink()
   {
      return link;
   } // end method getLink1
   
   public void setLink(Link l)
   {
      this.link = l;
   } // end method setLink1
   
   private Body body = new Body();
   
   public Body getBody()
   {
      return body;
   } // end method getBody1
   
   public void setBody(Body b)
   {
      this.body = b;
   } // end method setBody1
   
   private Form form = new Form();
   
   public Form getForm()
   {
      return form;
   } // end method getForm1
   
   public void setForm(Form f)
   {
      this.form = f;
   } // end method setForm1
   
   private Listbox booksListBox = new Listbox();
   
   public Listbox getBooksListBox()
   {
      return booksListBox;
   } // end method getBooksListBox
   
   public void setBooksListBox(Listbox l)
   {
      this.booksListBox = l;
   } // end method setBooksListBox
   
   private DefaultOptionsList booksListBoxOptions = new DefaultOptionsList();
   
   public DefaultOptionsList getBooksListBoxOptions()
   {
      return booksListBoxOptions;
   } // end method getBooksListBoxDefaultOptions
   
   public void setBooksListBoxOptions(DefaultOptionsList dol)
   {
      this.booksListBoxOptions = dol;
   } // end method setBooksListBoxDefaultOptions
   
   private Label languageLabel = new Label();
   
   public Label getLanguageLabel()
   {
      return languageLabel;
   } // end method getLanguageLabel1
   
   public void setLanguageLabel(Label l)
   {
      this.languageLabel = l;
   } // end method setLanguageLabel1
   
   private Hyperlink optionsLink = new Hyperlink();
   
   public Hyperlink getOptionsLink()
   {
      return optionsLink;
   } // end method getHyperlink1
   
   public void setOptionsLink(Hyperlink h)
   {
      this.optionsLink = h;
   }
   
   public Recommendations()
   {
      // empty constructor
   } // end constructor
   
   protected ApplicationBean getApplicationBean()
   {
      return (ApplicationBean) getBean( "ApplicationBean" );
   } // end method getApplicationBean
   
   protected RequestBean getRequestBean()
   {
      return (RequestBean) getBean( "RequestBean" );
   } // end method getRequestBean
   
   protected SessionBean getSessionBean()
   {
      return (SessionBean) getBean( "SessionBean" );
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
         log( "Recommendations Initialization Failure", e );
         throw e instanceof FacesException ? (FacesException) e:
            new FacesException( e );
      } // end catch
   } // end method init
   
   public void preprocess()
   {
      // empty body
   } // end method preprocess
   
   public void prerender()
   {
      //retrieve client's cookies
      HttpServletRequest request =
         (HttpServletRequest)getExternalContext().getRequest();
      Cookie [] cookies = request.getCookies();
      
      // if there are cookies, store the corresponding books and ISBN
      // numbers in an array of Options
      Option [] recommendations;

      if ( cookies.length > 1 )
      {
         recommendations = new Option[ cookies.length - 1 ];

         for ( int i = 0; i < cookies.length - 1; i++ )
         {
            String language =
               cookies[ i ].getName().replace( '/', ' ' );
            recommendations[ i ] = new Option( language + 
               " How to Program.  ISBN#: " + cookies[ i ].getValue() );
         } // end for
      } // end if
      else
      {
         recommendations = new Option[ 1 ];
         recommendations[ 0 ] = new Option( 
            "No recommendations. Please select a language." ) ;
      } // end else
      
      booksListBox.setItems( recommendations );
   } // end method prerender
   
   public void destroy()
   {
      // empty body
   } // end method destroy
} // end class Recommendations

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