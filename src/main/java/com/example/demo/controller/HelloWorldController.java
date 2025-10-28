package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    // show initial HTML form
    @GetMapping("/showFrom")
    public String showForm() {
        return "helloworld-form";
    }

    // process HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // read data and add data to the model
    @RequestMapping("/processForm2")
    public String letsShout(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        String result = "YO " + name.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld";
    }

    // read data and add data to the model with @RequestParam
    @PostMapping("/processForm3")
    public String letsShout2(@RequestParam("studentName") String name, Model model) {
        String result = "YO2 " + name.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld";
    }
}
