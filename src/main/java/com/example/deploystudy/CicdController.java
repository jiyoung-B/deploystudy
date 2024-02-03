package com.example.deploystudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {


    @GetMapping
    public String sayHello() {
        return "Hi, Docker";
    }
}
