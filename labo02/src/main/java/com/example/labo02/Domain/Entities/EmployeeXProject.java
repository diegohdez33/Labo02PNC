package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_x_project")
public class EmployeeXProject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEmployeeXProject;

    @Column
    private Date startDate;

    @ManyToOne
    @JoinColumn(name = "id_type_employee", nullable = false, foreignKey = @ForeignKey(name = "fk_type_employee"))
    private TypeEmployee typeEmployee;

    @ManyToOne
    @JoinColumn(name = "id_project", nullable = false, foreignKey = @ForeignKey(name = "fk_project"))
    private Project project;

    /*
    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false, foreignKey = @ForeignKey(name = "fk_employee"))
    private Employee employee;
    */


}
