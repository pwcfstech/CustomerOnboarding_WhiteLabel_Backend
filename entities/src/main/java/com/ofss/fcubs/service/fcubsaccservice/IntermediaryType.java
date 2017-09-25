
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntermediaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntermediaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INTERMEDIARY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INTERMEDIARY_RATIO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntermediaryType", propOrder = {
    "intermediarycode",
    "intermediaryratio"
})
public class IntermediaryType {

    @XmlElement(name = "INTERMEDIARY_CODE", required = true)
    protected String intermediarycode;
    @XmlElement(name = "INTERMEDIARY_RATIO", required = true)
    protected BigDecimal intermediaryratio;

    /**
     * Gets the value of the intermediarycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERMEDIARYCODE() {
        return intermediarycode;
    }

    /**
     * Sets the value of the intermediarycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERMEDIARYCODE(String value) {
        this.intermediarycode = value;
    }

    /**
     * Gets the value of the intermediaryratio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTERMEDIARYRATIO() {
        return intermediaryratio;
    }

    /**
     * Sets the value of the intermediaryratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTERMEDIARYRATIO(BigDecimal value) {
        this.intermediaryratio = value;
    }

}
