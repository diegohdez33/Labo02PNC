package com.example.labo02.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table

public class ContactType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idContactType;

    @Column
    private String name;
}
