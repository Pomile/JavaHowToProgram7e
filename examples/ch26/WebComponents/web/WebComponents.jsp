<?xml version="1.0" encoding="UTF-8"?>
<!-- Fig.26.16: WebComponents.jsp -->
<!-- Registration form that demonstrates JSF components -->
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html; charset = UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{WebComponents.page}" id="page">
            <ui:html binding="#{WebComponents.html}" id="html">
                <ui:head binding="#{WebComponents.head}" id="head">
                    <ui:link binding="#{WebComponents.link}" id="link" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{WebComponents.body}" id="body" style="-rave-layout: grid">
                    <ui:form binding="#{WebComponents.form}" id="form">
                        <ui:staticText binding="#{WebComponents.header}" id="header"
                            style="font-size: 18px; left: 24px;                       top: 24px; position: absolute" text="This is a                       sample registration form."/>
                        <ui:staticText binding="#{WebComponents.instructions}" id="instructions"
                            style="font-style: italic;                      left: 24px; top: 72px; position: absolute" text="Please fill in all fields and click Register."/>
                        <ui:image binding="#{WebComponents.userImage}" id="userImage" style="left: 24px; top: 120px;                      position: absolute" url="/resources/user.JPG"/>
                        <h:panelGrid binding="#{WebComponents.gridPanel}" columns="4" id="gridPanel"
                            style="height: 96px;                      left: 24px; top: 168px; position: absolute" width="576">
                            <ui:image binding="#{WebComponents.fnameImage}" id="fnameImage" url="/resources/fname.JPG"/>
                            <ui:textField binding="#{WebComponents.fnameTF}" id="fnameTF"/>
                            <ui:image binding="#{WebComponents.lnameImage}" id="lnameImage" url="/resources/lname.JPG"/>
                            <ui:textField binding="#{WebComponents.lnameTF}" id="lnameTF"/>
                            <ui:image binding="#{WebComponents.emailImage}" id="emailImage" url="/resources/email.JPG"/>
                            <ui:textField binding="#{WebComponents.emailTF}" id="emailTF"/>
                            <ui:image binding="#{WebComponents.phoneImage}" id="phoneImage" url="/resources/phone.JPG"/>
                            <ui:textField binding="#{WebComponents.phoneTF}" id="phoneTF" label="Must be in the form (555)                         555-5555"/>
                        </h:panelGrid>
                        <ui:image binding="#{WebComponents.publicationImage}" id="publicationImage"
                            style="position: absolute;                      left: 24px; top: 288px" url="/resources/publications.JPG"/>
                        <ui:staticText binding="#{WebComponents.publicationLabel}" id="publicationLabel"
                            style="left: 240px; top: 288px;                      position: absolute" text="Which book would you like                      information about?"/>
                        <ui:dropDown binding="#{WebComponents.booksDropDown}" id="booksDropDown"
                            items="#{WebComponents.                      booksDropDownDefaultOptions.options}" style="left:                      24px; top: 336px; position: absolute; width: 240px"/>
                        <ui:hyperlink binding="#{WebComponents.deitelLink}" id="deitelLink"
                            style="left: 24px; top: 384px;                      position: absolute" target="_blank"
                            text="Click                      here to view more information about our books." url="http://www.deitel.com"/>
                        <ui:image binding="#{WebComponents.osImage}" id="osImage" style="left: 24px; top: 432px; position:                      absolute" url="/resources/os.JPG"/>
                        <ui:staticText binding="#{WebComponents.osLabel}" id="osLabel" style="left: 216px; top: 432px; position:                      absolute" text="Which operating system are you                      using?"/>
                        <ui:radioButtonGroup binding="#{WebComponents.osRadioButtonGroup}" id="osRadioButtonGroup"
                            items="#{WebComponents.                      osRadiooButtonGroupDefaultOptions.options}" style="position: absolute; left: 24px; top: 480px"/>
                        <ui:button binding="#{WebComponents.registerButton}" id="registerButton"
                            style="left: 23px; top:                      648px; position: absolute" text="Register"/>
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
