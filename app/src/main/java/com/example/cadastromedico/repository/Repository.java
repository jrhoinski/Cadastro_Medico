package com.example.cadastromedico.repository;

import android.content.Context;

import com.example.cadastromedico.model.Especialidade;

public class Repository {
    private MedicoRepository medicoRepository;
    private EspecialidadeRepository especialidadeRepository;

    public Repository(Context context){
        medicoRepository = new MedicoRepository(context);
        especialidadeRepository = new EspecialidadeRepository(context);
    }

    public MedicoRepository getMedicoRepository() {
        return medicoRepository;
    }

    public EspecialidadeRepository getEspecialidadeRepository() {
        return especialidadeRepository;
    }
}
