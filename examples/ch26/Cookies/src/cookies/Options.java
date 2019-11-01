// Fig. 26.22: Options.java
// Page bean that stores user's language selection as a cookie on the
// client.
package com.deteil.howtoprogram.examples.ch26.Cookies.src.cookies;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.RadioButtonGroup;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.Button;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.util.Properties;

public class Options extends AbstractPageBean
{
   private int __placeholder;
   
   // method _init initializes components and sets the
   // options for the radio button group.
   private void _init() throws Exception
   {
      languageListOptions.setOptions(
         new com.sun.rave.web.ui.model.Option[]
         {
            new com.sun.rave.web.ui.model.Option( "Java", "Java" ),
            new com.sun.rave.web.ui.model.Option( "C", "C" ),
            new com.sun.rave.web.ui.model.Option( "C++", "C++" ),
            new com.sun.rave.web.ui.model.Option( "Visual/Basic/2005",
               "Visual Basic 2005" ),
            new com.sun.rave.web.ui.model.Option( "Visual/C#/2005",
               "Visual C# 2005")
         } 
      );
   } // end method _init
   
   private Page page = new Page();
   
   public Page getPage()
   {
      return page;
   } // end method getPage1
   
   public void setPage( Page p )
   {
      this.page = p;
   } // end method setPage1
   
   private Html html = new Html();
   
   public Html getHtml()
   {
      return html;
   } // end method getHtml
   
   public void setHtml( Html h )
   {
      this.html = h;
   } // end method setHtml
   
   private Head head = new Head();
   
   public Head getHead()
   {
      return head;
   } // end method getHead1
   
   public void setHead( Head h )
   {
      this.head = h;
   } // end method setHead1
   
   private Link link = new Link();
   
   public Link getLink()
   {
      return link;
   } // end method getLink1
   
   public void setLink( Link l )
   {
      this.link = l;
   } // end method setLink1
   
   private Body body = new Body();
   
   public Body getBody()
   {
      return body;
   } // end method getBody1
   
   public void setBody( Body b )
   {
      this.body = b;
   } // end method setBody1
   
   private Form form = new Form();
   
   public Form getForm()
   {
      return form;
   } // end method getForm1
   
   public void setForm( Form f )
   {
      this.form = f;
   }  // end method setForm1
   
   private Label languageLabel = new Label();
   
   public Label getLanguageLabel()
   {
      return languageLabel;
   } // end method getLanguageLabel
   
   public void setLanguageLabel( Label l )
   {
      this.languageLabel = l;
   } // end method setLanguageLabel
   
   private RadioButtonGroup languageList = new RadioButtonGroup();
   
   public RadioButtonGroup getLanguageList()
   {
      return languageList;
   } // end method getLanguagesList
   
   public void setLanguageList( RadioButtonGroup rbg )
   {
      this.languageList = rbg;
   } // end method setLanguageList
   
   private SingleSelectOptionsList languageListOptions =
      new SingleSelectOptionsList();
   
   public SingleSelectOptionsList getLanguageListOptions()
   {
      return languageListOptions;
   } // end method getLanguageListDefaultOptions
   
   public void setLanguageListOptions(
      SingleSelectOptionsList ssol )
   {
      this.languageListOptions = ssol;
   } // end method setLanguageListDefaultOptions
   
   private StaticText responseLabel = new StaticText();
   
   public StaticText getResponseLabel()
   {
      return responseLabel;
   } // end method getResponseLabel
   
   public void setResponseLabel( StaticText st )
   {
      this.responseLabel = st;
   } // end method setResponse Label
   
   private Hyperlink languagesLink = new Hyperlink();
   
   public Hyperlink getLanguagesLink()
   {
      return languagesLink;
   } // end method getLanguageLink
   
   public void setLanguagesLink( Hyperlink h )
   {
      this.languagesLink = h;
   } // end method setLanguageLink
   
   private Hyperlink recommendationsLink = new Hyperlink();
   
   public Hyperlink getRecommendationsLink()
   {
      return recommendationsLink;
   } // end method getRecommendationLink
   
   public void setRecommendationsLink( Hyperlink h )
   {
      this.recommendationsLink = h;
   } // end method setRecommendationLink
   
   private Button submit = new Button();
   
   public Button getSubmit()
   {
      return submit;
   } // end method getSubmit
   
   public void setSubmit( Button b )
   {
      this.submit = b;
   } // end method setSubmit
   
   private Properties books = new Properties();
   
   // Construct a new page bean instance and initialize the properties
   // that map languages to ISBN numbers of recommended books.
   public Options()
   {
      // initialze the Properties object of values to be stored as
      // cookies.
      books.setProperty( "Java", "0-13-222220-5" );
      books.setProperty( "C", "0-13-142644-3" );
      books.setProperty( "C++", "0-13-185757-6" );
      books.setProperty( "Visual/Basic/2005", "0-13-186900-0" );
      books.setProperty( "Visual/C#/2005", "0-13-152523-9" );
   } // end Options constructor
   
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
         log( "Options Initialization Failure", e );
         throw e instanceof FacesException ? ( FacesException ) e:
            new FacesException( e );
      } // end catch
   } // end method init
   
   public void preprocess()
   {
      // empty body
   } // end method preprocess
   
   public void prerender()
   {
      // empty body
   } // end method prerender
   
   public void destroy()
   {
      // empty body
   } // end method destroy
   
   // Action handler for the Submit button.  Checks to see if a language
   // was selected and if so, registers a cookie for that language and
   // sets the responseLabel to indicate the chosen language.
   public String submit_action()
   {
      String msg = "Welcome to Cookies!  You ";
      
      // if the user made a selection
      if ( languageList.getSelected() != null )
      {
         String language = languageList.getSelected().toString();
         String displayLanguage = language.replace( '/', ' ' );
         msg += "selected " + displayLanguage + ".";
         
         // get ISBN number of book for the given language.
         String ISBN = books.getProperty( language );
         
         // create cookie using language-ISBN name-value pair
         Cookie cookie = new Cookie( language, ISBN );
         
         // add cookie to the response header to place it on the user's
         // machine
         HttpServletResponse response =
            (HttpServletResponse) getExternalContext().getResponse();
         response.addCookie( cookie );
      } // end if
      else
         msg += "did not select a language.";
      
      responseLabel.setValue( msg );
      languageList.setRendered( false );
      languageLabel.setRendered( false );
      submit.setRendered( false );
      responseLabel.setRendered( true );
      languagesLink.setRendered( true );
      recommendationsLink.setRendered( true );
      return null; // reloads the page
   } // end method submit_action
   
   // redisplay the components used to allow the user to select a 
   // language.
   public String languagesLink_action()
   {
      responseLabel.setRendered( false );
      languagesLink.setRendered( false );
      recommendationsLink.setRendered( false );
      languageList.setRendered( true );
      languageLabel.setRendered( true );
      submit.setRendered( true );
      return null;
   } // end method languagesLink_action
} // end class Options

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