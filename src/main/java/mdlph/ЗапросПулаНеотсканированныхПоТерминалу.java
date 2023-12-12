
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
 *         <element name="ИдентификаторТерминала" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "\u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430"
})
@XmlRootElement(name = "\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445\u041f\u043e\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0443")
public class ЗапросПулаНеотсканированныхПоТерминалу {

    @XmlElement(name = "\u0418\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430", required = true)
    protected String идентификаторТерминала;

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

}
