
package mdlph;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ЭлементыПроцессаСканирования complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ЭлементыПроцессаСканирования">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ЭлементПроцессаСканирования" type="{http://server04/mdlph}ЭлементПроцессаСканирования" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u044b\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0430\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", propOrder = {
    "\u044d\u043b\u0435\u043c\u0435\u043d\u0442\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0430\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f"
})
public class ЭлементыПроцессаСканирования {

    @XmlElement(name = "\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0430\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", required = true)
    protected List<ЭлементПроцессаСканирования> элементПроцессаСканирования;

    /**
     * Gets the value of the элементПроцессаСканирования property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the элементПроцессаСканирования property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getЭлементПроцессаСканирования().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ЭлементПроцессаСканирования }
     * 
     * 
     * @return
     *     The value of the элементПроцессаСканирования property.
     */
    public List<ЭлементПроцессаСканирования> getЭлементПроцессаСканирования() {
        if (элементПроцессаСканирования == null) {
            элементПроцессаСканирования = new ArrayList<>();
        }
        return this.элементПроцессаСканирования;
    }

}
