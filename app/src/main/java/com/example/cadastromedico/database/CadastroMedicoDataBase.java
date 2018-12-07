package com.example.cadastromedico.database;
import android.content.Context;
import com.example.cadastromedico.DAO.EspecialidadeDAO;
import com.example.cadastromedico.DAO.MedicoDAO;
import com.example.cadastromedico.model.Especialidade;
import com.example.cadastromedico.model.Medico;

@Database(entities = {Medico.class, Especialidade.class},version = 1)
public abstract class CadastroMedicoDataBase  extends  RoomDatabase{
    private static volatile CadastroMedicoDataBase INSTANCE;
    public abstract MedicoDAO medicoDAO();
    public abstract EspecialidadeDAO especialidadeDAO();

    public static CadastroMedicoDataBase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (CadastroMedicoDataBase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),CadastroMedicoDataBase.class,"medico_database").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }

}
