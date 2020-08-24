package br.com.pulse.estoque.controller;


import br.com.pulse.estoque.model.Filial;
import br.com.pulse.estoque.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filiais")
public class FilialController {
    @Autowired
    FilialService filialService;

    @PostMapping
    public void salvar(@RequestBody Filial filial){
        filialService.salvar(filial);
    }

    @GetMapping
    public ResponseEntity<List<Filial>> recuperar(){
        return ResponseEntity.ok(filialService.recuperar());
    }

    @GetMapping(value = "/{cnpj}")
    public ResponseEntity<Filial> recuperarPorCnpj(@PathVariable("cnpj") String cnpj){
        return ResponseEntity.ok(filialService.recuperarPorCnpj(cnpj));
    }

    @PutMapping(value = "/{cnpj}")
    public ResponseEntity<Filial> atualizarPorCnpj(@PathVariable("cnpj") String cnpj){
        return ResponseEntity.ok(filialService.atualizarPorCnpj(cnpj));
    }

    @DeleteMapping(value = "/{cnpj}")
    public boolean deletarPorCnpj(@PathVariable("cnpj") String cnpj){
        return filialService.deletarPorCnpj(cnpj) ? true : false;
    }

}
