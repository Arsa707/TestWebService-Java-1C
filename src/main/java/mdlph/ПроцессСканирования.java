
package mdlph;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ПроцессСканирования complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ПроцессСканирования">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="НомерПроцесса" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ДатаПроцесса" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Заблокирован" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ИдентификаторЗаблокировавшегоТерминала" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Организация" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Контрагент" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ВхНомер" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ВхДата" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", propOrder = {
    "\u043d\u043e\u043c\u0435\u0440\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0430",
    "\u0434\u0430\u0442\u0430\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0430",
    "processId",
    "\u0437\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u043d",
    "\u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0417\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0432\u0448\u0435\u0433\u043e\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430",
    "\u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f",
    "\u043a\u043e\u043d\u0442\u0440\u0430\u0433\u0435\u043d\u0442",
    "\u0432\u0445\u041d\u043e\u043c\u0435\u0440",
    "\u0432\u0445\u0414\u0430\u0442\u0430"
})
public class ПроцессСканирования {

    @XmlElement(name = "\u041d\u043e\u043c\u0435\u0440\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0430", required = true)
    protected String номерПроцесса;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0430", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar датаПроцесса;
    @XmlElement(required = true)
    protected String processId;
    @XmlElement(name = "\u0417\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u043d", required = true, type = Boolean.class, nillable = true)
    protected Boolean заблокирован;
    @XmlElement(name = "\u0418\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0417\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0432\u0448\u0435\u0433\u043e\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430", required = true, nillable = true)
    protected String идентификаторЗаблокировавшегоТерминала;
    @XmlElement(name = "\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f", required = true, nillable = true)
    protected String организация;
    @XmlElement(name = "\u041a\u043e\u043d\u0442\u0440\u0430\u0433\u0435\u043d\u0442", required = true, nillable = true)
    protected String контрагент;
    @XmlElement(name = "\u0412\u0445\u041d\u043e\u043c\u0435\u0440", required = true, nillable = true)
    protected String вхНомер;
    @XmlElement(name = "\u0412\u0445\u0414\u0430\u0442\u0430", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar вхДата;

    /**
     * Gets the value of the номерПроцесса property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомерПроцесса() {
        return номерПроцесса;
    }

    /**
     * Sets the value of the номерПроцесса property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомерПроцесса(String value) {
        this.номерПроцесса = value;
    }

    /**
     * Gets the value of the датаПроцесса property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаПроцесса() {
        return датаПроцесса;
    }

    /**
     * Sets the value of the датаПроцесса property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаПроцесса(XMLGregorianCalendar value) {
        this.датаПроцесса = value;
    }

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * Gets the value of the заблокирован property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isЗаблокирован() {
        return заблокирован;
    }

    /**
     * Sets the value of the заблокирован property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setЗаблокирован(Boolean value) {
        this.заблокирован = value;
    }

    /**
     * Gets the value of the идентификаторЗаблокировавшегоТерминала property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдентификаторЗаблокировавшегоТерминала() {
        return идентификаторЗаблокировавшегоТерминала;
    }

    /**
     * Sets the value of the идентификаторЗаблокировавшегоТерминала property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдентификаторЗаблокировавшегоТерминала(String value) {
        this.идентификаторЗаблокировавшегоТерминала = value;
    }

    /**
     * Gets the value of the организация property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОрганизация() {
        return организация;
    }

    /**
     * Sets the value of the организация property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОрганизация(String value) {
        this.организация = value;
    }

    /**
     * Gets the value of the контрагент property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКонтрагент() {
        return контрагент;
    }

    /**
     * Sets the value of the контрагент property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКонтрагент(String value) {
        this.контрагент = value;
    }

    /**
     * Gets the value of the вхНомер property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВхНомер() {
        return вхНомер;
    }

    /**
     * Sets the value of the вхНомер property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВхНомер(String value) {
        this.вхНомер = value;
    }

    /**
     * Gets the value of the вхДата property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getВхДата() {
        return вхДата;
    }

    /**
     * Sets the value of the вхДата property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setВхДата(XMLGregorianCalendar value) {
        this.вхДата = value;
    }

}
