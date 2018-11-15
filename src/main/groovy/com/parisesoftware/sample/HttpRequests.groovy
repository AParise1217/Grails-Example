package com.parisesoftware.sample

import org.grails.web.servlet.mvc.GrailsWebRequest
import org.springframework.web.context.request.RequestContextHolder

import javax.servlet.http.HttpServletRequest

class HttpRequests {

    static HttpServletRequest getRequest() {
        GrailsWebRequest webRequest = (GrailsWebRequest) RequestContextHolder.currentRequestAttributes()
        HttpServletRequest request = webRequest.currentRequest
        return request
    }

    static String getClientIpAddress(HttpServletRequest request) {
        request?.remoteHost
    }

    static String getClientHostName(HttpServletRequest request) {
        InetAddress.getByName(getClientIpAddress(request)).hostName
    }

}
