
package mdlph;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for РезультатыСканирования complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="РезультатыСканирования">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="РезультатСканирования" type="{http://server04/mdlph}РезультатСканирования" maxOccurs="unbounded"/>
 *         <element name="ИдентификаторТерминала" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ОчищатьПредыдущиеЗаписи" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", propOrder = {
    "\u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f",
    "\u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430",
    "\u043e\u0447\u0438\u0449\u0430\u0442\u044c\u041f\u0440\u0435\u0434\u044b\u0434\u0443\u0449\u0438\u0435\u0417\u0430\u043f\u0438\u0441\u0438"
})
public class РезультатыСканирования {

    @XmlElement(name = "\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", required = true)
    protected List<РезультатСканирования> результатСканирования;
    @XmlElement(name = "\u0418\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430", required = true)
    protected String идентификаторТерминала;
    @XmlElement(name = "\u041e\u0447\u0438\u0449\u0430\u0442\u044c\u041f\u0440\u0435\u0434\u044b\u0434\u0443\u0449\u0438\u0435\u0417\u0430\u043f\u0438\u0441\u0438")
    protected boolean очищатьПредыдущиеЗаписи;

    /**
     * Gets the value of the результатСканирования property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the результатСканирования property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getРезультатСканирования().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link РезультатСканирования }
     * 
     * 
     * @return
     *     The value of the результатСканирования property.
     */
    public List<РезультатСканирования> getРезультатСканирования() {
        if (результатСканирования == null) {
            результатСканирования = new ArrayList<>();
        }
        return this.результатСканирования;
    }

    /**
     * Gets the value of the идентификаторТерминала property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдентификаторТерминала() {
        return идентификаторТерминала;
    }

    /**
     * Sets the value of the идентификаторТерминала property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдентификаторТерминала(String value) {
        this.идентификаторТерминала = value;
    }

    /**
     * Gets the value of the очищатьПредыдущиеЗаписи property.
     * 
     */
    public boolean isОчищатьПредыдущиеЗаписи() {
        return очищатьПредыдущиеЗаписи;
    }

    /**
     * Sets the value of the очищатьПредыдущиеЗаписи property.
     * 
     */
    public void setОчищатьПредыдущиеЗаписи(boolean value) {
        this.очищатьПредыдущиеЗаписи = value;
    }

}
