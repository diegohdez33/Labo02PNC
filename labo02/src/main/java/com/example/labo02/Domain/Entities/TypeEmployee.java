package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "type_employee")
public class TypeEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTypeEmployee;

    @Column
    private String name;

}

