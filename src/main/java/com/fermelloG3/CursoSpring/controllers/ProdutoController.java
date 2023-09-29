package com.fermelloG3.CursoSpring.controllers;

import com.fermelloG3.CursoSpring.model.entities.Produto;
import com.fermelloG3.CursoSpring.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    //@PostMapping
    @RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> retornarProduto(){
        return produtoRepository.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }
    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obterProdutoPorNome(@PathVariable String parteNome){
        return produtoRepository.findByNomeIsContainingIgnoreCase(parteNome);

    }
    @GetMapping(path = "/pagina/{numerodepagina}/{qtdepagina}")
    public Iterable<Produto> obterProdutoPorPagina(@PathVariable int numerodepagina,
                                                   @PathVariable int qtdepagina){
        if (qtdepagina >= 5) qtdepagina = 5;
        Pageable page = PageRequest.of(numerodepagina,qtdepagina);
        return produtoRepository.findAll(page);
    }

    @DeleteMapping(path = "/{id}")
    public void eliminarProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }

}
