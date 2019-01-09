
package org.ntcip.c2c_message_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ntcip.c2c_message_administration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _C2CMessagePublication_QNAME = new QName("http://www.ntcip.org/c2c-message-administration", "c2cMessagePublication");
    private final static QName _C2CMessageReceipt_QNAME = new QName("http://www.ntcip.org/c2c-message-administration", "c2cMessageReceipt");
    private final static QName _C2CMessageSubscription_QNAME = new QName("http://www.ntcip.org/c2c-message-administration", "c2cMessageSubscription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ntcip.c2c_message_administration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link C2CMessagePublication }
     * 
     */
    public C2CMessagePublication createC2CMessagePublication() {
        return new C2CMessagePublication();
    }

    /**
     * Create an instance of {@link C2CMessageSubscription }
     * 
     */
    public C2CMessageSubscription createC2CMessageSubscription() {
        return new C2CMessageSubscription();
    }

    /**
     * Create an instance of {@link C2CMessageReceipt }
     * 
     */
    public C2CMessageReceipt createC2CMessageReceipt() {
        return new C2CMessageReceipt();
    }

    /**
     * Create an instance of {@link AuthorizationSet }
     * 
     */
    public AuthorizationSet createAuthorizationSet() {
        return new AuthorizationSet();
    }

    /**
     * Create an instance of {@link BroadcastAlerts }
     * 
     */
    public BroadcastAlerts createBroadcastAlerts() {
        return new BroadcastAlerts();
    }

    /**
     * Create an instance of {@link SubscriptionAction }
     * 
     */
    public SubscriptionAction createSubscriptionAction() {
        return new SubscriptionAction();
    }

    /**
     * Create an instance of {@link SubscriptionTimeFrame }
     * 
     */
    public SubscriptionTimeFrame createSubscriptionTimeFrame() {
        return new SubscriptionTimeFrame();
    }

    /**
     * Create an instance of {@link SubscriptionType }
     * 
     */
    public SubscriptionType createSubscriptionType() {
        return new SubscriptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link C2CMessagePublication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ntcip.org/c2c-message-administration", name = "c2cMessagePublication")
    public JAXBElement<C2CMessagePublication> createC2CMessagePublication(C2CMessagePublication value) {
        return new JAXBElement<C2CMessagePublication>(_C2CMessagePublication_QNAME, C2CMessagePublication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link C2CMessageReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ntcip.org/c2c-message-administration", name = "c2cMessageReceipt")
    public JAXBElement<C2CMessageReceipt> createC2CMessageReceipt(C2CMessageReceipt value) {
        return new JAXBElement<C2CMessageReceipt>(_C2CMessageReceipt_QNAME, C2CMessageReceipt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link C2CMessageSubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ntcip.org/c2c-message-administration", name = "c2cMessageSubscription")
    public JAXBElement<C2CMessageSubscription> createC2CMessageSubscription(C2CMessageSubscription value) {
        return new JAXBElement<C2CMessageSubscription>(_C2CMessageSubscription_QNAME, C2CMessageSubscription.class, null, value);
    }

}
