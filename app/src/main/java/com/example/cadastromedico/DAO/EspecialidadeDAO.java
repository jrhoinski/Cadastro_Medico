package com.example.cadastromedico.DAO;

import com.example.cadastromedico.model.Especialidade;

import java.util.List;

public interface EspecialidadeDAO {

   @Insert
    void insert(Especialidade especialidade);

  // @Update
    void update(Especialidade especialidade);

  //  @Query("SELECT * from especialidade_table ORDER BY nome DESC")
    List<Especialidade> loadEspecialidades();

}
