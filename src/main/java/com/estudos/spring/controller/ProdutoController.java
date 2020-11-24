package com.estudos.spring.controller;

import com.estudos.spring.dto.ProdutoDTO;
import com.estudos.spring.model.Produto;
import com.estudos.spring.repository.ProdutoRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<ProdutoDTO> produto() {

        Iterable<Produto> produtos = produtoRepository.findAll();
        Type listType = new TypeToken<List<ProdutoDTO>>() {}.getType();
        return new ModelMapper().map(produtos, listType);
    }

    @PostMapping
    public ProdutoDTO produto(@RequestBody ProdutoDTO produtoDTO) {

        return convertToDto(produtoRepository.save(convertToEntity(produtoDTO)));
    }

    private ProdutoDTO convertToDto(Produto produto) {
        ProdutoDTO produtoDTO = modelMapper.map(produto, ProdutoDTO.class);
        return produtoDTO;
    }

    private Produto convertToEntity(ProdutoDTO produtoDTO) {
        Produto produto = modelMapper.map(produtoDTO, Produto.class);
        return produto;
    }
}
