
package org.apache.hello_world_soap_http;

import javax.annotation.Generated;
import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-10-03T19:00:10.657+05:30
 * Generated source version: 2.7.6
 */

@WebFault(name = "faultDetail", targetNamespace = "http://apache.org/hello_world_soap_http/types")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.657+05:30", comments = "Apache CXF 2.7.6")
public class PingMeFault extends Exception {
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.657+05:30")
    public static final long serialVersionUID = 1L;
    
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.657+05:30")
    private org.apache.hello_world_soap_http.types.FaultDetail faultDetail;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.657+05:30")
    public PingMeFault() {
        super();
    }
    
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.657+05:30")
    public PingMeFault(String message) {
        super(message);
    }
    
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.657+05:30")
    public PingMeFault(String message, Throwable cause) {
        super(message, cause);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.657+05:30")
    public PingMeFault(String message, org.apache.hello_world_soap_http.types.FaultDetail faultDetail) {
        super(message);
        this.faultDetail = faultDetail;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.657+05:30")
    public PingMeFault(String message, org.apache.hello_world_soap_http.types.FaultDetail faultDetail, Throwable cause) {
        super(message, cause);
        this.faultDetail = faultDetail;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.657+05:30")
    public org.apache.hello_world_soap_http.types.FaultDetail getFaultInfo() {
        return this.faultDetail;
    }
}