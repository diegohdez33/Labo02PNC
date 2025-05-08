package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tecnology")
public class Tecnology {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTecnology;

    @Column
    private String name;

    @Column
    private String version;
}
