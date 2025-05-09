package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.AreaCategory;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface iAreaCategoryRepository extends iGenericRepository<AreaCategory, Integer>{
    //JPA
    public AreaCategory findByName(String name);

    //Hibrida
    @Query("SELECT ac FROM AreaCategory ac WHERE ac.idAreaCategory = :id")
    public AreaCategory findByIdHib(@Param("idAreaCategory") Integer id);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM area_category WHERE name = :name")
    public AreaCategory findByNameNative(@Param("name") String name);


}
