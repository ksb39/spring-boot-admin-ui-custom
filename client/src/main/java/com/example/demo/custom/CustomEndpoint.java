package com.example.demo.custom;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

@Endpoint(id = "custom")
public class CustomEndpoint {

    @ReadOperation
    public String getHello(){
        return "Hello";
    }
}