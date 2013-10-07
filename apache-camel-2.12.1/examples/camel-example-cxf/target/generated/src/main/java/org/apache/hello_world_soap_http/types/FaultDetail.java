
package org.apache.hello_world_soap_http.types;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="minor" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="major" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
    "minor",
    "major"
})
@XmlRootElement(name = "faultDetail")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:00:10+05:30", comments = "JAXB RI v2.2.6")
public class FaultDetail {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:00:10+05:30", comments = "JAXB RI v2.2.6")
    protected short minor;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:00:10+05:30", comments = "JAXB RI v2.2.6")
    protected short major;

    /**
     * Gets the value of the minor property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:00:10+05:30", comments = "JAXB RI v2.2.6")
    public short getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:00:10+05:30", comments = "JAXB RI v2.2.6")
    public void setMinor(short value) {
        this.minor = value;
    }

    /**
     * Gets the value of the major property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:00:10+05:30", comments = "JAXB RI v2.2.6")
    public short getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-10-03T07:00:10+05:30", comments = "JAXB RI v2.2.6")
    public void setMajor(short value) {
        this.major = value;
    }

}
