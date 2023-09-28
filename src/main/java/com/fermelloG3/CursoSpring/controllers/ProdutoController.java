package com.fermelloG3.CursoSpring.controllers;

import com.fermelloG3.CursoSpring.model.entities.Produto;
import com.fermelloG3.CursoSpring.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto retornarProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

}
