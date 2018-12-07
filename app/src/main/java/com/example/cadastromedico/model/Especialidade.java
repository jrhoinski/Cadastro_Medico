package com.example.cadastromedico.model;

public class Especialidade {
    private long ID;
    private String nome;

    public Especialidade(){}

    public Especialidade(long ID, String nome){
        this.ID = ID;
        this.nome = nome;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
