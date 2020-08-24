package br.com.pulse.estoque.service;

import br.com.pulse.estoque.mapper.ProdutoMapper;
import br.com.pulse.estoque.model.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoMapper produtoMapper;

    public void salvar(Produto produto){
        produtoMapper.salvar(produto);
    }

    public List<Produto> recuperar() {
        List<Produto> produtoList = produtoMapper.recuperar();
        return produtoList;
    }

    public Produto recuperarPorId(Long id) {
        Produto produto = produtoMapper.recuperarPorId(id);
        return produto;
    }

    public void atualizarPorId(Long id, Produto produto) {
        produtoMapper.atualizarPorId(id, produto);
    }

    public void deletarPorId(Long id) {
        produtoMapper.deletarPorId(id);
    }

}
