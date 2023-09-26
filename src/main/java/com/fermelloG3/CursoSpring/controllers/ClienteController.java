package com.fermelloG3.CursoSpring.controllers;

import com.fermelloG3.CursoSpring.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
