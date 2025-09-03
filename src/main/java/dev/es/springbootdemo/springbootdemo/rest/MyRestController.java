package dev.es.springbootdemo.springbootdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class MyRestController {
    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    }
