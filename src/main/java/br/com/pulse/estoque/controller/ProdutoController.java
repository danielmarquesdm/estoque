package br.com.pulse.estoque.controller;

import br.com.pulse.estoque.model.Produto;
import br.com.pulse.estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public void salvar(@RequestBody Produto produto){
        produtoService.salvar(produto);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> recuperar(){
        return ResponseEntity.ok(produtoService.recuperar());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity.BodyBuilder recuperarPorId(@PathVariable("id") Long id){
        Produto produto = produtoService.recuperarPorId(id);
        return ResponseEntity.ok(produto).status(200);
    }

    @PutMapping(value = "/{id}")
    public void atualizarPorId(@PathVariable("id") Long id, @RequestBody Produto produto){
        produtoService.atualizarPorId(id, produto);
    }

    @DeleteMapping(value = "/{id}")
    public void deletarPorId(@PathVariable("id") Long id){
        produtoService.deletarPorId(id);
    }

}
