package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.Tecnology;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface iTecnologyRepository extends iGenericRepository<Tecnology, Integer>{

    //JPA
    public Tecnology findByName(String name);

    //Hibrida
    @Query("SELECT t FROM Tecnology t WHERE t.idTecnology =: idTecnology")
    public Tecnology findByIdHib(@Param("idTecnology") Integer idTecnology);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM tecnology WHERE name = :name")
    public Tecnology findByNameNative(@Param("name") String name);


}
