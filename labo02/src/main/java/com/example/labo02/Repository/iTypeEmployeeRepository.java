package com.example.labo02.Repository;

import com.example.labo02.Domain.Entities.TypeEmployee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface iTypeEmployeeRepository extends iGenericRepository<TypeEmployee, Integer> {

    //JPA
    public TypeEmployee findByName(String name);

    //Hibrida
    @Query("SELECT te FROM TypeEmployee te WHERE te.idTypeEmployee = :id")
    public TypeEmployee findByIdHib(@Param("idTypeEmployee") Integer id);

    //Nativa
    @Query(nativeQuery = true, value = "SELECT * FROM type_employee WHERE name = :name")
    public TypeEmployee findByNameNative(@Param("name") String name);


}
