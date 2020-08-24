package br.com.pulse.estoque.service;

import br.com.pulse.estoque.mapper.EstoqueMapper;
import br.com.pulse.estoque.model.Estoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {
    @Autowired
    EstoqueMapper estoqueMapper;

    public void salvar(Estoque estoque) {
        estoqueMapper.salvar(estoque);
    }


    public List<Estoque> recuperar() {
        return estoqueMapper.recuperar();
    }

    public void recuperarProdutoPorCnpj(Long id, String cnpj) {
    }
}
