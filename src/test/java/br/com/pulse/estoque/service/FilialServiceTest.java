package br.com.pulse.estoque.service;

import br.com.pulse.estoque.mapper.FilialMapper;
import br.com.pulse.estoque.model.Filial;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


public class FilialServiceTest {

    private FilialService filialService;
    private FilialMapper filialMapper;

    @Before
    public void setup(){
        filialMapper = Mockito.mock(FilialMapper.class);
        filialService = new FilialService(filialMapper);
    }

    @Test
    public void deveSalvarFilial(){
        Filial filial = new Filial();
        filial.setCnpj("12345678");
        filial.setRazaoSocial("Mateus Supermercados");

        filialService.salvar(filial);
        Mockito.verify(filialMapper).salvar(filial);
    }

    @Test
    public void deveRecuperarListaDeFiliais(){
        List<Filial> filiais = new ArrayList<>();

        Filial filial1 = new Filial();
        filial1.setCnpj("12345679");
        filial1.setRazaoSocial("Mateus Supermercados Turu");
        Filial filial2 = new Filial();
        filial2.setCnpj("12345678");
        filial2.setRazaoSocial("Mateus Supermercados Cohama");

        filiais.add(filial1);
        filiais.add(filial2);

        Mockito.when(filialMapper.recuperar()).thenReturn(filiais);
        List<Filial> filialList = filialService.recuperar();

        Assert.assertEquals(filialList, filiais);
    }

    @Test
    public void deveRecuperarFilialPorCnpj(){
        Filial filial = new Filial();
        filial.setCnpj("12345678");
        filial.setRazaoSocial("Mateus Cohatrac");

        Mockito.when(filialMapper.recuperarPorCnpj(filial.getCnpj())).thenReturn(filial);
        Filial filialResultado = filialService.recuperarPorCnpj("12345678");

        Assertions.assertThat(filialResultado).isEqualTo(filial);
    }

    @Test
    public void deveAtualizarPorCnpj(){
        Filial filial = new Filial();
        filial.setCnpj("12345678");
        filial.setRazaoSocial("Mateus Cohatrac");

        Mockito.when(filialMapper.atualizarPorCnpj(filial.getCnpj())).thenReturn(filial);
        Filial filialResultado = filialService.atualizarPorCnpj(filial.getCnpj());

        Assertions.assertThat(filialResultado).isEqualTo(filial);

    }

    @Test
    public void deveDeletarPorCnpj(){
        Filial filial = new Filial();
        filial.setCnpj("12345678");
        filial.setRazaoSocial("Mateus Cohama");

        Mockito.when(filialMapper.deletarPorCnpj("12345678")).thenReturn(true);
        boolean resultado = filialService.deletarPorCnpj(filial.getCnpj());

        Assertions.assertThat(resultado).isEqualTo(true);

    }

}
