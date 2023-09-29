package com.fermelloG3.CursoSpring.model.repositories;

import com.fermelloG3.CursoSpring.model.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

    public Iterable<Produto> findByNomeIsContainingIgnoreCase(String parteNome);
}
