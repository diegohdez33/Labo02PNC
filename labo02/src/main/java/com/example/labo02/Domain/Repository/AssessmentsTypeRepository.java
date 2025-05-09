package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.AssessmentsType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AssessmentsTypeRepository extends iGenericRepository<AssessmentsType, Integer>{

    //JPA
    public AssessmentsType findByName(String name);

    //Hibrida
    @Query("SELECT at FROM AssessmentsType at WHERE at.name = :name")
    public AssessmentsType findByname(@Param("name") String name);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM AssessmentsType WHERE name = :name")
    public AssessmentsType findBynameNative(@Param("name") String name);

}
