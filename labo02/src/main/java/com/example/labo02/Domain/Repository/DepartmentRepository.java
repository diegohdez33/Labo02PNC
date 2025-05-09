package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entitis.Department;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface DepartmentRepository extends iGenericRepository<Department, UUID>{

    //JPA
    public Department findByName(String departmentName);

    //Hibrida
    @Query("SELECT d FROM Department d WHERE d.departmentName = :departmentName")
    public Department findBydepartmentName(@Param("departmentName") String departmentName);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM Department WHERE name = :departmentName")
    public Department findByNameNative(@Param("departmentName") String departmentName);

}
