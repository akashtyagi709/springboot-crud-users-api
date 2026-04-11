package com.example.CRUD.CONTROLLERS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthCheck {
    @GetMapping("/api/healthcheck")
    public String getStatusOfAPI(){
        return "health";
    }

}
