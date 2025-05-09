package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.EmployeeXProject;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface iEmloyeeXProjectRepository extends iGenericRepository<EmployeeXProject, Integer> {

    //JPA
    public EmployeeXProject findByIdProject(Integer idProject);

    //Hibrida
    @Query("SELECT e FROM EmployeeXProject e WHERE e.idEmployeeXProject = :id")
    public EmployeeXProject findByIdHib(@Param("idEmployeeXProject") Integer id);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM employee_x_project WHERE id_project =: idProject")
    public EmployeeXProject findByIdNative(@Param("idProject") Integer idProject);

}
