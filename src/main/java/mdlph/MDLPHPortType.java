
package mdlph;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "MDLPHPortType", targetNamespace = "http://server04/mdlph")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MDLPHPortType {


    /**
     * 
     * @return
     *     returns server04.mdlph.ПроцессыСканирования
     */
    @WebMethod(operationName = "\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445", action = "http://server04/mdlph#MDLPH:\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445")
    @WebResult(targetNamespace = "http://server04/mdlph")
    @RequestWrapper(localName = "\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445")
    @ResponseWrapper(localName = "\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445Response", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445Response")
    public ПроцессыСканирования запросПулаНеотсканированных();

    /**
     * 
     * @param идентификаторТерминала
     * @return
     *     returns server04.mdlph.ПроцессыСканирования
     */
    @WebMethod(operationName = "\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445\u041f\u043e\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0443", action = "http://server04/mdlph#MDLPH:\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445\u041f\u043e\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0443")
    @WebResult(targetNamespace = "http://server04/mdlph")
    @RequestWrapper(localName = "\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445\u041f\u043e\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0443", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445\u041f\u043e\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0443")
    @ResponseWrapper(localName = "\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445\u041f\u043e\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0443Response", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u0417\u0430\u043f\u0440\u043e\u0441\u041f\u0443\u043b\u0430\u041d\u0435\u043e\u0442\u0441\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445\u041f\u043e\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0443Response")
    public ПроцессыСканирования запросПулаНеотсканированныхПоТерминалу(
        @WebParam(name = "\u0418\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430", targetNamespace = "http://server04/mdlph")
        String идентификаторТерминала);

    /**
     * 
     * @param результатыСканирования
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "\u041f\u0435\u0440\u0435\u0434\u0430\u0442\u044c\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", action = "http://server04/mdlph#MDLPH:\u041f\u0435\u0440\u0435\u0434\u0430\u0442\u044c\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f")
    @WebResult(targetNamespace = "http://server04/mdlph")
    @RequestWrapper(localName = "\u041f\u0435\u0440\u0435\u0434\u0430\u0442\u044c\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u041f\u0435\u0440\u0435\u0434\u0430\u0442\u044c\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f")
    @ResponseWrapper(localName = "\u041f\u0435\u0440\u0435\u0434\u0430\u0442\u044c\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044fResponse", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u041f\u0435\u0440\u0435\u0434\u0430\u0442\u044c\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044fResponse")
    public boolean передатьРезультатыСканирования(
        @WebParam(name = "\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u044b\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", targetNamespace = "http://server04/mdlph")
        РезультатыСканирования результатыСканирования);

    /**
     * 
     * @param processId
     * @param идентификаторТерминала
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "\u0417\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0414\u043b\u044f\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", action = "http://server04/mdlph#MDLPH:\u0417\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0414\u043b\u044f\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f")
    @WebResult(targetNamespace = "http://server04/mdlph")
    @RequestWrapper(localName = "\u0417\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0414\u043b\u044f\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u0417\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0414\u043b\u044f\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f")
    @ResponseWrapper(localName = "\u0417\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0414\u043b\u044f\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044fResponse", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u0417\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0414\u043b\u044f\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044fResponse")
    public boolean заблокироватьПроцессДляСканирования(
        @WebParam(name = "processId", targetNamespace = "http://server04/mdlph")
        String processId,
        @WebParam(name = "\u0418\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430", targetNamespace = "http://server04/mdlph")
        String идентификаторТерминала);

    /**
     * 
     * @param processId
     * @param идентификаторТерминала
     * @param сканированиеЗавершено
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "\u0420\u0430\u0437\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441", action = "http://server04/mdlph#MDLPH:\u0420\u0430\u0437\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441")
    @WebResult(targetNamespace = "http://server04/mdlph")
    @RequestWrapper(localName = "\u0420\u0430\u0437\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u0420\u0430\u0437\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441")
    @ResponseWrapper(localName = "\u0420\u0430\u0437\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441Response", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u0420\u0430\u0437\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u041f\u0440\u043e\u0446\u0435\u0441\u0441Response")
    public boolean разблокироватьПроцесс(
        @WebParam(name = "processId", targetNamespace = "http://server04/mdlph")
        String processId,
        @WebParam(name = "\u0418\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440\u0422\u0435\u0440\u043c\u0438\u043d\u0430\u043b\u0430", targetNamespace = "http://server04/mdlph")
        String идентификаторТерминала,
        @WebParam(name = "\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435\u0417\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u043e", targetNamespace = "http://server04/mdlph")
        boolean сканированиеЗавершено);

    /**
     * 
     * @param processId
     * @return
     *     returns server04.mdlph.ЭлементыПроцессаСканирования
     */
    @WebMethod(operationName = "\u041f\u043e\u043b\u0443\u0447\u0438\u0442\u044c\u0414\u0430\u043d\u043d\u044b\u0435\u041f\u043e\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0443", action = "http://server04/mdlph#MDLPH:\u041f\u043e\u043b\u0443\u0447\u0438\u0442\u044c\u0414\u0430\u043d\u043d\u044b\u0435\u041f\u043e\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0443")
    @WebResult(targetNamespace = "http://server04/mdlph")
    @RequestWrapper(localName = "\u041f\u043e\u043b\u0443\u0447\u0438\u0442\u044c\u0414\u0430\u043d\u043d\u044b\u0435\u041f\u043e\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0443", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u041f\u043e\u043b\u0443\u0447\u0438\u0442\u044c\u0414\u0430\u043d\u043d\u044b\u0435\u041f\u043e\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0443")
    @ResponseWrapper(localName = "\u041f\u043e\u043b\u0443\u0447\u0438\u0442\u044c\u0414\u0430\u043d\u043d\u044b\u0435\u041f\u043e\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0443Response", targetNamespace = "http://server04/mdlph", className = "server04.mdlph.\u041f\u043e\u043b\u0443\u0447\u0438\u0442\u044c\u0414\u0430\u043d\u043d\u044b\u0435\u041f\u043e\u041f\u0440\u043e\u0446\u0435\u0441\u0441\u0443Response")
    public ЭлементыПроцессаСканирования получитьДанныеПоПроцессу(
        @WebParam(name = "processId", targetNamespace = "http://server04/mdlph")
        String processId);

}
