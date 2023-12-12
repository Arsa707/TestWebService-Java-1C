
package mdlph;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ЭлементПроцессаСканирования complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ЭлементПроцессаСканирования">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="НомерСтроки" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Номенклатура" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Количество" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0430\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", propOrder = {
    "\u043d\u043e\u043c\u0435\u0440\u0421\u0442\u0440\u043e\u043a\u0438",
    "\u043d\u043e\u043c\u0435\u043d\u043a\u043b\u0430\u0442\u0443\u0440\u0430",
    "\u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e"
})
public class ЭлементПроцессаСканирования {

    @XmlElement(name = "\u041d\u043e\u043c\u0435\u0440\u0421\u0442\u0440\u043e\u043a\u0438", required = true)
    protected String номерСтроки;
    @XmlElement(name = "\u041d\u043e\u043c\u0435\u043d\u043a\u043b\u0430\u0442\u0443\u0440\u0430", required = true)
    protected String номенклатура;
    @XmlElement(name = "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e", required = true)
    protected String количество;

    /**
     * Gets the value of the номерСтроки property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомерСтроки() {
        return номерСтроки;
    }

    /**
     * Sets the value of the номерСтроки property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомерСтроки(String value) {
        this.номерСтроки = value;
    }

    /**
     * Gets the value of the номенклатура property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНоменклатура() {
        return номенклатура;
    }

    /**
     * Sets the value of the номенклатура property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНоменклатура(String value) {
        this.номенклатура = value;
    }

    /**
     * Gets the value of the количество property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКоличество() {
        return количество;
    }

    /**
     * Sets the value of the количество property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКоличество(String value) {
        this.количество = value;
    }

}
