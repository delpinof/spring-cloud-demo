package com.fherdelpino.springclouddemo.resource;

import com.fherdelpino.springclouddemo.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingResource {

    private static final String template = "Hola, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    public Greeting greeting(@RequestParam(value="name", defaultValue = "Mundo") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
