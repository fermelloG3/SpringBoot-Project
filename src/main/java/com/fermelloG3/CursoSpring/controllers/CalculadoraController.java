package com.fermelloG3.CursoSpring.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a,@PathVariable int b){
        return a+b;
    }

    @GetMapping("/substrair")
    public int substair(@RequestParam(name = "a") int a,@RequestParam(name = "b") int b){
        return a-b;
    }

}
