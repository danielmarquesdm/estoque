package br.com.pulse.estoque.model;

import java.util.List;
import lombok.Data;

@Data
public class PedidoEstoque {
    private Long id;
    private List<ItemPedidoEstoque> itemPedidoEstoqueList;
    private boolean entrada;
    private Long idEstoque;

}
