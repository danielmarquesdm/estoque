package br.com.pulse.estoque.service;

import br.com.pulse.estoque.mapper.FilialMapper;
import br.com.pulse.estoque.model.Filial;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilialService {
    private final FilialMapper filialMapper;

    public void salvar(Filial filial) {
        filialMapper.salvar(filial);
    }

    public List<Filial> recuperar() {
        return filialMapper.recuperar();
    }

    public Filial recuperarPorCnpj(String cnpj) {
        return filialMapper.recuperarPorCnpj(cnpj);
    }

    public Filial atualizarPorCnpj(String cnpj) {
        return filialMapper.atualizarPorCnpj(cnpj);
    }

    public boolean deletarPorCnpj(String cnpj) {
        return filialMapper.deletarPorCnpj(cnpj) ? true : false;
    }
}
