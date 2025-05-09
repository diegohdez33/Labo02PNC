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
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_contact;

    @Column
    private String firtName;

    @Column
    private String lastName;

    @Column
    private String email;

    @ManyToOne
    @JoinColumn(name = "idContactType", nullable = false, foreignKey = @ForeignKey(name = "fk_contact_ContactType"))
    private ContactType contactType;
}
