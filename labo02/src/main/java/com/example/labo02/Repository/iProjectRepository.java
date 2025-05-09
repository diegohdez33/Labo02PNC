package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.Project;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface iProjectRepository extends iGenericRepository<Project, Integer> {

    //JPA
    public Project findByName(String name);

    //Hibrida
    @Query("SELECT p FROM Project p WHERE p.idProject = :id")
    public Project findByIdHib(@Param("idProject") Integer id);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM project WHERE code = :code")
    public Project findByCodeNative(@Param("code") String code);


}
