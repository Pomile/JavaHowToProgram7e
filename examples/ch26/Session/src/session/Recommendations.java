// Fig. 26.32: Recommendations.java
// Page bean that displays book recommendations based on a SessionBean
// property.
package com.deteil.howtoprogram.examples.ch26.Session.src.session;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.Listbox;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.model.DefaultOptionsList;
import java.util.Enumeration;
import com.sun.rave.web.ui.model.Option;
import java.util.Properties;

public class Recommendations extends AbstractPageBean
{
   private int __placeholder;
   
   private void _init() throws Exception
   {
   }
   
   private Page page = new Page();
   
   public Page getPage()
   {
      return page;
   }
   
   public void setPage(Page p)
   {
      this.page = p;
   }
   
   private Html html = new Html();
   
   public Html getHtml()
   {
      return html;
   }
   
   public void setHtml(Html h)
   {
      this.html = h;
   }
   
   private Head head = new Head();
   
   public Head getHead()
   {
      return head;
   }
   
   public void setHead(Head h)
   {
      this.head = h;
   }
   
   private Link link = new Link();
   
   public Link getLink()
   {
      return link;
   }
   
   public void setLink(Link l)
   {
      this.link = l;
   }
   
   private Body body = new Body();
   
   public Body getBody()
   {
      return body;
   }
   
   public void setBody(Body b)
   {
      this.body = b;
   }
   
   private Form form = new Form();
   
   public Form getForm()
   {
      return form;
   }
   
   public void setForm(Form f)
   {
      this.form = f;
   }
   
   private Listbox booksListBox = new Listbox();
   
   public Listbox getBooksListBox()
   {
      return booksListBox;
   }
   
   public void setBooksListBox(Listbox l)
   {
      this.booksListBox = l;
   }
   
   private Label languageLabel = new Label();
   
   public Label getLanguageLabel()
   {
      return languageLabel;
   }
   
   public void setLanguageLabel(Label l)
   {
      this.languageLabel = l;
   }
   
   private Hyperlink optionsLink = new Hyperlink();
   
   public Hyperlink getOptionsLink()
   {
      return optionsLink;
   }
   
   public void setOptionsLink(Hyperlink h)
   {
      this.optionsLink = h;
   }
   
   private DefaultOptionsList booksListBoxDefaultOptions = new DefaultOptionsList();
   
   public DefaultOptionsList getBooksListBoxDefaultOptions()
   {
      return booksListBoxDefaultOptions;
   }
   
   public void setBooksListBoxDefaultOptions(DefaultOptionsList dol)
   {
      this.booksListBoxDefaultOptions = dol;
   }
   
   // Construct a new Page bean instance.
   public Recommendations()
   {
      // empty constructor
   } // end constructor
    
   protected RequestBean getRequestBean()
   {
      return (RequestBean) getBean( "RequestBean" );
   } // end method getRequestBean
   
   protected ApplicationBean getApplicationBean()
   {
      return (ApplicationBean) getBean( "ApplicationBean" );
   } // end method getApplicationBean
  
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
      //retrieve user's selections and number of selections made
      Properties languages = getSessionBean().getSelectedLanguages();
      Enumeration selectionsEnum = languages.propertyNames();
      int numSelected = getSessionBean().getNumSelections();
         
      Option [] recommendations;
      
      // if at least one selection was made
      if ( numSelected > 0 )
      {
         recommendations = new Option[ numSelected ];

         for( int i = 0; i < numSelected; i++ )
         {
            String language = (String) selectionsEnum.nextElement() ;
            recommendations[ i ] = new Option( language + 
               " How to Program.  ISBN#: " + 
               languages.getProperty( language ) );
         } // end for
      } // end if
      else
      {
         recommendations = new Option[ 1 ];
         recommendations[ 0 ] = new Option( 
            "No recommendations. Please select a language." );
      } // end else

      booksListBox.setItems( recommendations );
   } // end method prerender

   public void destroy()
   {
      // empty body
   } // end method destry
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
