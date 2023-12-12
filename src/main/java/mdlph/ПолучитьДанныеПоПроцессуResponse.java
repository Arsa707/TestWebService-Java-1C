
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
 *         <element name="return" type="{http://server04/mdlph}ЭлементыПроцессаСканирования"/>
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
@XmlRootElement(name = "\u041f\u043e\u043b\u0443\u0447\u0438\u0442\u044c\u0414\u0430\u043d\u043d\u044b\u0435\u041f\u043e\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0443Response")
public class ПолучитьДанныеПоПроцессуResponse {

    @XmlElement(name = "return", required = true, nillable = true)
    protected ЭлементыПроцессаСканирования _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ЭлементыПроцессаСканирования }
     *     
     */
    public ЭлементыПроцессаСканирования getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ЭлементыПроцессаСканирования }
     *     
     */
    public void setReturn(ЭлементыПроцессаСканирования value) {
        this._return = value;
    }

}
