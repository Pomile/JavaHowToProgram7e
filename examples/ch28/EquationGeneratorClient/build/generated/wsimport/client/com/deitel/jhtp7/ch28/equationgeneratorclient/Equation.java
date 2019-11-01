
package com.deteil.howtoprogram.examples.ch28.EquationGeneratorClient.build.generated.wsimport.client.com.deitel.jhtp7.ch28.equationgeneratorclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for equation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leftHandSide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leftOperand" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rightHandSide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rightOperand" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equation", propOrder = {
    "leftHandSide",
    "leftOperand",
    "operationType",
    "returnValue",
    "rightHandSide",
    "rightOperand"
})
public class Equation {

    protected String leftHandSide;
    protected int leftOperand;
    protected String operationType;
    protected int returnValue;
    protected String rightHandSide;
    protected int rightOperand;

    /**
     * Gets the value of the leftHandSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftHandSide() {
        return leftHandSide;
    }

    /**
     * Sets the value of the leftHandSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftHandSide(String value) {
        this.leftHandSide = value;
    }

    /**
     * Gets the value of the leftOperand property.
     * 
     */
    public int getLeftOperand() {
        return leftOperand;
    }

    /**
     * Sets the value of the leftOperand property.
     * 
     */
    public void setLeftOperand(int value) {
        this.leftOperand = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the returnValue property.
     * 
     */
    public int getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     */
    public void setReturnValue(int value) {
        this.returnValue = value;
    }

    /**
     * Gets the value of the rightHandSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightHandSide() {
        return rightHandSide;
    }

    /**
     * Sets the value of the rightHandSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightHandSide(String value) {
        this.rightHandSide = value;
    }

    /**
     * Gets the value of the rightOperand property.
     * 
     */
    public int getRightOperand() {
        return rightOperand;
    }

    /**
     * Sets the value of the rightOperand property.
     * 
     */
    public void setRightOperand(int value) {
        this.rightOperand = value;
    }

}
