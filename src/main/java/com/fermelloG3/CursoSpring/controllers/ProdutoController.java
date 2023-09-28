package com.fermelloG3.CursoSpring.controllers;

import com.fermelloG3.CursoSpring.model.entities.Produto;
import com.fermelloG3.CursoSpring.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto retornarProduto(@RequestParam String nome,
                                                 @RequestParam double preco,
                                                 @RequestParam double desconto){
        Produto produto = new Produto(nome, preco, desconto);
        produtoRepository.save(produto);
        return produto;
    }

}
