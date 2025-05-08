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
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCustomer;

    @Column
    private String name;

    @Column
    private String industry;

    /*
    Fk con la tabla contacto
    @OneToOne
    @JoinColumn(name = "id_contact", nullable = false, foreignKey = @ForeignKey(name = "fk_contact"))
    private Contact contact;
     */
}
