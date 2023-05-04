package com.jaypee.helloworld.helloworldcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello(){

        String world = "Jove";

        return "Hello, " + world;

    }
    
}
