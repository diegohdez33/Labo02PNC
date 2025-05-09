package com.example.labo02.Domain.Repository;


import com.example.labo02.Domain.Entities.ContactType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContactTypeRepository extends iGenericRepository<ContactType, Integer>{

    //JPA
    public ContactType findByName(String name);

    //Hibrida
    @Query("SELECT ct FROM ContactType ct WHERE ct.name = :name")
    public ContactType findByname(@Param("name") String name);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM ContactType WHERE name = :name")
    public ContactType findBynameNative(@Param("name") String name);

}
