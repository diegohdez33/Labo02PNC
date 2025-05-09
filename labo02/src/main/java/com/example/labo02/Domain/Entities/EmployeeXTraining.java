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

public class EmployeeXTraining {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdEmpleeXTraining;

    @ManyToOne
    @JoinColumn(name = "IdTraining", nullable = false, foreignKey = @ForeignKey(name = "fk_EmpleeXTraining_Training"))
    private Training Training;


    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false, foreignKey = @ForeignKey(name = "fk_EmpleeXTraining_Emplee"))
    private Employee Employee;


}
