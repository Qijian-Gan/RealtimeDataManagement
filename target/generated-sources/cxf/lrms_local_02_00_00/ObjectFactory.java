
package lrms_local_02_00_00;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lrms_local_02_00_00 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lrms_local_02_00_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdminAreaGroup }
     * 
     */
    public AdminAreaGroup createAdminAreaGroup() {
        return new AdminAreaGroup();
    }

    /**
     * Create an instance of {@link Grid }
     * 
     */
    public Grid createGrid() {
        return new Grid();
    }

    /**
     * Create an instance of {@link GridProfile }
     * 
     */
    public GridProfile createGridProfile() {
        return new GridProfile();
    }

    /**
     * Create an instance of {@link GridPoint }
     * 
     */
    public GridPoint createGridPoint() {
        return new GridPoint();
    }

    /**
     * Create an instance of {@link GridPointPair }
     * 
     */
    public GridPointPair createGridPointPair() {
        return new GridPointPair();
    }

    /**
     * Create an instance of {@link GridPointSequence }
     * 
     */
    public GridPointSequence createGridPointSequence() {
        return new GridPointSequence();
    }

    /**
     * Create an instance of {@link NodeAttribute }
     * 
     */
    public NodeAttribute createNodeAttribute() {
        return new NodeAttribute();
    }

}
