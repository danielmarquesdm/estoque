package br.com.pulse.estoque.mapper;

import br.com.pulse.estoque.model.Filial;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FilialMapper {
    void salvar(@Param("filial") Filial filial);

    List<Filial> recuperar();

    Filial recuperarPorCnpj(@Param("cnpj") String cnpj);

    Filial atualizarPorCnpj(@Param("cnpj") String cnpj);

    boolean deletarPorCnpj(@Param("cnpj") String cnpj);

}
