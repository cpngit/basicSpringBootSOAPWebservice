package com.cpn.spring.soap.webservices.basicSpringBootSOAPWebservice.Exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM, customFaultCode = "{http://www.cpn.com/ws}001_COURSE_NOT_FOUND")
public class CourseNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 3518170101751491969L;

    public CourseNotFoundException(String message) {
        super(message);
    }
}