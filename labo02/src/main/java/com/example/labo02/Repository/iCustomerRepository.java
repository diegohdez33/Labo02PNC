package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.Customers;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface iCustomerRepository extends iGenericRepository<Customers, UUID>{

    //JPA
    public Customers findByName(String name);

    //Hibrida
    @Query("SELECT c FROM Customers c WHERE c.industry = :industry")
    public Customers findByIndustry(@Param("industry") String industry);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM customers WHERE name = :name")
    public Customers findByNameNative(@Param("name") String name);

}
