package org.tmdd._303.dialogs;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2019-01-31T11:27:54.106-08:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "CmsECServices", 
                  wsdlLocation = "classpath:schema/tmdd_path.wsdl",
                  targetNamespace = "http://www.tmdd.org/303/dialogs") 
public class CmsECServices extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.tmdd.org/303/dialogs", "CmsECServices");
    public final static QName CmsECServicesPort = new QName("http://www.tmdd.org/303/dialogs", "CmsECServicesPort");
    static {
        URL url = CmsECServices.class.getClassLoader().getResource("schema/tmdd_path.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CmsECServices.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:schema/tmdd_path.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public CmsECServices(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CmsECServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CmsECServices() {
        super(WSDL_LOCATION, SERVICE);
    }
    




    /**
     *
     * @return
     *     returns TmddECSoapHttpServicePortType
     */
    @WebEndpoint(name = "CmsECServicesPort")
    public TmddECSoapHttpServicePortType getCmsECServicesPort() {
        return super.getPort(CmsECServicesPort, TmddECSoapHttpServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TmddECSoapHttpServicePortType
     */
    @WebEndpoint(name = "CmsECServicesPort")
    public TmddECSoapHttpServicePortType getCmsECServicesPort(WebServiceFeature... features) {
        return super.getPort(CmsECServicesPort, TmddECSoapHttpServicePortType.class, features);
    }

}
