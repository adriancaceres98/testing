package com.ejercio2.demo.service;

public class StatusService {

    public String getStatus(int statusCode) {
        if(statusCode == 1 ) {
            return "Status ok";
        } else if (statusCode == 2) {
            return "Status ERROR";
        }
        return "no definido";
    }

}
