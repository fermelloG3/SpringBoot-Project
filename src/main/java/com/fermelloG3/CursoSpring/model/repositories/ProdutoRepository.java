package com.fermelloG3.CursoSpring.model.repositories;

import com.fermelloG3.CursoSpring.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto,Integer> {
}
