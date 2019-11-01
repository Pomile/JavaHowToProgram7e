
package com.deteil.howtoprogram.examples.ch28.EquationGeneratorClient.build.generated.wsimport.client.com.deitel.jhtp7.ch28.equationgeneratorclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generateEquationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generateEquationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://equationgenerator.ch28.jhtp7.deitel.com/}equation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateEquationResponse", propOrder = {
    "_return"
})
public class GenerateEquationResponse {

    @XmlElement(name = "return")
    protected Equation _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Equation }
     *     
     */
    public Equation getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equation }
     *     
     */
    public void setReturn(Equation value) {
        this._return = value;
    }

}
