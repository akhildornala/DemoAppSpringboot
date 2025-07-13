package com.example.DemoAppSpringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloWorld {

    @GetMapping("welcome/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        return "Hello World " + name;
    }

}
