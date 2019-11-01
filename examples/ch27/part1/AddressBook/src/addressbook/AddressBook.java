// Fig. 27.8: AddressBook.java
// Page bean for adding a contact to the address book.
package com.deteil.howtoprogram.examples.ch27.part1.AddressBook.src.addressbook;

import com.sun.data.provider.RowKey;
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
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.component.MessageGroup;

public class AddressBook extends AbstractPageBean 
{
   private int __placeholder;

   private void _init() throws Exception 
   {
      addressesDataProvider.setCachedRowSet( 
         (javax.sql.rowset.CachedRowSet) 
            getValue( "#{SessionBean1.addressesRowSet}" ) );
      addressesTable.setInternalVirtualForm( true );
   }

   private Page page1 = new Page();
    
   public Page getPage1() 
   {
      return page1;
   }
    
   public void setPage1( Page p ) 
   {
      this.page1 = p;
   }
    
   private Html html1 = new Html();
    
   public Html getHtml1() 
   {
      return html1;
   }
    
   public void setHtml1( Html h ) 
   {
      this.html1 = h;
   }
    
   private Head head1 = new Head();
    
   public Head getHead1() 
   {
      return head1;
   }
    
   public void setHead1( Head h ) 
   {
      this.head1 = h;
   }
   
   private Link link1 = new Link();
    
   public Link getLink1() 
   {
      return link1;
   }
    
   public void setLink1( Link l ) 
   {
      this.link1 = l;
   }
    
   private Body body1 = new Body();
    
   public Body getBody1() 
   {
      return body1;
   }
    
   public void setBody1( Body b ) 
   {
      this.body1 = b;
   }
    
   private Form form1 = new Form();
    
   public Form getForm1() 
   {
      return form1;
   }
    
   public void setForm1( Form f ) 
   {
      this.form1 = f;
   }

   private StaticText staticText1 = new StaticText();

   public StaticText getStaticText1() 
   {
      return staticText1;
   }

   public void setStaticText1( StaticText st )  
   {
      this.staticText1 = st;
   }

   private TextField fnameTextField = new TextField();

   public TextField getFnameTextField() 
   {
      return fnameTextField;
   }

   public void setFnameTextField( TextField tf ) 
   {
      this.fnameTextField = tf;
   }

   private TextField lnameTextField = new TextField();

   public TextField getLnameTextField() 
   {
      return lnameTextField;
   }

   public void setLnameTextField( TextField tf ) 
   {
      this.lnameTextField = tf;
   }

   private TextField streetTextField = new TextField();

   public TextField getStreetTextField() 
   {
      return streetTextField;
   }

   public void setStreetTextField( TextField tf ) 
   {
      this.streetTextField = tf;
   }

   private TextField cityTextField = new TextField();

   public TextField getCityTextField() 
   {
      return cityTextField;
   }

   public void setCityTextField( TextField tf ) 
   {
      this.cityTextField = tf;
   }

   private TextField stateTextField = new TextField();

   public TextField getStateTextField() 
   {
      return stateTextField;
   }

   public void setStateTextField( TextField tf ) 
   {
      this.stateTextField = tf;
   }

   private TextField zipTextField = new TextField();

   public TextField getZipTextField() 
   {
      return zipTextField;
   }

   public void setZipTextField( TextField tf ) 
   {
      this.zipTextField = tf;
   }

   private Label fnameLabel = new Label();

   public Label getFnameLabel() 
   {
      return fnameLabel;
   }

   public void setFnameLabel( Label l ) 
   {
      this.fnameLabel = l;
   }

   private Label lnameLabel = new Label();

   public Label getLnameLabel() 
   {
      return lnameLabel;
   }

   public void setLnameLabel( Label l )  
   {
      this.lnameLabel = l;
   }

   private Label streetLabel = new Label();

   public Label getStreetLabel() 
   {
      return streetLabel;
   }

   public void setStreetLabel( Label l ) 
   {
      this.streetLabel = l;
   }

   private Label cityLabel = new Label();

   public Label getCityLabel() 
   {
      return cityLabel;
   }

   public void setCityLabel( Label l ) 
   {
      this.cityLabel = l;
   }

   private Label stateLabel = new Label();

   public Label getStateLabel() 
   {
      return stateLabel;
   }

   public void setStateLabel( Label l ) 
   {
      this.stateLabel = l;
   }

   private Label zipLabel = new Label();

   public Label getZipLabel() 
   {
      return zipLabel;
   }

   public void setZipLabel( Label l ) 
   {
      this.zipLabel = l;
   }

   private Button submitButton = new Button();

   public Button getSubmitButton() 
   {
      return submitButton;
   }

   public void setSubmitButton( Button b ) 
   {
      this.submitButton = b;
   }

   private Button clearButton = new Button();

   public Button getClearButton() 
   {
      return clearButton;
   }

   public void setClearButton( Button b ) 
   {
      this.clearButton = b;
   }

   private Table addressesTable = new Table();

   public Table getAddressesTable() 
   {
      return addressesTable;
   }

   public void setAddressesTable( Table t ) 
   {
      this.addressesTable = t;
   }

   private TableRowGroup tableRowGroup1 = new TableRowGroup();

   public TableRowGroup getTableRowGroup1() 
   {
      return tableRowGroup1;
   }

   public void setTableRowGroup1( TableRowGroup trg ) 
   {
      this.tableRowGroup1 = trg;
   }

   private CachedRowSetDataProvider addressesDataProvider = 
      new CachedRowSetDataProvider();

   public CachedRowSetDataProvider getAddressesDataProvider() 
   {
      return addressesDataProvider;
   }

   public void setAddressesDataProvider( CachedRowSetDataProvider crsdp ) 
   {
      this.addressesDataProvider = crsdp;
   }

   private TableColumn fnameColumn = new TableColumn();

   public TableColumn getFnameColumn() 
   {
      return fnameColumn;
   }

   public void setFnameColumn( TableColumn tc ) 
   {
      this.fnameColumn = tc;
   }

   private StaticText fnameHeader = new StaticText();

   public StaticText getFnameHeader() 
   {
      return fnameHeader;
   }

   public void setFnameHeader( StaticText st )  
   {
      this.fnameHeader = st;
   }

   private TableColumn lnameColumn = new TableColumn();

   public TableColumn getLnameColumn() 
   {
      return lnameColumn;
   }

   public void setLnameColumn( TableColumn tc ) 
   {
      this.lnameColumn = tc;
   }

   private StaticText lnameHeader = new StaticText();

   public StaticText getLnameHeader() 
   {
      return lnameHeader;
   }

   public void setLnameHeader( StaticText st ) 
   {
      this.lnameHeader = st;
   }

   private TableColumn streetColumn = new TableColumn();

   public TableColumn getStreetColumn() 
   {
      return streetColumn;
   }

   public void setStreetColumn(TableColumn tc) 
   {
      this.streetColumn = tc;
   }

   private StaticText streetHeader = new StaticText();

   public StaticText getStreetHeader() 
   {
      return streetHeader;
   }

   public void setStreetHeader( StaticText st ) 
   {
      this.streetHeader = st;
   }

   private TableColumn cityColumn = new TableColumn();

   public TableColumn getCityColumn() 
   {
      return cityColumn;
   }

   public void setCityColumn( TableColumn tc ) 
   {
      this.cityColumn = tc;
   }

   private StaticText cityHeader = new StaticText();

   public StaticText getCityHeader() 
   {
      return cityHeader;
   }

   public void setCityHeader( StaticText st ) 
   {
      this.cityHeader = st;
   }

   private TableColumn stateColumn = new TableColumn();

   public TableColumn getStateColumn() 
   {
      return stateColumn;
   }

   public void setStateColumn( TableColumn tc ) 
   {
      this.stateColumn = tc;
   }

   private StaticText stateHeader = new StaticText();

   public StaticText getStateHeader() 
   {
      return stateHeader;
   }

   public void setStateHeader( StaticText st ) 
   {
      this.stateHeader = st;
   }

   private TableColumn zipColumn = new TableColumn();

   public TableColumn getZipColumn() 
   {
      return zipColumn;
   }

   public void setZipColumn( TableColumn tc ) 
   {
      this.zipColumn = tc;
   }

   private StaticText zipHeader = new StaticText();

   public StaticText getZipHeader() 
   {
      return zipHeader;
   }

   public void setZipHeader( StaticText st ) 
   {
      this.zipHeader = st;
   }

   private MessageGroup messageGroup1 = new MessageGroup();

   public MessageGroup getMessageGroup1() 
   {
      return messageGroup1;
   }

   public void setMessageGroup1( MessageGroup mg ) 
   {
      this.messageGroup1 = mg;
   }

   public AddressBook() 
   {
   } // end AddressBook constructor

   protected RequestBean1 getRequestBean1() 
   {
       return (RequestBean1) getBean( "RequestBean1" );
   } // end method getRequestBean1

   protected ApplicationBean1 getApplicationBean1() 
   {
       return (ApplicationBean1) getBean( "ApplicationBean1" );
   } // end method getApplicationBean1

   protected SessionBean1 getSessionBean1() 
   {
       return (SessionBean1) getBean( "SessionBean1" );
   } // end method getSessionBean1

   public void init() 
   {
      // Perform initializations inherited from our superclass
      super.init();
 
      // initialize automatically managed components
      try 
      {
         _init();
      }
      catch (Exception e) 
      {
         log("Page1 Initialization Failure", e);
         throw e instanceof FacesException ? (FacesException) e : 
            new FacesException(e);
      }
   }

   public void preprocess() 
   {
   } // end method preprocess

   public void prerender() 
   {
      addressesDataProvider.refresh();
   } // end method prerender

   public void destroy() 
   {
      addressesDataProvider.close();
   } // end method destroy

   // action handler that adds a contact to the AddressBook database
   // when the user clicks submit
   public String submitButton_action() 
   {
      if ( addressesDataProvider.canAppendRow() ) 
      {
         try 
         {
            RowKey rk = addressesDataProvider.appendRow();
            addressesDataProvider.setCursorRow(rk);
            
            addressesDataProvider.setValue( "ADDRESSES.FIRSTNAME",
               fnameTextField.getValue() );
            addressesDataProvider.setValue( "ADDRESSES.LASTNAME",
               lnameTextField.getValue() );
            addressesDataProvider.setValue( "ADDRESSES.STREET",
               streetTextField.getValue() );
            addressesDataProvider.setValue( "ADDRESSES.CITY",
               cityTextField.getValue() );
            addressesDataProvider.setValue( "ADDRESSES.STATE",
               stateTextField.getValue() );
            addressesDataProvider.setValue( "ADDRESSES.ZIP",
               zipTextField.getValue());
            addressesDataProvider.commitChanges();
            
            // reset text fields
            lnameTextField.setValue( "" );
            fnameTextField.setValue( "" );
            streetTextField.setValue( "" );
            cityTextField.setValue( "" );
            stateTextField.setValue( "" );
            zipTextField.setValue( "" );
         } // end try
         catch ( Exception ex ) 
         {
            error( "The address book was not updated.  " +
               ex.getMessage() );
         } // end catch
      } // end if

      return null;
   } // end method submitButton_action
} // end class AddressBook

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