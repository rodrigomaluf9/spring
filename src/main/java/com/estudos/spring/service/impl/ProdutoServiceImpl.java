package com.estudos.spring.service.impl;

import com.estudos.spring.model.Produto;
import com.estudos.spring.repository.ProdutoRepository;
import com.estudos.spring.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);

    }

    @Override
    public Iterable<Produto> findAll() {
        return produtoRepository.findAll();
    }
}
