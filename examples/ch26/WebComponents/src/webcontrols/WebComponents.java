// WebComponents.java
// Note: This file has not been edited, as this page has no functionality.
package com.deteil.howtoprogram.examples.ch26.WebComponents.src.webcontrols;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.ImageComponent;
import javax.faces.component.html.HtmlPanelGrid;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import com.sun.rave.web.ui.component.RadioButtonGroup;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Hyperlink;

public class WebComponents extends AbstractPageBean
{
   private int __placeholder;
   
   private void _init() throws Exception
   {
      booksDropDownDefaultOptions.setOptions(
         new com.sun.rave.web.ui.model.Option[]
         {
            new com.sun.rave.web.ui.model.Option( "VBHTP3e",
               "Visual Basic 2005 How to Program 3e" ),
               new com.sun.rave.web.ui.model.Option( "VCSHTP2e",
               "Visual C# How to Program 2e" ),
               new com.sun.rave.web.ui.model.Option( "JHTP7e",
               "Java How to Program 7e" ),
               new com.sun.rave.web.ui.model.Option( "CPPHTP5e",
               "C++ How to Program 5e" ),
               new com.sun.rave.web.ui.model.Option( "XHTP1e",
               "XML How to Program 1e")
         } 
      );
      osRadiooButtonGroupDefaultOptions.setOptions(
         new com.sun.rave.web.ui.model.Option[]
         {
            new com.sun.rave.web.ui.model.Option( "Windows XP",
               "Windows XP" ),
            new com.sun.rave.web.ui.model.Option( "Windows 2000",
               "Windows 2000" ),
            new com.sun.rave.web.ui.model.Option( "Windows NT",
               "Window NT" ),
            new com.sun.rave.web.ui.model.Option( "Linux","Linux" ),
            new com.sun.rave.web.ui.model.Option( "Other","Other" ) 
         }
      );
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
   
   private StaticText header = new StaticText();
   
   public StaticText getHeader()
   {
      return header;
   }
   
   public void setHeader(StaticText st)
   {
      this.header = st;
   }
   
   private StaticText instructions = new StaticText();
   
   public StaticText getInstructions()
   {
      return instructions;
   }
   
   public void setInstructions(StaticText st)
   {
      this.instructions = st;
   }
   
   private ImageComponent userImage = new ImageComponent();
   
   public ImageComponent getUserImage()
   {
      return userImage;
   }
   
   public void setUserImage(ImageComponent ic)
   {
      this.userImage = ic;
   }
   
   private HtmlPanelGrid gridPanel = new HtmlPanelGrid();
   
   public HtmlPanelGrid getGridPanel()
   {
      return gridPanel;
   }
   
   public void setGridPanel(HtmlPanelGrid hpg)
   {
      this.gridPanel = hpg;
   }
   
   private ImageComponent fnameImage = new ImageComponent();
   
   public ImageComponent getFnameImage()
   {
      return fnameImage;
   }
   
   public void setFnameImage(ImageComponent ic)
   {
      this.fnameImage = ic;
   }
   
   private TextField fnameTF = new TextField();
   
   public TextField getFnameTF()
   {
      return fnameTF;
   }
   
   public void setFnameTF(TextField tf)
   {
      this.fnameTF = tf;
   }
   
   private TextField lnameTF = new TextField();
   
   public TextField getLnameTF()
   {
      return lnameTF;
   }
   
   public void setLnameTF(TextField tf)
   {
      this.lnameTF = tf;
   }
   
   private ImageComponent lnameImage = new ImageComponent();
   
   public ImageComponent getLnameImage()
   {
      return lnameImage;
   }
   
   public void setLnameImage(ImageComponent ic)
   {
      this.lnameImage = ic;
   }
   
   private TextField emailTF = new TextField();
   
   public TextField getEmailTF()
   {
      return emailTF;
   }
   
   public void setEmailTF(TextField tf)
   {
      this.emailTF = tf;
   }
   
   private TextField phoneTF = new TextField();
   
   public TextField getPhoneTF()
   {
      return phoneTF;
   }
   
   public void setPhoneTF(TextField tf)
   {
      this.phoneTF = tf;
   }
   
   private ImageComponent emailImage = new ImageComponent();
   
   public ImageComponent getEmailImage()
   {
      return emailImage;
   }
   
   public void setEmailImage(ImageComponent ic)
   {
      this.emailImage = ic;
   }
   
   private ImageComponent phoneImage = new ImageComponent();
   
   public ImageComponent getPhoneImage()
   {
      return phoneImage;
   }
   
   public void setPhoneImage(ImageComponent ic)
   {
      this.phoneImage = ic;
   }
   
   private ImageComponent publicationImage = new ImageComponent();
   
   public ImageComponent getPublicationImage()
   {
      return publicationImage;
   }
   
   public void setPublicationImage(ImageComponent ic)
   {
      this.publicationImage = ic;
   }
   
   private StaticText publicationLabel = new StaticText();
   
   public StaticText getPublicationLabel()
   {
      return publicationLabel;
   }
   
   public void setPublicationLabel(StaticText st)
   {
      this.publicationLabel = st;
   }
   
   private DropDown booksDropDown = new DropDown();
   
   public DropDown getBooksDropDown()
   {
      return booksDropDown;
   }
   
   public void setBooksDropDown(DropDown dd)
   {
      this.booksDropDown = dd;
   }
   
   private SingleSelectOptionsList booksDropDownDefaultOptions = new SingleSelectOptionsList();
   
   public SingleSelectOptionsList getBooksDropDownDefaultOptions()
   {
      return booksDropDownDefaultOptions;
   }
   
   public void setBooksDropDownDefaultOptions(SingleSelectOptionsList ssol)
   {
      this.booksDropDownDefaultOptions = ssol;
   }
   
   private ImageComponent osImage = new ImageComponent();
   
   public ImageComponent getOsImage()
   {
      return osImage;
   }
   
   public void setOsImage(ImageComponent ic)
   {
      this.osImage = ic;
   }
   
   private Button registerButton = new Button();
   
   public Button getRegisterButton()
   {
      return registerButton;
   }
   
   public void setRegisterButton(Button b)
   {
      this.registerButton = b;
   }
   
   private StaticText osLabel = new StaticText();
   
   public StaticText getOsLabel()
   {
      return osLabel;
   }
   
   public void setOsLabel(StaticText st)
   {
      this.osLabel = st;
   }
   
   private Hyperlink deitelLink = new Hyperlink();
   
   public Hyperlink getDeitelLink()
   {
      return deitelLink;
   }
   
   public void setDeitelLink(Hyperlink h)
   {
      this.deitelLink = h;
   }
   
   private RadioButtonGroup osRadioButtonGroup = new RadioButtonGroup();
   
   public RadioButtonGroup getOsRadioButtonGroup()
   {
      return osRadioButtonGroup;
   }
   
   public void setOsRadioButtonGroup(RadioButtonGroup rbg)
   {
      this.osRadioButtonGroup = rbg;
   }
   
   private SingleSelectOptionsList osRadiooButtonGroupDefaultOptions = new SingleSelectOptionsList();
   
   public SingleSelectOptionsList getOsRadiooButtonGroupDefaultOptions()
   {
      return osRadiooButtonGroupDefaultOptions;
   }
   
   public void setOsRadiooButtonGroupDefaultOptions(SingleSelectOptionsList ssol)
   {
      this.osRadiooButtonGroupDefaultOptions = ssol;
   }
   
   public WebComponents()
   {
      // empty constructor
   } // end constructor
   
   protected RequestBean getRequestBean()
   {
      return (RequestBean) getBean( "RequestBean" ); 
   } // end method getRequestBean
   
   protected SessionBean getSessionBean()
   {
      return (SessionBean) getBean( "SessionBean" );
   } // end method getSessionBean
   
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
      catch (Exception e)
      {
         log( "WebComponents Initialization Failure", e );
         throw e instanceof FacesException ? (FacesException) e: 
            new FacesException( e );
      } //end catch
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
} // end class WebComponents

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

