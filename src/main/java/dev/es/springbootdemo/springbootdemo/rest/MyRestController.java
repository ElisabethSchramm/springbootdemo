package dev.es.springbootdemo.springbootdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class MyRestController {

    // inject properties operator.name and operator.group

    @Value("${operator.name}")
    private String userName;

    @Value("${operator.group}")
    private String groupName;

    // expose new endpoint for "teminfo"

    @GetMapping("api/teaminfo")
    public String getTeaminfo(){
        return "user:" + userName + " group:" + groupName;
    }

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
