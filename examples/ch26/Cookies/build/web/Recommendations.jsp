<?xml version="1.0" encoding="UTF-8"?>
<!-- Fig. 26.23: Recommendations.jsp -->
<!-- Displays book recommendations using cookies -->
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html; charset = UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Recommendations.page}" id="page">
            <ui:html binding="#{Recommendations.html}" id="html">
                <ui:head binding="#{Recommendations.head}" id="head" title="Recommendations">
                    <ui:link binding="#{Recommendations.link}" id="link" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Recommendations.body}" id="body" style="-rave-layout: grid">
                    <ui:form binding="#{Recommendations.form}" id="form">
                        <ui:label binding="#{Recommendations.languageLabel}" for="booksListBox" id="languageLabel"
                            style="font-size: 20px; font-weight: bold; left: 24px; top:                      24px; position: absolute" text="Recommendations"/>
                        <ui:listbox binding="#{Recommendations.booksListBox}" id="booksListBox"
                            items="#{Recommendations.                      booksListBoxOptions.options}" rows="6" style="left: 24px; top: 72px; position: absolute;                      width: 360px"/>
                        <ui:hyperlink action="case1" binding="#{Recommendations.optionsLink}" id="optionsLink"
                            style="left: 24px; top: 192px; position: absolute" text="Click here to choose another language."/>
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
