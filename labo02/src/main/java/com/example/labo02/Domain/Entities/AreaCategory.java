package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "area_category")
public class AreaCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAreaCategory;

    @Column
    private String name;

}
