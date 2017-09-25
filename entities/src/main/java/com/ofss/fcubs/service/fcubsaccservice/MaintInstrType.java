
package com.ofss.fcubs.service.fcubsaccservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MaintInstrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintInstrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MAINTINSTR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAINTINSTR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAINTINSTR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAINTINSTR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DTOFLSTMAINT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="INSTR1WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTR2WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTR3WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTR4WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintInstrType", propOrder = {
    "maintinstr1",
    "maintinstr2",
    "maintinstr3",
    "maintinstr4",
    "dtoflstmaint",
    "instr1WHEN",
    "instr2WHEN",
    "instr3WHEN",
    "instr4WHEN"
})
public class MaintInstrType {

    @XmlElement(name = "MAINTINSTR1")
    protected String maintinstr1;
    @XmlElement(name = "MAINTINSTR2")
    protected String maintinstr2;
    @XmlElement(name = "MAINTINSTR3")
    protected String maintinstr3;
    @XmlElement(name = "MAINTINSTR4")
    protected String maintinstr4;
    @XmlElement(name = "DTOFLSTMAINT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtoflstmaint;
    @XmlElement(name = "INSTR1WHEN")
    protected String instr1WHEN;
    @XmlElement(name = "INSTR2WHEN")
    protected String instr2WHEN;
    @XmlElement(name = "INSTR3WHEN")
    protected String instr3WHEN;
    @XmlElement(name = "INSTR4WHEN")
    protected String instr4WHEN;

    /**
     * Gets the value of the maintinstr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAINTINSTR1() {
        return maintinstr1;
    }

    /**
     * Sets the value of the maintinstr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAINTINSTR1(String value) {
        this.maintinstr1 = value;
    }

    /**
     * Gets the value of the maintinstr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAINTINSTR2() {
        return maintinstr2;
    }

    /**
     * Sets the value of the maintinstr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAINTINSTR2(String value) {
        this.maintinstr2 = value;
    }

    /**
     * Gets the value of the maintinstr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAINTINSTR3() {
        return maintinstr3;
    }

    /**
     * Sets the value of the maintinstr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAINTINSTR3(String value) {
        this.maintinstr3 = value;
    }

    /**
     * Gets the value of the maintinstr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAINTINSTR4() {
        return maintinstr4;
    }

    /**
     * Sets the value of the maintinstr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAINTINSTR4(String value) {
        this.maintinstr4 = value;
    }

    /**
     * Gets the value of the dtoflstmaint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTOFLSTMAINT() {
        return dtoflstmaint;
    }

    /**
     * Sets the value of the dtoflstmaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTOFLSTMAINT(XMLGregorianCalendar value) {
        this.dtoflstmaint = value;
    }

    /**
     * Gets the value of the instr1WHEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTR1WHEN() {
        return instr1WHEN;
    }

    /**
     * Sets the value of the instr1WHEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTR1WHEN(String value) {
        this.instr1WHEN = value;
    }

    /**
     * Gets the value of the instr2WHEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTR2WHEN() {
        return instr2WHEN;
    }

    /**
     * Sets the value of the instr2WHEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTR2WHEN(String value) {
        this.instr2WHEN = value;
    }

    /**
     * Gets the value of the instr3WHEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTR3WHEN() {
        return instr3WHEN;
    }

    /**
     * Sets the value of the instr3WHEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTR3WHEN(String value) {
        this.instr3WHEN = value;
    }

    /**
     * Gets the value of the instr4WHEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTR4WHEN() {
        return instr4WHEN;
    }

    /**
     * Sets the value of the instr4WHEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTR4WHEN(String value) {
        this.instr4WHEN = value;
    }

}
