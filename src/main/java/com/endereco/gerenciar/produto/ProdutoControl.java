package com.endereco.gerenciar.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoControl {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/listar")
    public Iterable<Produto> listar(){
        return produtoRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Produto cadastrar(@RequestBody Produto pd){
        return produtoRepository.save(pd);
    }

    @GetMapping("/produtos/{id}")
    public Produto listarPorID(@PathVariable Integer id){
        var produto = produtoRepository.findById(id);
        return produto.get();
    }
}
