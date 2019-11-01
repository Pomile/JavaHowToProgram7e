// Fig. 26.29: Options.java
// Page bean that stores language selections in a SessionBean property.
package com.deteil.howtoprogram.examples.ch26.Session.src.session;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.RadioButtonGroup;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import java.util.Properties;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Options extends AbstractPageBean
{
   private int __placeholder;
   
   private void _init() throws Exception
   {
      languageListOptions.setOptions(
         new com.sun.rave.web.ui.model.Option[] 
         { 
            new com.sun.rave.web.ui.model.Option( "Java", "Java" ), 
            new com.sun.rave.web.ui.model.Option( "C", "C" ), 
            new com.sun.rave.web.ui.model.Option( "C++", "C++" ), 
            new com.sun.rave.web.ui.model.Option( "Visual Basic 2005", 
               "Visual Basic 2005" ), 
            new com.sun.rave.web.ui.model.Option( "Visual C# 2005", 
               "Visual C# 2005" ) 
         }
      );
   } // end method init
   
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
   
   private RadioButtonGroup languageList = new RadioButtonGroup();
   
   public RadioButtonGroup getLanguageList()
   {
      return languageList;
   }
   
   public void setLanguageList(RadioButtonGroup rbg)
   {
      this.languageList = rbg;
   }
   
   private Hyperlink languagesLink = new Hyperlink();
   
   public Hyperlink getLanguagesLink()
   {
      return languagesLink;
   }
   
   public void setLanguagesLink(Hyperlink h)
   {
      this.languagesLink = h;
   }
   
   private Button submit = new Button();
   
   public Button getSubmit()
   {
      return submit;
   }
   
   public void setSubmit(Button b)
   {
      this.submit = b;
   }
   
   private Hyperlink recommendationsLink = new Hyperlink();
   
   public Hyperlink getRecommendationsLink()
   {
      return recommendationsLink;
   }
   
   public void setRecommendationsLink(Hyperlink h)
   {
      this.recommendationsLink = h;
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
   
   private StaticText responseLabel = new StaticText();
   
   public StaticText getResponseLabel()
   {
      return responseLabel;
   }
   
   public void setResponseLabel(StaticText st)
   {
      this.responseLabel = st;
   }
   
   private SingleSelectOptionsList languageListOptions = new SingleSelectOptionsList();
   
   public SingleSelectOptionsList getLanguageListOptions()
   {
      return languageListOptions;
   }
   
   public void setLanguageListOptions(SingleSelectOptionsList ssol)
   {
      this.languageListOptions = ssol;
   }
   
    private StaticText numSelected = new StaticText();

    public StaticText getNumSelected() {
        return numSelected;
    }

    public void setNumSelected(StaticText st) {
        this.numSelected = st;
    }

    private StaticText numSelectedLabel = new StaticText();

    public StaticText getNumSelectedLabel() {
        return numSelectedLabel;
    }

    public void setNumSelectedLabel(StaticText st) {
        this.numSelectedLabel = st;
    }
    
   private Properties books = new Properties();
    
   public Options()
   {
      // initialze the Properties object of values to be stored in 
      // the session bean.
      books.setProperty( "Java", "0-13-222220-5" );
      books.setProperty( "C", "0-13-142644-3" );
      books.setProperty( "C++", "0-13-185757-6" );
      books.setProperty( "Visual Basic 2005", "0-13-186900-0" );
      books.setProperty( "Visual C# 2005", "0-13-152523-9" );
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
         log( "Options Initialization Failure", e );
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
      // empty body
   } // end method prerender

   public void destroy()
   {
      // empty body
   } // end method destroy
   
   // action handler for the submit button, stores selected languages
   // in session scope for retrieval when making book recommendations.
   public String submit_action()
   {
      String msg = "Welcome to sessions!  You ";
      
      // if the user made a selection
      if ( getLanguageList().getSelected() != null )
      {
         String language = languageList.getSelected().toString();
         msg += "selected " + language + ".";
         
         // get ISBN number of book for the given language.
         String ISBN = books.getProperty( language );
         
         // add the selection to the SessionBean's Properties object
         Properties selections = getSessionBean().getSelectedLanguages();
         Object result = selections.setProperty( language, ISBN );
         
         // increment numSelections in the SessionBean and update
         // selectedLanguages if the user has not made this selection 
         // before
         if ( result == null )
         {
            int numSelected = getSessionBean().getNumSelections();
            getSessionBean().setNumSelections( ++numSelected );
         } // end if
      } // end if    
      else
         msg += "did not select a language.";
      
      responseLabel.setValue( msg );
      languageList.setRendered( false );
      languageLabel.setRendered( false );
      submit.setRendered( false );
      responseLabel.setRendered( true );
      numSelectedLabel.setRendered( true );
      numSelected.setRendered( true );
      languagesLink.setRendered( true );
      recommendationsLink.setRendered( true );
      return null;
   } // end method submit_action

   // redisplay the components used to allow the user to select a
   // language.
   public String languagesLink_action() 
   {
      responseLabel.setRendered( false );
      numSelectedLabel.setRendered( false );
      numSelected.setRendered( false );
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
