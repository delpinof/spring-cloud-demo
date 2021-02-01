package com.fherdelpino.springclouddemo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseResource {

    @GetMapping
    public String get() {
        return "Healthy";
    }
}
