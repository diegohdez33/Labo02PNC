package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.ProjectStatus;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface iProjectStatusRepository extends iGenericRepository<ProjectStatus, Integer> {

    //JPA
    public ProjectStatus findByName(String name);

    //Hibrida
    @Query("SELECT ps FROM ProjectStatus ps WHERE ps.idProjectStatus = :id")
    public ProjectStatus findByIdHib(@Param("idProjectStatus") Integer id);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM project_status WHERE name = :name")
    public ProjectStatus findByNameNative(@Param("name") String name);

}
