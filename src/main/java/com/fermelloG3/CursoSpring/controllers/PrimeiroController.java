package com.fermelloG3.CursoSpring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class PrimeiroController {

    @GetMapping(path = "/ola")
    public String olaSpring(){
        return "Ola Spring!";
    }
}
