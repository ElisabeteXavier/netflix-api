package com.netflix.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class HelloWorldController {

    @GetMapping("say-hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World");
    }

}
