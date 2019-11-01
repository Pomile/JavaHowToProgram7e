<?xml version="1.0" encoding="UTF-8"?>

<!-- Fig. 27.6: AddressBook.jsp -->
<!-- AddressBook JSP with an add form and a Table JSF component. -->

<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" 
   xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp=
   "http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
   <jsp:directive.page contentType="text/html;charset = UTF-8" 
      pageEncoding="UTF-8"/>
   <f:view>
      <ui:page binding="#{AddressBook.page1}" id="page1">
         <ui:html binding="#{AddressBook.html1}" id="html1">
            <ui:head binding="#{AddressBook.head1}" id="head1">
               <ui:link binding="#{AddressBook.link1}" id="link1" 
                  url="/resources/stylesheet.css"/>
            </ui:head>
            <ui:body binding="#{AddressBook.body1}" id="body1" 
               style="-rave-layout: grid">
               <ui:form binding="#{AddressBook.form1}" id="form1">
                  <ui:staticText binding="#{AddressBook.staticText1}" id=
                     "staticText1" style="font-size: 18px; left: 24px; 
                     top: 24px; position: absolute" 
                     text="Add a contact to the address book:"/>
                  <ui:textField binding="#{AddressBook.fnameTextField}" 
                     id="fnameTextField" maxLength="20" required="true" 
                     style="left: 120px; top: 72px; position: absolute; 
                     width: 192px"/>
                  <ui:textField binding="#{AddressBook.lnameTextField}" 
                     id="lnameTextField" maxLength="30" required="true" 
                     style="left: 432px; top: 72px; position: absolute; 
                     width: 240px"/>
                  <ui:textField binding="#{AddressBook.streetTextField}" 
                     id="streetTextField" maxLength="100" required="true" 
                     style="left: 120px; top: 96px; position: absolute; 
                     width: 552px"/>
                  <ui:textField binding="#{AddressBook.cityTextField}" 
                     id="cityTextField" maxLength="30" required="true" 
                     style="left: 120px; top: 120px; position: absolute"/>
                  <ui:textField binding="#{AddressBook.stateTextField}" 
                     id="stateTextField" maxLength="2" required="true" 
                     style="left: 456px; top: 120px; position: absolute; 
                     width: 48px"/>
                  <ui:textField binding="#{AddressBook.zipTextField}" 
                     id="zipTextField" maxLength="5" required="true" 
                     style="left: 576px; top: 120px; position: absolute; 
                     width: 96px"/>
                  <ui:label binding="#{AddressBook.fnameLabel}" for=
                     "fnameTextField" id="fnameLabel" style="position: 
                     absolute; left: 24px; top: 72px" text="First Name:"/>
                  <ui:label binding="#{AddressBook.lnameLabel}" for=
                     "lnameTextField" id="lnameLabel" style="left: 336px;
                     top: 72px; position: absolute" text="Last Name:"/>
                  <ui:label binding="#{AddressBook.streetLabel}" for=
                     "streetTextField" id="streetLabel" style="position: 
                     absolute; left: 24px; top: 96px" text="Street:"/>
                  <ui:label binding="#{AddressBook.cityLabel}" for=
                     "cityTextField" id="cityLabel" style="position: 
                     absolute; left: 24px; top: 120px" text="City:"/>
                  <ui:label binding="#{AddressBook.stateLabel}" for=
                     "stateTextField" id="stateLabel" style="position: 
                     absolute; left: 384px; top: 120px" text="State:"/>
                  <ui:label binding="#{AddressBook.zipLabel}" for=
                     "zipTextField" id="zipLabel" style="left: 528px; top:
                     120px; position: absolute" text="Zip:"/>
                  <ui:button action="#{AddressBook.submitButton_action}" 
                     binding="#{AddressBook.submitButton}" id=
                     "submitButton" primary="true" style="position: 
                     absolute; left: 120px; top: 168px" text="Submit"/>
                  <ui:button binding="#{AddressBook.clearButton}" id=
                     "clearButton" reset="true" style="left: 215px; top: 
                     168px; position: absolute" text="Clear"/>
                  <ui:table augmentTitle="false" binding=
                     "#{AddressBook.addressesTable}" id="addressesTable" 
                     paginationControls="true" style="left: 24px; top: 
                     216px; position: absolute; width: 360px" 
                     title="Contacts" width="720">
                  <script><![CDATA[
                  /* ----- Functions for Table Preferences Panel ----- */
                  /*
                   * Toggle the table preferences panel open or closed
                   */
                  function togglePreferencesPanel() 
                  {
                     var table = document.getElementById("form1:table1");
                     table.toggleTblePreferencesPanel();
                  }
                  /* ----- Functions for Filter Panel ----- */
                  /*
                   * Return true if the filter menu has actually changed,
                   * so the corresponding event should be allowed to continue.
                   */
                  function filterMenuChanged() 
                  {
                     var table = document.getElementById("form1:table1");
                     return table.filterMenuChanged();
                  }
                  /*
                   * Toggle the custom filter panel (if any) open or closed.
                   */
                  function toggleFilterPanel() 
                  {
                     var table = document.getElementById("form1:table1");
                     return table.toggleTableFilterPanel();
                  }
                  /* ----- Functions for Table Actions ----- */
                  /*
                   * Initialize all rows of the table when the state
                   * of selected rows changes.
                   */
                  function initAllRows() 
                  {
                     var table = document.getElementById("form1:table1");
                     table.initAllRows();
                  }
                  /*
                   * Set the selected state for the given row groups
                   * displayed in the table.  This functionality requires
                   * the 'selectId' of the tableColumn to be set.
                   *
                   * @param rowGroupId HTML element id of the tableRowGroup component
                   * @param selected Flag indicating whether components should be selected
                   */
                  function selectGroupRows(rowGroupId, selected) 
                  {
                     var table = document.getElementById("form1:table1");
                     table.selectGroupRows(rowGroupId, selected);
                  }
                  /*
                   * Disable all table actions if no rows have been selected.
                   */
                  function disableActions() 
                  {
                     // Determine whether any rows are currently selected
                     var table = document.getElementById("form1:table1");
                     var disabled = (table.getAllSelectedRowsCount() > 0) ? false : true;
                     // Set disabled state for top actions
                     document.getElementById("form1:table1:tableActionsTop:deleteTop").setDisabled(disabled);
                     // Set disabled state for bottom actions
                     document.getElementById("form1:table1:tableActionsBottom:deleteBottom").setDisabled(disabled);
                  }]]></script>
                     <ui:tableRowGroup binding=
                        "#{AddressBook.tableRowGroup1}" id=
                        "tableRowGroup1" rows="5" sourceData=
                        "#{AddressBook.addressesDataProvider}" 
                        sourceVar="currentRow">
                        <ui:tableColumn binding=
                           "#{AddressBook.fnameColumn}" headerText=
                           "First Name" id="fnameColumn" sort=
                           "ADDRESSES.FIRSTNAME">
                           <ui:staticText binding=
                              "#{AddressBook.fnameHeader}" id=
                               "fnameHeader" text="#{currentRow.value[
                               'ADDRESSES.FIRSTNAME']}"/>
                        </ui:tableColumn>
                        <ui:tableColumn binding=
                           "#{AddressBook.lnameColumn}" headerText=
                           "Last Name" id="lnameColumn" 
                           sort="ADDRESSES.LASTNAME">
                           <ui:staticText binding=
                              "#{AddressBook.lnameHeader}" id=
                              "lnameHeader" text="#{currentRow.value[
                              'ADDRESSES.LASTNAME']}"/>
                        </ui:tableColumn>
                        <ui:tableColumn binding=
                           "#{AddressBook.streetColumn}" headerText=
                           "Street" id="streetColumn" 
                           sort="ADDRESSES.STREET">
                           <ui:staticText binding=
                              "#{AddressBook.streetHeader}" id=
                              "streetHeader" text="#{currentRow.value[
                              'ADDRESSES.STREET']}"/>
                        </ui:tableColumn>
                        <ui:tableColumn binding=
                           "#{AddressBook.cityColumn}" headerText="City"
                           id="cityColumn" sort="ADDRESSES.CITY">
                           <ui:staticText binding=
                              "#{AddressBook.cityHeader}" id="cityHeader"
                              text="#{currentRow.value[
                              'ADDRESSES.CITY']}"/>
                        </ui:tableColumn>
                        <ui:tableColumn binding=
                           "#{AddressBook.stateColumn}" headerText="State"
                           id="stateColumn" sort="ADDRESSES.STATE">
                           <ui:staticText binding=
                              "#{AddressBook.stateHeader}" id=
                              "stateHeader" text="#{currentRow.value[
                              'ADDRESSES.STATE']}"/>
                        </ui:tableColumn>
                        <ui:tableColumn binding=
                           "#{AddressBook.zipColumn}" headerText="Zip" 
                           id="zipColumn" sort="ADDRESSES.ZIP">
                           <ui:staticText binding=
                              "#{AddressBook.zipHeader}" id="zipHeader"
                              text="#{currentRow.value[
                              'ADDRESSES.ZIP']}"/>
                        </ui:tableColumn>
                     </ui:tableRowGroup>
                  </ui:table>
                  <ui:messageGroup binding="#{AddressBook.messageGroup1}"
                     id="messageGroup1" showGlobalOnly="true" style=
                     "position: absolute; left: 24px; top: 624px"/>
               </ui:form>
            </ui:body>
         </ui:html>
      </ui:page>
   </f:view>
</jsp:root>

<!-- (C) Copyright 1992-2007 by Deitel & Associates, Inc. and          -->
<!-- Pearson Education, Inc. All Rights Reserved.                      -->
<!--                                                                   -->
<!-- DISCLAIMER: The authors and publisher of this book have used their-->
<!-- best efforts in preparing the book. These efforts include the     -->
<!-- development, research, and testing of the theories and programs   -->
<!-- to determine their effectiveness. The authors and publisher make  -->
<!-- no warranty of any kind, expressed or implied, with regard to     -->
<!-- these programs or to the documentation contained in these books.  -->
<!-- The authors and publisher shall not be liable in any event for    -->
<!-- incidental or consequential damages in connection with, or        -->
<!-- arising out of, the furnishing, performance, or use of these      -->
<!-- programs.                                                         -->
