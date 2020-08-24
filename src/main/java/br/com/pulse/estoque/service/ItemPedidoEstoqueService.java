package br.com.pulse.estoque.service;

import br.com.pulse.estoque.mapper.ItemPedidoEstoqueMapper;
import br.com.pulse.estoque.model.ItemPedidoEstoque;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemPedidoEstoqueService {
    private final ItemPedidoEstoqueMapper itemPedidoEstoqueMapper;

    public void salvar(ItemPedidoEstoque itemPedidoEstoque) {

    }
}
