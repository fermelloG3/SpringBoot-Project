package com.fermelloG3.CursoSpring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/metodos")
public class MetodosHttpController {


    @GetMapping(path = "/get")
    public String get(){
        return "Get Request";
    }
    @PostMapping(path ="/post" )
    public String post(){
        return "Post Request";
    }
    @PutMapping(path = "/put")
    public String put(){
        return "Put Request";
    }
    @PatchMapping(path = "/patch")
    public String patch(){
        return "Patch Request";
    }
    @DeleteMapping(path = "/delete")
    public String delete(){
        return "Delete Request";
    }

}
