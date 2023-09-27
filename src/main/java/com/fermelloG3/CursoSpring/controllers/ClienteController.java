package com.fermelloG3.CursoSpring.controllers;

import com.fermelloG3.CursoSpring.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/persona")
    public Cliente obterCliente(){
        return new Cliente(1,"Fernando de Mello","848.433.570-49");
    }
    @GetMapping(path = "/{id}")
    public Cliente obterClientePorId(@PathVariable int id){
        return new Cliente(id,"Tiburcio Gimaraes","444.333.222-11");
    }

    @GetMapping
    public Cliente obterParametroPorId(@RequestParam(name = "id") int id){
        return new Cliente(id,"Valentina Richieri","111.222.333-44");
    }
}
