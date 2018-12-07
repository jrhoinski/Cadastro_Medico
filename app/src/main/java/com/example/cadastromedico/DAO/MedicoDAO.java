package com.example.cadastromedico.DAO;

import com.example.cadastromedico.model.Especialidade;
import com.example.cadastromedico.model.Medico;

import java.util.List;

public interface MedicoDAO {


    //@Insert
    void insert(Medico medico);

   // @Update
    void update(Medico medico);

  //  @Query("SELECT * FROM medico_table WHERE medico_table.ID == :id")
    Medico loadMedicoByID(Long id);

 //   @Query("DELETE FROM medico_table where medico_table.ID == :id")
    void delete(long id);

 //   @Query("SELECT * from medico_table ORDER BY nome DESC")
    List<Medico> loadMedicos();

    List<MedicoJoin> loadMedicosJoin();

  //  @Query("SELECT nome from medico_table")
    List<String> loadMedicosNames();

    static class MedicoJoin{
    //    @Embedded
        public Medico medico;
      //  @Embedded(prefix = "especialidade_")
        public Especialidade especialidade;
    }
}
