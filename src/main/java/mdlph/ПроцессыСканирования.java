
package mdlph;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ПроцессыСканирования complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ПроцессыСканирования">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Процесс" type="{http://server04/mdlph}ПроцессСканирования" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", propOrder = {
    "\u043f\u0440\u043e\u0446\u0435\u0441\u0441"
})
public class ПроцессыСканирования {

    @XmlElement(name = "\u041f\u0440\u043e\u0446\u0435\u0441\u0441")
    protected List<ПроцессСканирования> процесс;

    /**
     * Gets the value of the процесс property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the процесс property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getПроцесс().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ПроцессСканирования }
     * 
     * 
     * @return
     *     The value of the процесс property.
     */
    public List<ПроцессСканирования> getПроцесс() {
        if (процесс == null) {
            процесс = new ArrayList<>();
        }
        return this.процесс;
    }

}
