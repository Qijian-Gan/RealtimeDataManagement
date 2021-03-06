package org.tmdd._303.dialogs;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2019-04-15T15:46:52.945-07:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "CmsOCServices", 
                  wsdlLocation = "classpath:schema/tmdd_path.wsdl",
                  targetNamespace = "http://www.tmdd.org/303/dialogs") 
public class CmsOCServices extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.tmdd.org/303/dialogs", "CmsOCServices");
    public final static QName CmsOCServicesPort = new QName("http://www.tmdd.org/303/dialogs", "CmsOCServicesPort");
    static {
        URL url = CmsOCServices.class.getClassLoader().getResource("schema/tmdd_path.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CmsOCServices.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:schema/tmdd_path.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public CmsOCServices(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CmsOCServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CmsOCServices() {
        super(WSDL_LOCATION, SERVICE);
    }
    




    /**
     *
     * @return
     *     returns TmddOCSoapHttpServicePortType
     */
    @WebEndpoint(name = "CmsOCServicesPort")
    public TmddOCSoapHttpServicePortType getCmsOCServicesPort() {
        return super.getPort(CmsOCServicesPort, TmddOCSoapHttpServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TmddOCSoapHttpServicePortType
     */
    @WebEndpoint(name = "CmsOCServicesPort")
    public TmddOCSoapHttpServicePortType getCmsOCServicesPort(WebServiceFeature... features) {
        return super.getPort(CmsOCServicesPort, TmddOCSoapHttpServicePortType.class, features);
    }

}
