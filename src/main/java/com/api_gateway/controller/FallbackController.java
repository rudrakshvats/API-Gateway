package com.api_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return "User Service is down at the moment! Please try again later.";
    }

    @GetMapping("/contactServiceFallback")
    public String contactServiceFallback(){
        return "Contact Service is down at the moment! Please try again later.";
    }
}
