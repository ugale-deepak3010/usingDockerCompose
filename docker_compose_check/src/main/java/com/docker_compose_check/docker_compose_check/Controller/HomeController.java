package com.docker_compose_check.docker_compose_check.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String getMethodName() {
        return "1. /asset <br> 2. /actuator";
    }
    
}
