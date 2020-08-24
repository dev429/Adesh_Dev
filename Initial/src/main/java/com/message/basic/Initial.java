package com.message.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Initial {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

}
