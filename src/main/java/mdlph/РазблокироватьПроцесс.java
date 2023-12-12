
package mdlph;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ИдентификаторТерминала" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="СканированиеЗавершено" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processId",
    "\u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430",
    "\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435\u0417\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u043e"
})
@XmlRootElement(name = "\u0420\u0430\u0437\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441")
public class РазблокироватьПроцесс {

    @XmlElement(required = true)
    protected String processId;
    @XmlElement(name = "\u0418\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430", required = true)
    protected String идентификаторТерминала;
    @XmlElement(name = "\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435\u0417\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u043e")
    protected boolean сканированиеЗавершено;

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
     * Gets the value of the сканированиеЗавершено property.
     * 
     */
    public boolean isСканированиеЗавершено() {
        return сканированиеЗавершено;
    }

    /**
     * Sets the value of the сканированиеЗавершено property.
     * 
     */
    public void setСканированиеЗавершено(boolean value) {
        this.сканированиеЗавершено = value;
    }

}
