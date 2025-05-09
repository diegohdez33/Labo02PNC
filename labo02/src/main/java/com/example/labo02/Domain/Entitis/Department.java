package com.example.labo02.Domain.Entitis;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdDepartment;
    @Column
    private String departmentName;
    @Column
    private String departmentDescription;

}
