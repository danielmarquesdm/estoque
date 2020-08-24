package br.com.pulse.estoque.mapper;

import br.com.pulse.estoque.model.Produto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProdutoMapper {
    void salvar(@Param("produto") Produto produto);

    List<Produto> recuperar();

    Produto recuperarPorId(@Param("id") Long id);

    void atualizarPorId(@Param("id") Long id, @Param("produto") Produto produto);

    void deletarPorId(@Param("id") Long id);
}
