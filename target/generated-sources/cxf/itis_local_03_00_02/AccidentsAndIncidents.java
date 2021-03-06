
package itis_local_03_00_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccidentsAndIncidents.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccidentsAndIncidents"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="insert-local-values-here"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccidentsAndIncidents", namespace = "http://www.ITIS-Local-03-00-02")
@XmlEnum
public enum AccidentsAndIncidents {

    @XmlEnumValue("insert-local-values-here")
    INSERT_LOCAL_VALUES_HERE("insert-local-values-here");
    private final String value;

    AccidentsAndIncidents(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccidentsAndIncidents fromValue(String v) {
        for (AccidentsAndIncidents c: AccidentsAndIncidents.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
