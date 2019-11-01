// Fig. 28.19: Reserve.java
// Page scope backing bean class for seat reservation client
package com.deteil.howtoprogram.examples.ch28.ReservationClient.src.com.deitel.jhtp7.ch28.reservationclient;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.StaticText;
import javax.faces.event.ValueChangeEvent;
import webservice.reservationservice.
   reservationservice.ReservationServiceClient;

public class Reserve extends AbstractPageBean 
{
   // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
   private int __placeholder;
    
   /**
    * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
    * This method is automatically generated, so any user-specified code inserted
    * here is subject to being replaced.</p>
    */
   private void _init() throws Exception {
      seatTypeDropDownListDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {new com.sun.rave.web.ui.model.Option("Window", "Window"), new com.sun.rave.web.ui.model.Option("Middle", "Middle"), new com.sun.rave.web.ui.model.Option("Aisle", "Aisle")});
      classDropDownListDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {new com.sun.rave.web.ui.model.Option("First", "First"), new com.sun.rave.web.ui.model.Option("Economy", "Economy")});
   }
    
   private Page page1 = new Page();
    
   public Page getPage1() {
      return page1;
   }
    
   public void setPage1(Page p) {
      this.page1 = p;
   }
    
   private Html html1 = new Html();
   
   public Html getHtml1() {
      return html1;
   }
    
   public void setHtml1(Html h) {
      this.html1 = h;
   }
    
   private Head head1 = new Head();
   
   public Head getHead1() {
      return head1;
   }
    
   public void setHead1(Head h) {
      this.head1 = h;
   }
    
   private Link link1 = new Link();
    
   public Link getLink1() {
      return link1;
   }
    
   public void setLink1(Link l) {
      this.link1 = l;
   }
    
   private Body body1 = new Body();
    
   public Body getBody1() {
      return body1;
   }
    
   public void setBody1(Body b) {
      this.body1 = b;
   }
    
   private Form form1 = new Form();
    
   public Form getForm1() {
      return form1;
   }
    
   public void setForm1(Form f) {
      this.form1 = f;
   }

   private DropDown seatTypeDropDownList = new DropDown();

   public DropDown getSeatTypeDropDownList() {
      return seatTypeDropDownList;
   }

   public void setSeatTypeDropDownList(DropDown dd) {
      this.seatTypeDropDownList = dd;
   }

   private SingleSelectOptionsList seatTypeDropDownListDefaultOptions = new SingleSelectOptionsList();

   public SingleSelectOptionsList getSeatTypeDropDownListDefaultOptions() {
      return seatTypeDropDownListDefaultOptions;
   }

   public void setSeatTypeDropDownListDefaultOptions(SingleSelectOptionsList ssol) {
      this.seatTypeDropDownListDefaultOptions = ssol;
   }

   private DropDown classDropDownList = new DropDown();

   public DropDown getClassDropDownList() {
      return classDropDownList;
   }

   public void setClassDropDownList(DropDown dd) {
      this.classDropDownList = dd;
   }

   private SingleSelectOptionsList classDropDownListDefaultOptions = new SingleSelectOptionsList();

   public SingleSelectOptionsList getClassDropDownListDefaultOptions() {
      return classDropDownListDefaultOptions;
   }

   public void setClassDropDownListDefaultOptions(SingleSelectOptionsList ssol) {
      this.classDropDownListDefaultOptions = ssol;
   }

   private Button reserveButton = new Button();

   public Button getReserveButton() {
      return reserveButton;
   }

   public void setReserveButton(Button b) {
      this.reserveButton = b;
   }

   private Label successLabel = new Label();

   public Label getSuccessLabel() {
      return successLabel;
   }

   public void setSuccessLabel(Label l) {
      this.successLabel = l;
   }

   private Label errorLabel = new Label();

   public Label getErrorLabel() {
      return errorLabel;
   }

   public void setErrorLabel(Label l) {
      this.errorLabel = l;
   }

   private Label instructionLabel = new Label();

   public Label getInstructionLabel() {
      return instructionLabel;
   }

   public void setInstructionLabel(Label l) {
      this.instructionLabel = l;
   }

   private ReservationServiceClient reservationServiceClient1 = new ReservationServiceClient();

   public ReservationServiceClient getReservationServiceClient1() {
      return reservationServiceClient1;
   }

   public void setReservationServiceClient1(ReservationServiceClient rsc) {
      this.reservationServiceClient1 = rsc;
   }

   // </editor-fold>

   // no-argument constructor
   public Reserve() 
   {
   } // end no-argument constructor

   /** 
    * <p>Return a reference to the scoped data bean.</p>
    */
   protected RequestBean1 getRequestBean1() {
      return (RequestBean1)getBean("RequestBean1");
   }


   /** 
    * <p>Return a reference to the scoped data bean.</p>
    */
   protected ApplicationBean1 getApplicationBean1() {
      return (ApplicationBean1)getBean("ApplicationBean1");
   }


   /** 
    * <p>Return a reference to the scoped data bean.</p>
    */
   protected SessionBean1 getSessionBean1() {
      return (SessionBean1)getBean("SessionBean1");
   }


   /** 
    * <p>Callback method that is called whenever a page is navigated to,
    * either directly via a URL, or indirectly via page navigation.
    * Customize this method to acquire resources that will be needed
    * for event handlers and lifecycle methods, whether or not this
    * page is performing post back processing.</p>
    * 
    * <p>Note that, if the current request is a postback, the property
    * values of the components do <strong>not</strong> represent any
    * values submitted with this request.  Instead, they represent the
    * property values that were saved for this view when it was rendered.</p>
    */
   public void init() {
      // Perform initializations inherited from our superclass
      super.init();
      // Perform application initialization that must complete
      // *before* managed components are initialized
      // TODO - add your own initialiation code here

      // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
      // Perform application initialization that must complete
      // *after* managed components are initialized
      // TODO - add your own initialization code here
   }

   /** 
    * <p>Callback method that is called after the component tree has been
    * restored, but before any event processing takes place.  This method
    * will <strong>only</strong> be called on a postback request that
    * is processing a form submit.  Customize this method to allocate
    * resources that will be required in your event handlers.</p>
    */
   public void preprocess() {
   }

   /** 
    * <p>Callback method that is called just before rendering takes place.
    * This method will <strong>only</strong> be called for the page that
    * will actually be rendered (and not, for example, on a page that
    * handled a postback and then navigated to a different page).  Customize
    * this method to allocate resources that will be required for rendering
    * this page.</p>
    */
   public void prerender() {
   }

   /** 
    * <p>Callback method that is called after rendering is completed for
    * this request, if <code>init()</code> was called (regardless of whether
    * or not this was the page that was actually rendered).  Customize this
    * method to release resources acquired in the <code>init()</code>,
    * <code>preprocess()</code>, or <code>prerender()</code> methods (or
    * acquired during execution of an event handler).</p>
    */
   public void destroy() {
   }

   // method that invokes the web service when user clicks Reserve button
   public String reserveButton_action() 
   {
      try
      {
         ReservationServiceClient client = getReservationServiceClient1();
         boolean reserved =  
            client.reserve( getSessionBean1().getSeatType(), 
               getSessionBean1().getClassType() );
         
         if ( reserved )
         {
            instructionLabel.setVisible( false );
            seatTypeDropDownList.setVisible( false );
            classDropDownList.setVisible( false );
            reserveButton.setVisible( false );
            successLabel.setVisible( true );
            errorLabel.setVisible( false );            
         } // end if
         else 
         {
            instructionLabel.setVisible( true );
            seatTypeDropDownList.setVisible( true );
            classDropDownList.setVisible( true );
            reserveButton.setVisible( true );
            successLabel.setVisible( false );
            errorLabel.setVisible( true );            
         } // end else
      } // end try
      catch ( Exception e )
      {
         e.printStackTrace();
      } // end catch
        
      return null;
   } // end method reserveButton_action

   // stores selected seat type in session bean
   public void seatTypeDropDownList_processValueChange(
      ValueChangeEvent event ) 
   {
      getSessionBean1().setSeatType( 
         ( String ) seatTypeDropDownList.getSelected() );
   } // end method seatTypeDropDownList_processValueChange
    
   // stores selected class in session bean
   public void classDropDownList_processValueChange(
      ValueChangeEvent event ) 
   {
      getSessionBean1().setClassType( 
         ( String ) classDropDownList.getSelected() );        
   } // end method classDropDownList_processValueChange
} // end class Reserve


/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
