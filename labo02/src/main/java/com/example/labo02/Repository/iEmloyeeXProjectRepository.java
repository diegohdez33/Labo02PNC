package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.EmployeeXProject;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

@Transactional
public interface iEmloyeeXProjectRepository extends iGenericRepository<EmployeeXProject, Integer> {

    //JPA
    public EmployeeXProject findByStartDate(Date startDate);


    //Hibrida
    @Query("SELECT e FROM EmployeeXProject e WHERE e.idEmployeeXProject = :id")
    public EmployeeXProject findByIdHib(@Param("idEmployeeXProject") Integer id);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM employee_x_project WHERE id_project =: idProject")
    public EmployeeXProject findByIdNative(@Param("id_project") Integer idProject);

}
