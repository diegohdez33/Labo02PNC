package com.example.labo02.Repository;


import com.example.labo02.Domain.Entities.Employee;
import com.example.labo02.Domain.Entities.EmployeeXTraining;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface EmployeeXTrainingRepository extends iGenericRepository<EmployeeXTraining, Integer>{

    //JPA
    public EmployeeXTraining findByIdEmployeeXTraining(Integer idEmployeeXTraining);

    //Hibrida
    @Query("SELECT et FROM EmployeeXTraining et WHERE et.employee.Contact.firtName = :firtName")
    public EmployeeXTraining findByfirtName(@Param("firtName") String firtName);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM EmployeeXTraining WHERE firtName = : firtName")
    public EmployeeXTraining findByfirtNameNative(@Param("firtName") String firtName);

}
