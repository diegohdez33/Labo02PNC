package com.example.labo02.Entitis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table

public class Mentory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdMentory;

    @Column
    private Date startDate;

    @Column
    private String description;

    //Dos llaves foraneas hacia la misma tabla(employee), pense que iba a explotar
    @ManyToOne
    @JoinColumn(name = "IdMentor", nullable = false, foreignKey = @ForeignKey(name = "fk_Mentory_Employee_IdMentor"))
    private Employee mentor;
    @ManyToOne
    @JoinColumn(name = "IdMentored", nullable = false, foreignKey = @ForeignKey(name = "fk_Mentory_Employee_IdMentored"))
    private Employee mentored;

}
