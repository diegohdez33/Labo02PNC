package com.example.labo02.Domain.Entitis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table

public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id_employee;

    @Column
    private Date entryDate;

    @ManyToOne
    @JoinColumn(name = "IdPosition", nullable = false, foreignKey = @ForeignKey(name = "fk_employee_position"))
    private position position;

    
    @OneToOne
    @JoinColumn(name = "id_contact", nullable = false, foreignKey = @ForeignKey(name = "fk_position_Department"))
    private Contact Contact;


}
