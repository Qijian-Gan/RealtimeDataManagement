package org.tmdd._303.dialogs;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2019-04-15T15:46:52.918-07:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "TMDDCenterServices", 
                  wsdlLocation = "classpath:schema/tmdd_path.wsdl",
                  targetNamespace = "http://www.tmdd.org/303/dialogs") 
public class TMDDCenterServices extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.tmdd.org/303/dialogs", "TMDDCenterServices");
    public final static QName TmddOCSoapHttpServicePort = new QName("http://www.tmdd.org/303/dialogs", "tmddOCSoapHttpServicePort");
    static {
        URL url = TMDDCenterServices.class.getClassLoader().getResource("schema/tmdd_path.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(TMDDCenterServices.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:schema/tmdd_path.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public TMDDCenterServices(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TMDDCenterServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TMDDCenterServices() {
        super(WSDL_LOCATION, SERVICE);
    }
    




    /**
     *
     * @return
     *     returns TmddOCSoapHttpServicePortType
     */
    @WebEndpoint(name = "tmddOCSoapHttpServicePort")
    public TmddOCSoapHttpServicePortType getTmddOCSoapHttpServicePort() {
        return super.getPort(TmddOCSoapHttpServicePort, TmddOCSoapHttpServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TmddOCSoapHttpServicePortType
     */
    @WebEndpoint(name = "tmddOCSoapHttpServicePort")
    public TmddOCSoapHttpServicePortType getTmddOCSoapHttpServicePort(WebServiceFeature... features) {
        return super.getPort(TmddOCSoapHttpServicePort, TmddOCSoapHttpServicePortType.class, features);
    }

}
