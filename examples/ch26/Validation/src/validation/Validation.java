// Fig. 26.18: Validation.java
// Page bean for validating user input and redisplaying that input if
// valid.
package com.deteil.howtoprogram.examples.ch26.Validation.src.validation;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Message;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.validator.LengthValidator;

public class Validation extends AbstractPageBean
{
   private int __placeholder;
   
   private void _init() throws Exception
   {
       nameLengthValidator.setMaximum( 30 );
   }
   
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
   } // end method getHtml1
   
   public void setHtml( Html h )
   {
      this.html = h;
   } // end method setHtml1
   
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
   } // end method setForm1
   
   private StaticText header = new StaticText();
   
   public StaticText getHeader()
   {
      return header;
   } // end method getHeader
   
   public void setHeader( StaticText st )
   {
      this.header = st;
   } // end method setHeader
   
   private StaticText instructions = new StaticText();
   
   public StaticText getInstructions()
   {
      return instructions;
   } // end method getStaticText2
   
   public void setInstructions( StaticText st )
   {
      this.instructions = st;
   } // end method setStaticText2
   
   private TextField phoneTF = new TextField();
   
   public TextField getPhoneTF()
   {
      return phoneTF;
   } // end method getPhoneTF
   
   public void setPhoneTF( TextField tf )
   {
      this.phoneTF = tf;
   } // end method setPhoneTF
   
   private TextField nameTF = new TextField();
   
   public TextField getNameTF()
   {
      return nameTF;
   } // end method getNameTF
   
   public void setNameTF( TextField tf )
   {
      this.nameTF = tf;
   } // end method setNameTF
   
   private TextField emailTF = new TextField();
   
   public TextField getEmailTF()
   {
      return emailTF;
   } // end method getEmqilTF
   
   public void setEmailTF( TextField tf )
   {
      this.emailTF = tf;
   } // end method setEMailTF
   
   private Label nameLabel = new Label();
   
   public Label getNameLabel()
   {
      return nameLabel;
   } // end method getNameLabel
   
   public void setNameLabel( Label l )
   {
      this.nameLabel = l;
   } // end method setNameLabel
   
   private Label emailLabel = new Label();
   
   public Label getEmailLabel()
   {
      return emailLabel;
   } // end method getEmailLabel
   
   public void setEmailLabel( Label l )
   {
      this.emailLabel = l;
   } // end method setEmailLabel
   
   private Label phoneLabel = new Label();
   
   public Label getPhoneLabel()
   {
      return phoneLabel;
   } // end method getPhoneLabel
   
   public void setPhoneLabel( Label l )
   {
      this.phoneLabel = l;
   } // end method setPhoneLabel
   
   private Button submitButton = new Button();
   
   public Button getSubmitButton()
   {
      return submitButton;
   } // end method getSubmit
   
   public void setSubmitButton( Button b )
   {
      this.submitButton = b;
   } // end method setSubmit
   
   private Message emailMessage = new Message();
   
   public Message getEmailMessage()
   {
      return emailMessage;
   } // end method getEmailMessage
   
   public void setEmailMessage( Message m )
   {
      this.emailMessage = m;
   } // end method setEmailMessage
   
   private Message phoneMessage = new Message();
   
   public Message getPhoneMessage()
   {
      return phoneMessage;
   } // end method getMessage2
   
   public void setPhoneMessage( Message m )
   {
      this.phoneMessage = m;
   } // end method setMessage2
   
   private Message nameMessage = new Message();
   
   public Message getNameMessage()
   {
      return nameMessage;
   } // end method getMessage1
   
   public void setNameMessage( Message m )
   {
      this.nameMessage = m;
   } // end method setMessage1
   
   private StaticText resultText = new StaticText();
   
   public StaticText getResultText()
   {
      return resultText;
   } // end method getResultText
   
   public void setResultText( StaticText st )
   {
      this.resultText = st;
   } // end method setResultText
   
   private HtmlPanelGrid gridPanel = new HtmlPanelGrid();
   
   public HtmlPanelGrid getGridPanel()
   {
      return gridPanel;
   } // end method getGridPanel1
   
   public void setGridPanel( HtmlPanelGrid hpg )
   {
      this.gridPanel = hpg;
   } // end method setGridPanel1

    private StaticText nameResultLabel = new StaticText();

    public StaticText getNameResultLabel() {
        return nameResultLabel;
    }

    public void setNameResultLabel(StaticText st) {
        this.nameResultLabel = st;
    }

    private StaticText nameResult = new StaticText();

    public StaticText getNameResult() {
        return nameResult;
    }

    public void setNameResult(StaticText st) {
        this.nameResult = st;
    }

    private StaticText emailResultLabel = new StaticText();

    public StaticText getEmailResultLabel() {
        return emailResultLabel;
    }

    public void setEmailResultLabel(StaticText st) {
        this.emailResultLabel = st;
    }

    private StaticText emailResult = new StaticText();

    public StaticText getEmailResult() {
        return emailResult;
    }

    public void setEmailResult(StaticText st) {
        this.emailResult = st;
    }

    private StaticText phoneResultLabel = new StaticText();

    public StaticText getPhoneResultLabel() {
        return phoneResultLabel;
    }

    public void setPhoneResultLabel(StaticText st) {
        this.phoneResultLabel = st;
    }

    private StaticText phoneResult = new StaticText();

    public StaticText getPhoneResult() {
        return phoneResult;
    }

    public void setPhoneResult(StaticText st) {
        this.phoneResult = st;
    }

    private LengthValidator nameLengthValidator = new LengthValidator();

    public LengthValidator getNameLengthValidator() {
        return nameLengthValidator;
    }

    public void setNameLengthValidator(LengthValidator lv) {
        this.nameLengthValidator = lv;
    }

   public Validation()
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
         log( "Validation Initialization Failure", e );
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
   
   // validates entered email address against the regular expression
   // that represents the form of a valid email address.
   public void emailTF_validate( FacesContext context,
      UIComponent component, Object value )
   {
      String email = String.valueOf( value );
      
      // if entered email address is not in a valid format
      if ( !email.matches(
         "\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*" ) )
      {
         throw new ValidatorException( new FacesMessage( 
            "Enter a valid email address, e.g. user@domain.com" ) );
      } // end if
   } // end method emailTF_validate
   
   // validates entered email address against the regular expression
   // that represents the form of a valid email address.
   public void phoneTF_validate( FacesContext context,
      UIComponent component, Object value )
   {
      String phone = String.valueOf( value );
      
      // if entered phone number is not in a valid format
      if ( !phone.matches( 
         "((\\(\\d{3}\\) ?)|(\\d{3}-))?\\d{3}-\\d{4}" ) )
      {
         throw new ValidatorException( new FacesMessage( 
            "Enter a valid phone number, e.g. (555) 555-1234" ) );
      } // end if
   } // end method phoneTF_validate
   
   public String submitButton_action()
   {
      String name = String.valueOf( nameTF.getValue() );
      String email = String.valueOf( emailTF.getValue() );
      String phone = String.valueOf( phoneTF.getValue() );
      nameResult.setValue( name );
      emailResult.setValue( email );
      phoneResult.setValue( phone );
      gridPanel.setRendered( true );
      resultText.setRendered( true );
      return null;
   } // end method submitButton_action
} // end class Validation

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
