
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
 *         <element name="РезультатыСканирования" type="{http://server04/mdlph}РезультатыСканирования"/>
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
    "\u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f"
})
@XmlRootElement(name = "\u041f\u0435\u0440\u0435\u0434\u0430\u0442\u044c\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f")
public class ПередатьРезультатыСканирования {

    @XmlElement(name = "\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", required = true)
    protected РезультатыСканирования результатыСканирования;

    /**
     * Gets the value of the результатыСканирования property.
     * 
     * @return
     *     possible object is
     *     {@link РезультатыСканирования }
     *     
     */
    public РезультатыСканирования getРезультатыСканирования() {
        return результатыСканирования;
    }

    /**
     * Sets the value of the результатыСканирования property.
     * 
     * @param value
     *     allowed object is
     *     {@link РезультатыСканирования }
     *     
     */
    public void setРезультатыСканирования(РезультатыСканирования value) {
        this.результатыСканирования = value;
    }

}
