package br.com.pulse.estoque.model;

import lombok.Data;

@Data
public class Produto{
    private Long id;
    private String descricao;
    private Double valor;

}