package com.example.labo02.Domain.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID IdDepartment;
    @Column
    private String departmentName;
    @Column
    private String departmentDescription;

}

