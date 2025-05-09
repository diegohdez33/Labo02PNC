package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Assessments;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AssessmentsRepository extends iGenericRepository<Assessments, Integer>{

    //JPA
    public Assessments findBycoment(String coment);

    //Hibrida
    @Query("SELECT q FROM Assessments q WHERE q.quanlification = :quanlification")
    public Assessments findByquanlification(@Param("quanlification") String quanlification);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM Assessments WHERE name = :quanlification")
    public Assessments findByquanlificationNative(@Param("quanlification") String quanlification);

}
