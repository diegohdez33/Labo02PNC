package com.example.labo02.Repository;


import com.example.labo02.Domain.Entities.Contact;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface ContactRepository extends iGenericRepository<Contact, Integer>{

    //JPA
    public Contact findBylastName(String lastName);

    //Hibrida
    @Query("SELECT c FROM Contact c WHERE c.firtName = :firtName")
    public Contact findByfirtName(@Param("firtName") String firtName);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM Contact WHERE firtName = :firtName")
    public Contact findByfirtNameNative(@Param("firtName") String firtName);

}
