package com.example.labo02.Domain.Repository;


import com.example.labo02.Domain.Entities.EmployeeXTraining;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeXTrainingRepository extends iGenericRepository<EmployeeXTraining, Integer>{

    //JPA
    public EmployeeXTraining findByid_employee(Integer id_employee);

    //Hibrida
    @Query("SELECT et FROM EmployeeXTraining et WHERE et.Employee.Contact.firtName = :firtName")
    public EmployeeXTraining findByfirtName(@Param("firtName") String firtName);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM EmployeeXTraining WHERE firtName = : firtName")
    public EmployeeXTraining findByfirtNameNative(@Param("firtName") String firtName);

}
