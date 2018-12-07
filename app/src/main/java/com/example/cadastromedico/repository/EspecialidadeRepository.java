package com.example.cadastromedico.repository;

import android.content.Context;

import com.example.cadastromedico.DAO.EspecialidadeDAO;
import com.example.cadastromedico.database.CadastroMedicoDataBase;
import com.example.cadastromedico.model.Especialidade;

import java.util.List;

public class EspecialidadeRepository {
    private EspecialidadeDAO mEspecialidadeDAO;
    private List<Especialidade> mEspecialidades;

    public EspecialidadeRepository(Context context){
        CadastroMedicoDataBase db = CadastroMedicoDataBase.getDatabase(context);
        mEspecialidadeDAO = db.especialidadeDAO();
    }

    public List<Especialidade> getAllEspecialidades(){
        mEspecialidades = mEspecialidadeDAO.loadEspecialidades();
        return mEspecialidades;
    }

    public void insert(Especialidade especialidade){
        mEspecialidadeDAO.insert(especialidade);
    }
    public void update(Especialidade especialidade) {mEspecialidadeDAO.update(especialidade);}


}


