package org.apache.hello_world_soap_http;

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
 * 2013-10-03T19:00:10.764+05:30
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "SOAPService", 
                  wsdlLocation = "file:/home/chennareddy/Documents/apache-camel-2.12.1/examples/camel-example-cxf/src/main/resources/wsdl/hello_world.wsdl",
                  targetNamespace = "http://apache.org/hello_world_soap_http") 
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30", comments = "Apache CXF 2.7.6")
public class SOAPService extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public final static QName SERVICE = new QName("http://apache.org/hello_world_soap_http", "SOAPService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public final static QName SoapOverHttpRouter = new QName("http://apache.org/hello_world_soap_http", "SoapOverHttpRouter");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public final static QName SoapOverHttp = new QName("http://apache.org/hello_world_soap_http", "SoapOverHttp");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public final static QName SoapOverJms = new QName("http://apache.org/hello_world_soap_http", "SoapOverJms");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/chennareddy/Documents/apache-camel-2.12.1/examples/camel-example-cxf/src/main/resources/wsdl/hello_world.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SOAPService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/chennareddy/Documents/apache-camel-2.12.1/examples/camel-example-cxf/src/main/resources/wsdl/hello_world.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public SOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public SOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public SOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public SOAPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public SOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public SOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Greeter
     */
    @WebEndpoint(name = "SoapOverHttpRouter")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public Greeter getSoapOverHttpRouter() {
        return super.getPort(SoapOverHttpRouter, Greeter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Greeter
     */
    @WebEndpoint(name = "SoapOverHttpRouter")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public Greeter getSoapOverHttpRouter(WebServiceFeature... features) {
        return super.getPort(SoapOverHttpRouter, Greeter.class, features);
    }
    /**
     *
     * @return
     *     returns Greeter
     */
    @WebEndpoint(name = "SoapOverHttp")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public Greeter getSoapOverHttp() {
        return super.getPort(SoapOverHttp, Greeter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Greeter
     */
    @WebEndpoint(name = "SoapOverHttp")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public Greeter getSoapOverHttp(WebServiceFeature... features) {
        return super.getPort(SoapOverHttp, Greeter.class, features);
    }
    /**
     *
     * @return
     *     returns Greeter
     */
    @WebEndpoint(name = "SoapOverJms")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public Greeter getSoapOverJms() {
        return super.getPort(SoapOverJms, Greeter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Greeter
     */
    @WebEndpoint(name = "SoapOverJms")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.764+05:30")
    public Greeter getSoapOverJms(WebServiceFeature... features) {
        return super.getPort(SoapOverJms, Greeter.class, features);
    }

}