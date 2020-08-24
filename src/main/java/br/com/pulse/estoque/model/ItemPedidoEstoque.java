package br.com.pulse.estoque.model;

import lombok.Data;

@Data
public class ItemPedidoEstoque {
    private Long id;
    private Long quantidade;
    private Long idProduto;
    private Long idEstoque;

}
