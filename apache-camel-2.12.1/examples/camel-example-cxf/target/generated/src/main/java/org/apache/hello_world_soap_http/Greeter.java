package org.apache.hello_world_soap_http;

import javax.annotation.Generated;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-10-03T19:00:10.730+05:30
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://apache.org/hello_world_soap_http", name = "Greeter")
@XmlSeeAlso({org.apache.hello_world_soap_http.types.ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.730+05:30", comments = "Apache CXF 2.7.6")
public interface Greeter {

    @RequestWrapper(localName = "pingMe", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.hello_world_soap_http.types.PingMe")
    @WebMethod
    @ResponseWrapper(localName = "pingMeResponse", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.hello_world_soap_http.types.PingMeResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.730+05:30")
    public void pingMe(
        @WebParam(name = "faultType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
        java.lang.String faultType
    ) throws PingMeFault;

    @WebResult(name = "responseType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.hello_world_soap_http.types.SayHi")
    @WebMethod
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.hello_world_soap_http.types.SayHiResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.730+05:30")
    public java.lang.String sayHi();

    @Oneway
    @RequestWrapper(localName = "greetMeOneWay", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.hello_world_soap_http.types.GreetMeOneWay")
    @WebMethod
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.730+05:30")
    public void greetMeOneWay(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
        java.lang.String requestType
    );

    @WebResult(name = "responseType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
    @RequestWrapper(localName = "greetMe", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.hello_world_soap_http.types.GreetMe")
    @WebMethod
    @ResponseWrapper(localName = "greetMeResponse", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.hello_world_soap_http.types.GreetMeResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2013-10-03T19:00:10.730+05:30")
    public java.lang.String greetMe(
        @WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
        java.lang.String requestType
    );
}