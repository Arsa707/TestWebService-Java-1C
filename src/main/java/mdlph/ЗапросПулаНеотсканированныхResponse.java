
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
 *         <element name="return" type="{http://server04/mdlph}ПроцессыСканирования"/>
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
    "_return"
})
@XmlRootElement(name = "\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445Response")
public class ЗапросПулаНеотсканированныхResponse {

    @XmlElement(name = "return", required = true, nillable = true)
    protected ПроцессыСканирования _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ПроцессыСканирования }
     *     
     */
    public ПроцессыСканирования getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ПроцессыСканирования }
     *     
     */
    public void setReturn(ПроцессыСканирования value) {
        this._return = value;
    }

}
