
package lrms_adopted_02_00_00;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Distance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Distance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="m"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="-10000000"/&gt;
 *               &lt;maxInclusive value="+10000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mDec"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-10000000"/&gt;
 *               &lt;maxInclusive value="+10000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mm"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="-1000000"/&gt;
 *               &lt;maxInclusive value="+1000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mmDec"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-1000000"/&gt;
 *               &lt;maxInclusive value="+1000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dm"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="-1000000"/&gt;
 *               &lt;maxInclusive value="+1000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dmDec"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-1000000"/&gt;
 *               &lt;maxInclusive value="+1000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="yd"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="-17600000"/&gt;
 *               &lt;maxInclusive value="+17600000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ydDec"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-17600000"/&gt;
 *               &lt;maxInclusive value="+17600000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ft"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="-52800000"/&gt;
 *               &lt;maxInclusive value="+52800000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ftDec"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-52800000"/&gt;
 *               &lt;maxInclusive value="+52800000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="in"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="-1000000"/&gt;
 *               &lt;maxInclusive value="+1000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="inDec"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-1000000"/&gt;
 *               &lt;maxInclusive value="+1000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mi"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short"&gt;
 *               &lt;minInclusive value="-10000"/&gt;
 *               &lt;maxInclusive value="+10000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="miDec"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-10000"/&gt;
 *               &lt;maxInclusive value="+10000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="km"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short"&gt;
 *               &lt;minInclusive value="-10000"/&gt;
 *               &lt;maxInclusive value="+10000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="kmDec"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-10000"/&gt;
 *               &lt;maxInclusive value="+10000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="block"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short"&gt;
 *               &lt;minInclusive value="-1000"/&gt;
 *               &lt;maxInclusive value="+1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="blkDec"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="-1000"/&gt;
 *               &lt;maxInclusive value="+1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Distance", propOrder = {
    "m",
    "mDec",
    "mm",
    "mmDec",
    "dm",
    "dmDec",
    "yd",
    "ydDec",
    "ft",
    "ftDec",
    "in",
    "inDec",
    "mi",
    "miDec",
    "km",
    "kmDec",
    "block",
    "blkDec"
})
public class Distance
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Integer m;
    protected BigDecimal mDec;
    protected Integer mm;
    protected BigDecimal mmDec;
    protected Integer dm;
    protected BigDecimal dmDec;
    protected Integer yd;
    protected BigDecimal ydDec;
    protected Integer ft;
    protected BigDecimal ftDec;
    protected Integer in;
    protected BigDecimal inDec;
    protected Short mi;
    protected BigDecimal miDec;
    protected Short km;
    protected BigDecimal kmDec;
    protected Short block;
    protected BigDecimal blkDec;

    /**
     * Gets the value of the m property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getM() {
        return m;
    }

    /**
     * Sets the value of the m property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setM(Integer value) {
        this.m = value;
    }

    /**
     * Gets the value of the mDec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDec() {
        return mDec;
    }

    /**
     * Sets the value of the mDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDec(BigDecimal value) {
        this.mDec = value;
    }

    /**
     * Gets the value of the mm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMm() {
        return mm;
    }

    /**
     * Sets the value of the mm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMm(Integer value) {
        this.mm = value;
    }

    /**
     * Gets the value of the mmDec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMmDec() {
        return mmDec;
    }

    /**
     * Sets the value of the mmDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMmDec(BigDecimal value) {
        this.mmDec = value;
    }

    /**
     * Gets the value of the dm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDm() {
        return dm;
    }

    /**
     * Sets the value of the dm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDm(Integer value) {
        this.dm = value;
    }

    /**
     * Gets the value of the dmDec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDmDec() {
        return dmDec;
    }

    /**
     * Sets the value of the dmDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDmDec(BigDecimal value) {
        this.dmDec = value;
    }

    /**
     * Gets the value of the yd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYd() {
        return yd;
    }

    /**
     * Sets the value of the yd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYd(Integer value) {
        this.yd = value;
    }

    /**
     * Gets the value of the ydDec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYdDec() {
        return ydDec;
    }

    /**
     * Sets the value of the ydDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYdDec(BigDecimal value) {
        this.ydDec = value;
    }

    /**
     * Gets the value of the ft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFt() {
        return ft;
    }

    /**
     * Sets the value of the ft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFt(Integer value) {
        this.ft = value;
    }

    /**
     * Gets the value of the ftDec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFtDec() {
        return ftDec;
    }

    /**
     * Sets the value of the ftDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFtDec(BigDecimal value) {
        this.ftDec = value;
    }

    /**
     * Gets the value of the in property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIn() {
        return in;
    }

    /**
     * Sets the value of the in property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIn(Integer value) {
        this.in = value;
    }

    /**
     * Gets the value of the inDec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDec() {
        return inDec;
    }

    /**
     * Sets the value of the inDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDec(BigDecimal value) {
        this.inDec = value;
    }

    /**
     * Gets the value of the mi property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMi() {
        return mi;
    }

    /**
     * Sets the value of the mi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMi(Short value) {
        this.mi = value;
    }

    /**
     * Gets the value of the miDec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiDec() {
        return miDec;
    }

    /**
     * Sets the value of the miDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiDec(BigDecimal value) {
        this.miDec = value;
    }

    /**
     * Gets the value of the km property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKm() {
        return km;
    }

    /**
     * Sets the value of the km property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKm(Short value) {
        this.km = value;
    }

    /**
     * Gets the value of the kmDec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKmDec() {
        return kmDec;
    }

    /**
     * Sets the value of the kmDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKmDec(BigDecimal value) {
        this.kmDec = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBlock(Short value) {
        this.block = value;
    }

    /**
     * Gets the value of the blkDec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlkDec() {
        return blkDec;
    }

    /**
     * Sets the value of the blkDec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBlkDec(BigDecimal value) {
        this.blkDec = value;
    }

}
