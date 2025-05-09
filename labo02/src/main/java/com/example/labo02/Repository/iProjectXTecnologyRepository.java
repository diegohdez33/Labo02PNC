package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.ProjectXTecnology;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface iProjectXTecnologyRepository extends iGenericRepository<ProjectXTecnology, Integer> {

    //JPA
    public ProjectXTecnology findByIdTechnology(Integer idTechnology);

    //Hibrida
    @Query("SELECT p FROM ProjectXTecnology p WHERE p.idProjectXTecnology = :id")
    public ProjectXTecnology findByIdHib(@Param("idProjectXTecnology") Integer id);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM project_x_technology WHERE id_technology =: idTechnology")
    public ProjectXTecnology findByIdNative(@Param("idTechnology") Integer idTechnology);


}
