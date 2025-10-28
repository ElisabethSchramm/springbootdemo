package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // show initial HTML form
    @RequestMapping("/showFrom")
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
        name = name.toUpperCase();
        String result = "YO " + name;

        model.addAttribute("message", result);

        return "helloworld";
    }
}
