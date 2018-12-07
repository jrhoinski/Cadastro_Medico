package com.example.cadastromedico.model;



public class Medico {

    private long id;
    private String nome;
    private int crm;


   //@ColumInfo(name - "especialidade_id")
    private long especialidadeId;

    public Medico(){
    }

    public Medico(long id, String nome, int crm){

        this.id = id;
        this.nome = nome;
        this.crm = crm;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public long getEspecialidadeId() {
        return especialidadeId;
    }

    public void setEspecialidadeId(long especialidadeId) {
        this.especialidadeId = especialidadeId;
    }

}
