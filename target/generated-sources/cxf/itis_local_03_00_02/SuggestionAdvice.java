
package itis_local_03_00_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuggestionAdvice.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SuggestionAdvice"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="insert-local-values-here"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SuggestionAdvice", namespace = "http://www.ITIS-Local-03-00-02")
@XmlEnum
public enum SuggestionAdvice {

    @XmlEnumValue("insert-local-values-here")
    INSERT_LOCAL_VALUES_HERE("insert-local-values-here");
    private final String value;

    SuggestionAdvice(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuggestionAdvice fromValue(String v) {
        for (SuggestionAdvice c: SuggestionAdvice.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
