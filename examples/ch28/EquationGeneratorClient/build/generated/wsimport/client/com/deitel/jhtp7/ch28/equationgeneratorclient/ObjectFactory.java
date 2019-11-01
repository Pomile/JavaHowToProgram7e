
package com.deteil.howtoprogram.examples.ch28.EquationGeneratorClient.build.generated.wsimport.client.com.deitel.jhtp7.ch28.equationgeneratorclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.deitel.jhtp7.ch28.equationgeneratorclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenerateEquationResponse_QNAME = new QName("http://equationgenerator.ch28.jhtp7.deitel.com/", "generateEquationResponse");
    private final static QName _GenerateEquation_QNAME = new QName("http://equationgenerator.ch28.jhtp7.deitel.com/", "generateEquation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.deitel.jhtp7.ch28.equationgeneratorclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerateEquationResponse }
     * 
     */
    public GenerateEquationResponse createGenerateEquationResponse() {
        return new GenerateEquationResponse();
    }

    /**
     * Create an instance of {@link GenerateEquation }
     * 
     */
    public GenerateEquation createGenerateEquation() {
        return new GenerateEquation();
    }

    /**
     * Create an instance of {@link Equation }
     * 
     */
    public Equation createEquation() {
        return new Equation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateEquationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://equationgenerator.ch28.jhtp7.deitel.com/", name = "generateEquationResponse")
    public JAXBElement<GenerateEquationResponse> createGenerateEquationResponse(GenerateEquationResponse value) {
        return new JAXBElement<GenerateEquationResponse>(_GenerateEquationResponse_QNAME, GenerateEquationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateEquation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://equationgenerator.ch28.jhtp7.deitel.com/", name = "generateEquation")
    public JAXBElement<GenerateEquation> createGenerateEquation(GenerateEquation value) {
        return new JAXBElement<GenerateEquation>(_GenerateEquation_QNAME, GenerateEquation.class, null, value);
    }

}
