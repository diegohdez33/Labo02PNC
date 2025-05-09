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

public class Assessments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdAssessments;

    @Column
    private String quanlification;

    @Column
    private String coment;

    @ManyToOne
    @JoinColumn(name = "IdAssessmentsType", nullable = false, foreignKey = @ForeignKey(name = "fk_Assessments_AssessmentsType"))
    private AssessmentsType assessmentsType;

    @ManyToOne
    @JoinColumn(name = "IdTraining", nullable = false, foreignKey = @ForeignKey(name = "fk_Assessments_Training"))
    private Training Training;
}
