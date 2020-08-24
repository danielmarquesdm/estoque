package br.com.pulse.estoque.service;

import br.com.pulse.estoque.mapper.ProdutoMapper;
import br.com.pulse.estoque.model.Produto;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ProdutoServiceTest {
    private ProdutoService produtoService;
    private ProdutoMapper produtoMapper;

    @Before
    public void setup(){
        produtoMapper = Mockito.mock(ProdutoMapper.class);
        produtoService = new ProdutoService(produtoMapper);
    }

    @Test
    public void deveSalvarProduto(){
        Produto produto = new Produto();
        produto.setId(new Long(123));
        produto.setDescricao("Smartphone samsung A10");
        produto.setValor(1599.90);

        produtoService.salvar(produto);
        Mockito.verify(produtoMapper).salvar(produto);
    }

    @Test
    public void deveRecuperarListaDeProdutos(){
        Produto produto1 = new Produto();
        produto1.setId(new Long(123));
        produto1.setDescricao("Smartphone samsung A10");
        produto1.setValor(1599.90);

        Produto produto2 = new Produto();
        produto2.setId(new Long(123));
        produto2.setDescricao("Smartphone samsung A10");
        produto2.setValor(1199.90);

        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(produto1);
        produtoList.add(produto2);

        Mockito.when(produtoMapper.recuperar()).thenReturn(produtoList);
        List<Produto> resultado = produtoService.recuperar();

        Assertions.assertThat(resultado).isEqualTo(produtoList);
    }

    @Test
    public void deveRecuperarProdutoPorId(){
        Produto produto = new Produto();
        produto.setId(new Long(463));
        produto.setDescricao("Smartphone samsung A20");
        produto.setValor(1599.90);

        Mockito.when(produtoMapper.recuperarPorId(produto.getId())).thenReturn(produto);
        Produto produtoResultado = produtoService.recuperarPorId(produto.getId());

        Assertions.assertThat(produtoResultado).isEqualTo(produto);
    }

    @Test
    public void deveAtualizarProduto(){
        Produto produto = new Produto();
        produto.setId(new Long(463));
        produto.setDescricao("Smartphone samsung A20");
        produto.setValor(1599.90);

        Produto produto2 = new Produto();
        produto2.setId(new Long(463));
        produto2.setDescricao("Smartphone samsung A10");
        produto2.setValor(1199.90);

        produtoService.atualizarPorId(produto.getId(), produto2);
        Mockito.verify(produtoMapper).atualizarPorId(produto.getId(), produto2);

    }

    @Test
    public void deveDeletarPorId(){
        Produto produto = new Produto();
        produto.setId(new Long(472));
        produto.setDescricao("Smartphone samsung A30");
        produto.setValor(2599.90);

        produtoService.deletarPorId(produto.getId());
        Mockito.verify(produtoMapper).deletarPorId(produto.getId());

    }

}
