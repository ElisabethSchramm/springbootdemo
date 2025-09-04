package dev.es.springbootdemo.springbootdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class MyRestController {
    // expose "/api/hello" that return "Hello World"
    @GetMapping("/api/hello")
    public String sayHello(){
        return "Hello World!!!";
    }
    // expose "/api/again" that return "Hello again"
    @GetMapping("/api/again")
    public String sayHelloAgain(){
        return "Hello again!!!";
    }
}
