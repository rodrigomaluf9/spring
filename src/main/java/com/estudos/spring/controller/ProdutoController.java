package com.estudos.spring.controller;

import com.estudos.spring.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "produto")
public class ProdutoController {

    @GetMapping
    public Produto produto() {
        return new Produto();
    }
}
