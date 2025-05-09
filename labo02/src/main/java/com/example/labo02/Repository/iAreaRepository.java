package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.Area;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface iAreaRepository extends iGenericRepository<Area, Integer> {
    //JPa
    public Area findByName(String name);

    //Hibrida
    @Query("SELECT a FROM Area a WHERE a.idArea = :id")
    public Area findByNameHib(@Param("idArea") Integer id);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM area WHERE name = :name")
    public Area findByNameNative(@Param("name") String name);
}
