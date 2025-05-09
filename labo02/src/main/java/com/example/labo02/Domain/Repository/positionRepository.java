package com.example.labo02.Domain.Repository;


import com.example.labo02.Domain.Entitis.Mentory;
import com.example.labo02.Domain.Entitis.position;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface positionRepository extends iGenericRepository<position, Integer> {

    //JPA
    public position findBydescription(String positionName);

    //Hibrida
    @Query("SELECT p FROM position p WHERE p.positionName = :positionName")
    public Mentory findBypositionName(@Param("positionName") String positionName);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM position WHERE positionName = :positionName")
    public position findBypositionNameNative(@Param("positionName") String positionName);

}
