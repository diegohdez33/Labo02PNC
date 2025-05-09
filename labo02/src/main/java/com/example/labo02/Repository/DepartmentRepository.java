package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.Department;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface DepartmentRepository extends iGenericRepository<Department, UUID>{

    //JPA
    public Department findByDepartmentName(String departmentName);

    //Hibrida
    @Query("SELECT d FROM Department d WHERE d.departmentName = :departmentName")
    public Department findBydepartmentName(@Param("departmentName") String departmentName);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM Department WHERE name = :departmentName")
    public Department findByNameNative(@Param("departmentName") String departmentName);

}
