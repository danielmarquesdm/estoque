package br.com.pulse.estoque.mapper;

import br.com.pulse.estoque.model.PedidoEstoque;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PedidoEstoqueMapper {
    PedidoEstoque cadastrar(PedidoEstoque pedidoEstoque);
}
