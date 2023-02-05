package com.banco.xpto.model;

import java.util.List;

public class Empresa {

    private String nome;
    private List<BensImoveis> bensImoveisList;
    private List<Pessoa> socios;

    public Empresa() {
    }

    public Empresa(String nome, List<BensImoveis> bensImoveisList, List<Pessoa> socios) {
        this.nome = nome;
        this.bensImoveisList = bensImoveisList;
        this.socios = socios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<BensImoveis> getBensImoveisList() {
        return bensImoveisList;
    }

    public void setBensImoveisList(List<BensImoveis> bensImoveisList) {
        this.bensImoveisList = bensImoveisList;
    }

    public List<Pessoa> getSocios() {
        return socios;
    }

    public void setSocios(List<Pessoa> socios) {
        this.socios = socios;
    }
}
