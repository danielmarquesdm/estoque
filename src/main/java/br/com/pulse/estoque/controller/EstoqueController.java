package br.com.pulse.estoque.controller;

import br.com.pulse.estoque.model.Estoque;
import br.com.pulse.estoque.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {
    @Autowired
    EstoqueService estoqueService;

    @PostMapping
    public void salvar(@RequestBody Estoque estoque){
        estoqueService.salvar(estoque);
    }

    @GetMapping
    public ResponseEntity<List<Estoque>> recuperar(){
       return ResponseEntity.ok(estoqueService.recuperar());
    }
}
