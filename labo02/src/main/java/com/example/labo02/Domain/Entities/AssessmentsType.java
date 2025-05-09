package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table

public class AssessmentsType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdAssessmentsType;

    @Column
    private String name;
}
