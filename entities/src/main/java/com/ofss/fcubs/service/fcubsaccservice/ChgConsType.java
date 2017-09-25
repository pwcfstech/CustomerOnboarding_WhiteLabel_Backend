
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChgConsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChgConsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHGPROD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WAIVEPROD" type="{http://fcubs.ofss.com/service/FCUBSAccService}YesNoType" minOccurs="0"/>
 *         &lt;element name="PRODMAPSTAT" type="{http://fcubs.ofss.com/service/FCUBSAccService}RecStatType" minOccurs="0"/>
 *         &lt;element name="MINAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MAXAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DISCPC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DISCAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChgConsType", propOrder = {
    "chgprod",
    "waiveprod",
    "prodmapstat",
    "minamt",
    "maxamt",
    "discpc",
    "discamt",
    "chgccy",
    "prddesc"
})
public class ChgConsType {

    @XmlElement(name = "CHGPROD", required = true)
    protected String chgprod;
    @XmlElement(name = "WAIVEPROD")
    @XmlSchemaType(name = "string")
    protected YesNoType waiveprod;
    @XmlElement(name = "PRODMAPSTAT")
    @XmlSchemaType(name = "string")
    protected RecStatType prodmapstat;
    @XmlElement(name = "MINAMT")
    protected BigDecimal minamt;
    @XmlElement(name = "MAXAMT")
    protected BigDecimal maxamt;
    @XmlElement(name = "DISCPC")
    protected BigDecimal discpc;
    @XmlElement(name = "DISCAMT")
    protected BigDecimal discamt;
    @XmlElement(name = "CHGCCY")
    protected String chgccy;
    @XmlElement(name = "PRDDESC")
    protected String prddesc;

    /**
     * Gets the value of the chgprod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGPROD() {
        return chgprod;
    }

    /**
     * Sets the value of the chgprod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGPROD(String value) {
        this.chgprod = value;
    }

    /**
     * Gets the value of the waiveprod property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getWAIVEPROD() {
        return waiveprod;
    }

    /**
     * Sets the value of the waiveprod property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setWAIVEPROD(YesNoType value) {
        this.waiveprod = value;
    }

    /**
     * Gets the value of the prodmapstat property.
     * 
     * @return
     *     possible object is
     *     {@link RecStatType }
     *     
     */
    public RecStatType getPRODMAPSTAT() {
        return prodmapstat;
    }

    /**
     * Sets the value of the prodmapstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecStatType }
     *     
     */
    public void setPRODMAPSTAT(RecStatType value) {
        this.prodmapstat = value;
    }

    /**
     * Gets the value of the minamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMINAMT() {
        return minamt;
    }

    /**
     * Sets the value of the minamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMINAMT(BigDecimal value) {
        this.minamt = value;
    }

    /**
     * Gets the value of the maxamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXAMT() {
        return maxamt;
    }

    /**
     * Sets the value of the maxamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXAMT(BigDecimal value) {
        this.maxamt = value;
    }

    /**
     * Gets the value of the discpc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDISCPC() {
        return discpc;
    }

    /**
     * Sets the value of the discpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDISCPC(BigDecimal value) {
        this.discpc = value;
    }

    /**
     * Gets the value of the discamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDISCAMT() {
        return discamt;
    }

    /**
     * Sets the value of the discamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDISCAMT(BigDecimal value) {
        this.discamt = value;
    }

    /**
     * Gets the value of the chgccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGCCY() {
        return chgccy;
    }

    /**
     * Sets the value of the chgccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGCCY(String value) {
        this.chgccy = value;
    }

    /**
     * Gets the value of the prddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDDESC() {
        return prddesc;
    }

    /**
     * Sets the value of the prddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDDESC(String value) {
        this.prddesc = value;
    }

}
