<?xml version = "1.0" encoding = "UTF-8"?>

<!-- Fig. 26.17: Validation.jsp -->
<!-- JSP that demonstrates validation of user input. -->
<jsp:root version = "1.2" xmlns:f = "http://java.sun.com/jsf/core" 
   xmlns:h = "http://java.sun.com/jsf/html" xmlns:jsp = 
   "http://java.sun.com/JSP/Page" xmlns:ui = "http://www.sun.com/web/ui">
   <jsp:directive.page contentType = "text/html; charset = UTF-8" 
      pageEncoding = "UTF-8"/>
   <f:view>
      <ui:page binding = "#{Validation.page}" id = "page">
         <ui:html binding = "#{Validation.html}" id = "html">
            <ui:head binding = "#{Validation.head}" id = "head" 
               title = "Validation">
               <ui:link binding = "#{Validation.link}" id = "link" 
                  url = "/resources/stylesheet.css"/>
            </ui:head>
            <ui:body binding = "#{Validation.body}" focus = "form1:nameTF"
               id = "body" style = "-rave-layout: grid">
               <ui:form binding = "#{Validation.form}" id = "form">
                  <ui:staticText binding = "#{Validation.header}" id = 
                     "header" style = "font-size: 16px; height: 22px;
                     left: 24px; top: 24px; position: absolute; width:
                     456px" text = "Please fill out the following form."/>
                  <ui:staticText binding = "#{Validation.instructions}" 
                     id = "instructions" style = "font-size: 14px;
                     font-style: italic; left: 24px; top: 48px; position:
                     absolute; width: 406px" text = "All fields are 
                     required and must contain valid information."/>
                  <ui:textField binding = "#{Validation.nameTF}" columns =
                     "30" id = "nameTF" required = "true" style = "left: 
                     168px; top: 96px; position: absolute; width: 216px" 
                     validator = 
                     "#{Validation.nameLengthValidator.validate}"/>
                  <ui:textField binding="#{Validation.emailTF}" 
                     columns = "28" id = "emailTF" required = "true" 
                     style = "left: 168px; top: 144px; position: absolute; 
                     width: 216px" validator = 
                     "#{Validation.emailTF_validate}"/>
                  <ui:textField binding = "#{Validation.phoneTF}" 
                     columns = "30" id = "phoneTF" required = "true"
                     style = "left: 168px; top: 192px; position: absolute;
                     width: 216px" validator = 
                     "#{Validation.phoneTF_validate}"/>
                  <ui:label binding = "#{Validation.nameLabel}" for = 
                     "nameTF" id = "nameLabel" style = "font-weight:
                     normal; height: 24px; left: 24px; top: 96px;
                     position: absolute; width: 94px" text = "Name:"/>
                  <ui:label binding = "#{Validation.emailLabel}" for = 
                     "emailTF" id = "emailLabel" style = "font-weight:
                     normal; height: 24px; left: 24px; top: 144px;
                     position: absolute; width: 142px" text = 
                     "Email address:"/>
                  <ui:label binding = "#{Validation.phoneLabel}" for = 
                     "phoneTF" id = "phoneLabel" style = "font-weight:
                     normal; height: 24px; left: 24px; top: 192px;
                     position: absolute; width: 142px" text = 
                     "Phone number:"/>
                  <ui:button action = "#{Validation.submitButton_action}"
                     binding = "#{Validation.submitButton}" id = 
                     "submitButton" style = "left: 23px; top: 240px;
                     position: absolute; width: 72px" text = "Submit"/>
                  <ui:message binding = "#{Validation.emailMessage}" for =
                     "emailTF" id = "emailMessage" showDetail = "false" 
                     showSummary = "true" style = "left: 408px; top:
                     144px; position: absolute"/>
                  <ui:message binding = "#{Validation.phoneMessage}" for =
                     "phoneTF" id = "phoneMessage" showDetail = "false" 
                     showSummary = "true" style = "left: 408px; top:
                     192px; position: absolute"/>
                  <ui:message binding = "#{Validation.nameMessage}" for = 
                     "nameTF" id = "nameMessage" showDetail = "false" 
                     showSummary = "true" style = "left: 408px; top: 96px;
                     position: absolute"/>
                  <ui:staticText binding = "#{Validation.resultText}" 
                     escape = "false" id = "resultText" rendered = "false"
                     style = "height: 46px; left: 24px; top: 288px;
                     position: absolute; width: 312px" text = "Thank you 
                     for your submission.&#xa;&lt;br/&gt;We received the
                     following information:"/>
                  <h:panelGrid bgcolor = "seashell" binding = 
                     "#{Validation.gridPanel}" columns = "2" id = 
                     "gridPanel" rendered = "false" style = "height: 96px;
                     left: 24px; top: 288px; position: absolute" 
                     width = "312">
                     <ui:staticText binding = 
                        "#{Validation.nameResultLabel}" id = 
                        "nameResultLabel" text = "Name:"/>
                     <ui:staticText binding = "#{Validation.nameResult}" 
                        id = "nameResult"/>
                     <ui:staticText binding = 
                        "#{Validation.emailResultLabel}" id = 
                        "emailResultLabel" text = "E-mail address:"/>
                     <ui:staticText binding = "#{Validation.emailResult}" 
                        id = "emailResult"/>
                     <ui:staticText binding = 
                        "#{Validation.phoneResultLabel}" id = 
                        "phoneResultLabel" text = "Phone number:"/>
                     <ui:staticText binding = "#{Validation.phoneResult}" 
                        id = "phoneResult"/>
                  </h:panelGrid>
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
