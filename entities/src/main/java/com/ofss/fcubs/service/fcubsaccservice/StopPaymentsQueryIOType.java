
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopPayments-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPayments-Query-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STOP_PAYMENT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPayments-Query-IO-Type", propOrder = {
    "stoppaymentno"
})
public class StopPaymentsQueryIOType {

    @XmlElement(name = "STOP_PAYMENT_NO")
    protected String stoppaymentno;

    /**
     * Gets the value of the stoppaymentno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOPPAYMENTNO() {
        return stoppaymentno;
    }

    /**
     * Sets the value of the stoppaymentno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOPPAYMENTNO(String value) {
        this.stoppaymentno = value;
    }

}
