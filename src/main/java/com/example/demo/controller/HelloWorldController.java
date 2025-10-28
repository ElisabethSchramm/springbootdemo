package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // show initial HTML form
    @RequestMapping("/showFrom")
    public String showForm() {
        return "helloworld-form";
    }

    // process HTML form

}
