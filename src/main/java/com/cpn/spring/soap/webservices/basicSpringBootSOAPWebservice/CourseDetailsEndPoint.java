package com.cpn.spring.soap.webservices.basicSpringBootSOAPWebservice;

import com.cpn.ws.GetCourseDetailsRequest;
import com.cpn.ws.GetCourseDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseDetailsEndPoint {

    @PayloadRoot(namespace="http://www.cpn.com/ws", localPart="GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse processCourseDetailRequest(@RequestPayload GetCourseDetailsRequest request){
        GetCourseDetailsResponse response = new GetCourseDetailsResponse();

        return response;
    }


}
