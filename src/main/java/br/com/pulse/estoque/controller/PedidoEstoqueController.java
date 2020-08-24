package br.com.pulse.estoque.controller;

import br.com.pulse.estoque.model.PedidoEstoque;
import br.com.pulse.estoque.service.PedidoEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedidos")
public class PedidoEstoqueController {
    @Autowired
    PedidoEstoqueService pedidoEstoqueService;

    @PostMapping("/{cnpjFilial}")
    public void salvar(@RequestBody PedidoEstoque pedidoEstoque, @PathVariable("cnpjFilial") String cnpjFilial){
        pedidoEstoqueService.salvar(pedidoEstoque, cnpjFilial);
    }
}
