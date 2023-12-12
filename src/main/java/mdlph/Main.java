package mdlph;


import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        // Создаем Jax-WS прокси на web-сервис 1С:Предприятия
        MDLPH mdlph = new MDLPH();

        // Получаем порт для вызова операции web-сервиса
        MDLPHPortType portType = mdlph.getMDLPHSoap();


        //  Авторизируемся
        //Map<String, Object> requestContext = ((BindingProvider) mdlph).getRequestContext();
        //requestContext.put(BindingProvider.USERNAME_PROPERTY, "СканерМДЛП");
        //requestContext.put(BindingProvider.PASSWORD_PROPERTY, "1");
        ( ( BindingProvider ) portType ).getRequestContext().put( BindingProvider.USERNAME_PROPERTY, "СканерМДЛП" );
        ( ( BindingProvider ) portType ).getRequestContext().put( BindingProvider.PASSWORD_PROPERTY, "1" );
        // Выполняем вызов web-сервиса
        ПроцессыСканирования processes = portType.запросПулаНеотсканированныхПоТерминалу("005");
        System.out.println("Ok");
    }
}
