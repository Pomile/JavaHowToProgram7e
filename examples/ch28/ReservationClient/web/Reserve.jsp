<?xml version="1.0" encoding="UTF-8"?>
<!-- Fig. 28.18 Reserve.jsp -->
<!-- JSP that allows a user to select a seat -->

<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" 
   xmlns:h="http://java.sun.com/jsf/html" 
   xmlns:jsp="http://java.sun.com/JSP/Page" 
   xmlns:ui="http://www.sun.com/web/ui">
   <jsp:directive.page contentType="text/html;charset=UTF-8" 
      pageEncoding="UTF-8"/>
   <f:view>
      <ui:page binding="#{Reserve.page1}" id="page1">
         <ui:html binding="#{Reserve.html1}" id="html1">
         <ui:head binding="#{Reserve.head1}" id="head1">
            <ui:link binding="#{Reserve.link1}" id="link1" 
               url="/resources/stylesheet.css"/>
         </ui:head>
         <ui:body binding="#{Reserve.body1}" id="body1" 
            style="-rave-layout: grid">
            <ui:form binding="#{Reserve.form1}" id="form1">
               <ui:label binding="#{Reserve.instructionLabel}" 
                  id="instructionLabel"  
                  style="left: 24px; top: 24px; position: absolute" 
                  text="Please select the seat type and class to 
                  reserve:"/>
               <ui:dropDown binding="#{Reserve.seatTypeDropDownList}" 
                  id="seatTypeDropDownList" items=
                  "#{Reserve.seatTypeDropDownListDefaultOptions.options}" 
                  style="left: 24px; top: 48px; position: absolute; 
                  width: 96px" valueChangeListener=
                  "#{Reserve.seatTypeDropDownList_processValueChange}"/>
               <ui:dropDown binding="#{Reserve.classDropDownList}" 
                  id="classDropDownList" items=
                  "#{Reserve.classDropDownListDefaultOptions.options}"
                  style="left: 144px; top: 48px; position: absolute; 
                  width: 96px" valueChangeListener=
                  "#{Reserve.classDropDownList_processValueChange}"/>
               <ui:button action="#{Reserve.reserveButton_action}" 
                  binding="#{Reserve.reserveButton}" id="reserveButton" 
                  primary="true" style= "height: 22px; left: 263px; 
                  top: 48px; position: absolute" text="Reserve"/>
               <ui:label binding="#{Reserve.successLabel}" 
                  id="successLabel" style="left: 24px; top: 24px; 
                  position: absolute" text="Your reservation has been 
                  made. Thank you!" visible="false"/>
               <ui:label binding="#{Reserve.errorLabel}" id="errorLabel" 
                  style="color: red; left: 24px; top: 96px; 
                  position: absolute" text="This type of seat is not 
                  available. Please modify your request and try again." 
                  visible="false"/>
            </ui:form>
         </ui:body>
         </ui:html>
      </ui:page>
   </f:view>
</jsp:root>
