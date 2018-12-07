package com.example.cadastromedico.repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.cadastromedico.DAO.MedicoDAO;
import com.example.cadastromedico.database.CadastroMedicoDataBase;
import com.example.cadastromedico.model.Medico;

import java.util.List;

public class MedicoRepository {
    private MedicoDAO mMedicoDAO;
    private List<Medico> mMedicos;
    private List<MedicoDAO.MedicoJoin> mMedicosJoin;

    public MedicoRepository(Context context){
        CadastroMedicoDataBase db = CadastroMedicoDataBase.getDatabase(context);
        mMedicoDAO = db.medicoDAO();
    }

    public List<Medico> getAllMedicos(){
        mMedicos = mMedicoDAO.loadMedicos();
        return mMedicos;
    }

    public List<MedicoDAO.MedicoJoin> getAllMedicosJoin(){
        mMedicosJoin = mMedicoDAO.loadMedicosJoin();
        return mMedicosJoin;
    }

    public Medico loadMedicoByID(long ID) {return  mMedicoDAO.loadMedicoByID(ID);}

    public void insert(Medico medico){
        new insertAsyncTask(mMedicoDAO).execute(medico);
    }
    public void delete(long id){mMedicoDAO.delete(id);}
    public void update(Medico medico) {mMedicoDAO.update(medico);}

    private static class insertAsyncTask extends AsyncTask<Medico,Void,Void> {

        private MedicoDAO mAsyncTaskDAO;

        insertAsyncTask(MedicoDAO dao){
            mAsyncTaskDAO = dao;
        }

        @Override
        protected Void doInBackground(final Medico... params){
            mAsyncTaskDAO.insert(params[0]);
            return null;
        }
    }


}
