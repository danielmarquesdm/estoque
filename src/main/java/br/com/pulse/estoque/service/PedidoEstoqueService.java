package br.com.pulse.estoque.service;

import br.com.pulse.estoque.model.ItemPedidoEstoque;
import br.com.pulse.estoque.model.PedidoEstoque;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoEstoqueService {
    EstoqueService estoqueService;
    List<ItemPedidoEstoque> itemPedidoEstoqueList;

    public void salvar(PedidoEstoque pedidoEstoque, String cnpj){
        pedidoEstoque.getItemPedidoEstoqueList().stream().forEach(itemPedidoEstoque -> {
            itemPedidoEstoqueList.stream().forEach(item -> {
                estoqueService.recuperarProdutoPorCnpj(itemPedidoEstoque.getIdProduto(), cnpj);
            });
        });



    }

}
