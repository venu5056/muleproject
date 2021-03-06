package com.capg.soapmain;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-07-30T23:46:58.920+05:30
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "SoapMainServiceService",
                  wsdlLocation = "file:SoapMainService.wsdl",
                  targetNamespace = "http://soapMain.capg.com")
public class SoapMainServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soapMain.capg.com", "SoapMainServiceService");
    public final static QName SoapMainService = new QName("http://soapMain.capg.com", "SoapMainService");
    static {
        URL url = null;
        try {
            url = new URL("file:SoapMainService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SoapMainServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:SoapMainService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SoapMainServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SoapMainServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoapMainServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SoapMainServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SoapMainServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SoapMainServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SoapMainService
     */
    @WebEndpoint(name = "SoapMainService")
    public SoapMainService getSoapMainService() {
        return super.getPort(SoapMainService, SoapMainService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapMainService
     */
    @WebEndpoint(name = "SoapMainService")
    public SoapMainService getSoapMainService(WebServiceFeature... features) {
        return super.getPort(SoapMainService, SoapMainService.class, features);
    }

}
