package br.com.pulse.estoque.mapper;

import br.com.pulse.estoque.model.Estoque;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EstoqueMapper {
    void salvar(@Param("estoque") Estoque estoque);

    List<Estoque> recuperar();
}
