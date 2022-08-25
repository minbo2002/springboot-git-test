package com.example.springbootgittest.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DevelopController {

    @GetMapping("/develop")
    public String develop() {

        return "develop";
    }
}
