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
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idProject;

    @Column
    private String name;

    @Column
    private String code;

    @Column
    private Date startDate;

    @ManyToOne
    @JoinColumn(name = "id_status", nullable = false, foreignKey = @ForeignKey(name = "fk_project_status"))
    private ProjectStatus projectStatus;

    @ManyToOne
    @JoinColumn(name = "id_customers", nullable = false, foreignKey = @ForeignKey(name = "fk_customer"))
    private Customers customers;

    @ManyToOne
    @JoinColumn(name = "id_area", nullable = false, foreignKey = @ForeignKey(name = "fk_area"))
    private Area area;


}
