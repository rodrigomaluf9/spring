package com.estudos.spring.repository;

import com.estudos.spring.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

    Produto findByNome(String nome);
}
