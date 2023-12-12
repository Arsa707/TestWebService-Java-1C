
package mdlph;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for РезультатСканирования complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="РезультатСканирования">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ДатаСканирования" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="ТретичнаяУпаковка" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="КодУпаковки" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", propOrder = {
    "processId",
    "\u0434\u0430\u0442\u0430\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f",
    "\u0442\u0440\u0435\u0442\u0438\u0447\u043d\u0430\u044f\u0423\u043f\u0430\u043a\u043e\u0432\u043a\u0430",
    "\u043a\u043e\u0434\u0423\u043f\u0430\u043a\u043e\u0432\u043a\u0438"
})
public class РезультатСканирования {

    @XmlElement(required = true)
    protected String processId;
    @XmlElement(name = "\u0414\u0430\u0442\u0430\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar датаСканирования;
    @XmlElement(name = "\u0422\u0440\u0435\u0442\u0438\u0447\u043d\u0430\u044f\u0423\u043f\u0430\u043a\u043e\u0432\u043a\u0430")
    protected boolean третичнаяУпаковка;
    @XmlElement(name = "\u041a\u043e\u0434\u0423\u043f\u0430\u043a\u043e\u0432\u043a\u0438", required = true)
    protected String кодУпаковки;

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
     * Gets the value of the датаСканирования property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаСканирования() {
        return датаСканирования;
    }

    /**
     * Sets the value of the датаСканирования property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаСканирования(XMLGregorianCalendar value) {
        this.датаСканирования = value;
    }

    /**
     * Gets the value of the третичнаяУпаковка property.
     * 
     */
    public boolean isТретичнаяУпаковка() {
        return третичнаяУпаковка;
    }

    /**
     * Sets the value of the третичнаяУпаковка property.
     * 
     */
    public void setТретичнаяУпаковка(boolean value) {
        this.третичнаяУпаковка = value;
    }

    /**
     * Gets the value of the кодУпаковки property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодУпаковки() {
        return кодУпаковки;
    }

    /**
     * Sets the value of the кодУпаковки property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодУпаковки(String value) {
        this.кодУпаковки = value;
    }

}
