package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

@Transactional
public interface EmployeeRepository extends iGenericRepository<Employee, Integer> {

    //JPA
    public Employee findByIdEmployee(Integer idEmployee);

    //Hibrida
    @Query("SELECT e FROM Employee e WHERE e.entryDate = :entryDate")
    public Employee findByEntryDate(@Param("entryDate") Date entryDate);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM Employee WHERE name = :name")
    public Employee findByFirstNameNative(@Param("firstName") String firtName);

}
