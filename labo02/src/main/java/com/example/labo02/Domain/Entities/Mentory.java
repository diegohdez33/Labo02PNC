package com.example.labo02.Domain.Entities;

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

public class Mentory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdMentory;

    @Column
    private Date startDate;

    @Column
    private String description;

    //Dos llaves foraneas hacia la misma tabla(employee)
    @ManyToOne
    @JoinColumn(name = "IdMentor", nullable = false, foreignKey = @ForeignKey(name = "fk_Mentory_Employee_IdMentor"))
    private Employee mentor;
    @ManyToOne
    @JoinColumn(name = "IdMentored", nullable = false, foreignKey = @ForeignKey(name = "fk_Mentory_Employee_IdMentored"))
    private Employee mentored;

}

