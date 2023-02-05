package com.banco.xpto.model;

public class BensImoveis {

    private String nome;
    private Double valor;

    public BensImoveis() {
    }

    public BensImoveis(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
