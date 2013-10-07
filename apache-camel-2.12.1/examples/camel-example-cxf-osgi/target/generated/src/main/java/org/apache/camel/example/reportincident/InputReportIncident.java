
package org.apache.camel.example.reportincident;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incidentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="incidentDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "incidentId",
    "incidentDate",
    "givenName",
    "familyName",
    "summary",
    "details",
    "email",
    "phone"
})
@XmlRootElement(name = "inputReportIncident")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
public class InputReportIncident {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    protected String incidentId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    protected String incidentDate;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    protected String givenName;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    protected String familyName;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    protected String summary;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    protected String details;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    protected String email;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    protected String phone;

    /**
     * Gets the value of the incidentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public String getIncidentId() {
        return incidentId;
    }

    /**
     * Sets the value of the incidentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public void setIncidentId(String value) {
        this.incidentId = value;
    }

    /**
     * Gets the value of the incidentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public String getIncidentDate() {
        return incidentDate;
    }

    /**
     * Sets the value of the incidentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public void setIncidentDate(String value) {
        this.incidentDate = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:01:45+05:30", comments = "JAXB RI v2.2.6")
    public void setPhone(String value) {
        this.phone = value;
    }

}
