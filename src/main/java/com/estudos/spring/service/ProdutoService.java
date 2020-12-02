package com.estudos.spring.service;

import com.estudos.spring.model.Produto;

public interface ProdutoService {

    Produto save(Produto produto);

    Iterable<Produto> findAll();
}
