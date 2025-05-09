package com.example.labo02.Repository;


import com.example.labo02.Domain.Entities.Training;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface TrainingRepository extends iGenericRepository<Training, Integer>{

    //JPA
    public Training findBydescription(String description);

    //Hibrida
    @Query("SELECT t FROM Training t WHERE t.topicTitle = :topicTitle")
    public Training findBytopicTitle(@Param("description") String topicTitle);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM Training WHERE description = : description")
    public Training findBydescriptionNative(@Param("description") String description);

}
