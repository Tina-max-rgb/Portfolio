package com.thinhinane.portfo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController { 
    @GetMapping("/api/hello")
    public String hello() {
        return "Ce portfolio présente l'ensemble de mes projets et applications";
}
}