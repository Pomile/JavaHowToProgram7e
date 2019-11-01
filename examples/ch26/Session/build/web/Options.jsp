<?xml version = "1.0" encoding = "UTF-8"?>

<!-- Fig. 26.26: Options.jsp -->
<!-- JSP file that allows the user to select a programming language. -->
<jsp:root version = "1.2" xmlns:f = "http://java.sun.com/jsf/core" 
   xmlns:h = "http://java.sun.com/jsf/html" xmlns:jsp =
   "http://java.sun.com/JSP/Page" xmlns:ui = "http://www.sun.com/web/ui">
   <jsp:directive.page contentType = "text/html; charset = UTF-8" 
      pageEncoding = "UTF-8"/>
   <f:view>
      <ui:page binding = "#{Options.page}" id = "page">
         <ui:html binding = "#{Options.html}" id = "html">
            <ui:head binding = "#{Options.head}" id = "head">
               <ui:link binding = "#{Options.link}" id = "link" 
                  url = "/resources/stylesheet.css"/>
            </ui:head>
            <ui:body binding = "#{Options.body}" id = "body" 
               style = "-rave-layout: grid">
               <ui:form binding = "#{Options.form}" id = "form">
                  <ui:label binding = "#{Options.languageLabel}" for =
                     "languageList" id = "languageLabel" style = 
                     "font-size: 16px; font-weight: bold; left: 24px; top:
                     24px; position: absolute" text = "Select a
                     programming language:"/>
                  <ui:radioButtonGroup binding = "#{Options.languageList}"
                     id = "languageList" items =   
                     "#{Options.languageListOptions.options}" style = 
                     "left: 24px; top: 48px; position: absolute"/>
                  <ui:button action = "#{Options.submit_action}" binding =
                     "#{Options.submit}" id = "submit" style = "left:
                     23px; top: 192px; position: absolute" text =
                     "Submit"/>
                  <ui:staticText binding = "#{Options.responseLabel}" id =
                     "responseLabel" rendered = "false" style = 
                     "font-size: 16px; font-weight: bold; height: 24px;
                     left: 24px; top: 24px; position: absolute;
                     width: 216px"/>
                  <ui:staticText binding = "#{Options.numSelectedLabel}" 
                     id = "numSelectedLabel" rendered = "false" style =
                     "left: 24px; top: 96px; position: absolute" text =
                     "Number of selections so far:"/>
                  <ui:staticText binding = "#{Options.numSelected}" id =
                     "numSelected" rendered = "false" style = "left: 
                     192px; top: 96px; position: absolute" text =
                     "#{SessionBean.numSelections}"/>
                  <ui:hyperlink action = "#{Options.languagesLink_action}"
                     binding = "#{Options.languagesLink}" id = 
                     "languagesLink" rendered = "false" style = "left:
                     24px; top: 144px; position: absolute" text = "Click
                     here to choose another language."/>
                  <ui:hyperlink binding = "#{Options.recommendationsLink}"
                     id = "recommendationsLink" rendered = "false" style =
                     "left: 24px; top: 168px; position: absolute" text =
                     "Click here to get book recommendations." url =
                     "/faces/Recommendations.jsp"/>
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
