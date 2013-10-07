package org.apache.camel.example.reportincident;

import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-10-03T19:07:05.629+05:30
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "ReportIncidentEndpointService", 
                  wsdlLocation = "file:/home/chennareddy/Documents/apache-camel-2.12.1/examples/camel-example-reportincident-wssecurity/src/main/resources/etc/report_incident.wsdl",
                  targetNamespace = "http://reportincident.example.camel.apache.org") 
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30", comments = "Apache CXF 2.7.6")
public class ReportIncidentEndpointService extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public final static QName SERVICE = new QName("http://reportincident.example.camel.apache.org", "ReportIncidentEndpointService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public final static QName ReportIncidentService = new QName("http://reportincident.example.camel.apache.org", "ReportIncidentService");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/chennareddy/Documents/apache-camel-2.12.1/examples/camel-example-reportincident-wssecurity/src/main/resources/etc/report_incident.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReportIncidentEndpointService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/chennareddy/Documents/apache-camel-2.12.1/examples/camel-example-reportincident-wssecurity/src/main/resources/etc/report_incident.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public ReportIncidentEndpointService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public ReportIncidentEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public ReportIncidentEndpointService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public ReportIncidentEndpointService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public ReportIncidentEndpointService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public ReportIncidentEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ReportIncidentEndpoint
     */
    @WebEndpoint(name = "ReportIncidentService")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public ReportIncidentEndpoint getReportIncidentService() {
        return super.getPort(ReportIncidentService, ReportIncidentEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportIncidentEndpoint
     */
    @WebEndpoint(name = "ReportIncidentService")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:07:05.629+05:30")
    public ReportIncidentEndpoint getReportIncidentService(WebServiceFeature... features) {
        return super.getPort(ReportIncidentService, ReportIncidentEndpoint.class, features);
    }

}