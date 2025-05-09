package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface EmployeeRepository extends iGenericRepository<Employee, Integer> {

    //JPA
    public Employee findByfirtName(String firtName);

    //Hibrida
    @Query("SELECT e FROM Employee e WHERE e.entryDate = :entryDate")
    public Employee findByentryDate(@Param("entryDate") Date entryDate);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM Employee WHERE name = :name")
    public Employee findByfirtNameNative(@Param("firtName") String firtName);

}
