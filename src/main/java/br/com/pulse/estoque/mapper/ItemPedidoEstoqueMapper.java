package br.com.pulse.estoque.mapper;

import br.com.pulse.estoque.model.Estoque;
import org.apache.ibatis.annotations.Param;

public interface ItemPedidoEstoqueMapper {
    void salvar(@Param("estoque") Estoque estoque);
}
