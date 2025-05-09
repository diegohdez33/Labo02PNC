package com.example.labo02.Repository;


import com.example.labo02.Domain.Entities.position;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface positionRepository extends iGenericRepository<position, Integer> {

    //JPA
    public position findByPositionDescription(String positionDescription);

    //Hibrida
    @Query("SELECT p FROM position p WHERE p.positionName = :positionName")
    public position findBypositionName(@Param("positionName") String positionName);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM position WHERE positionName = :positionName")
    public position findBypositionNameNative(@Param("positionName") String positionName);

}
