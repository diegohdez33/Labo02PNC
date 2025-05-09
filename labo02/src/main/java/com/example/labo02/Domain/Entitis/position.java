package com.example.labo02.Domain.Entitis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table

public class position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdPosition;
    @Column
    private String positionName;
    @Column
    private String positionDescription;
    @Column
    private int salary;

    @OneToOne
    @JoinColumn(name = "IdDepartment", nullable = false, foreignKey = @ForeignKey(name = "fk_position_Department"))
    private Department Department;




}
