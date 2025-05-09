package com.example.labo02.Domain.Repository;


import com.example.labo02.Domain.Entities.Mentory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface MentoryRepository extends iGenericRepository<Mentory, Integer> {


        //JPA
        public Mentory findBydescription(String description);

        //Hibrida
        @Query("SELECT m FROM Mentory m WHERE m.description = :description")
        public Mentory findByIddescription(@Param("description") String description);

        //Nativa
        @Query(nativeQuery = true, value = "SELECT * FROM Mentory WHERE description = :description")
        public Mentory findBydescriptionNative(@Param("description") String description);


}
