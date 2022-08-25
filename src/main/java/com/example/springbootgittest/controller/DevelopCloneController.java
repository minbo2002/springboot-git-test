package com.example.springbootgittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevelopCloneController {

    @GetMapping("/develop")
    public String delveop() {

        return "develop";
    }
}
