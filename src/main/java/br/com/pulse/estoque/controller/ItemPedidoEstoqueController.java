package br.com.pulse.estoque.controller;

import br.com.pulse.estoque.model.ItemPedidoEstoque;
import br.com.pulse.estoque.service.ItemPedidoEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itemPedido")
public class ItemPedidoEstoqueController {
    @Autowired
    ItemPedidoEstoqueService itemPedidoEstoqueService;

    @PostMapping
    public void salvar(@RequestBody ItemPedidoEstoque itemPedidoEstoque){
        itemPedidoEstoqueService.salvar(itemPedidoEstoque);
    }
}
