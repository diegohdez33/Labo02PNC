package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idArea;

    @Column
    private String name;

    @Column
    private String price;
    
    @ManyToOne
    @JoinColumn(name = "id_category", nullable = false, foreignKey = @ForeignKey(name = "fk_area_category"))
    private AreaCategory areaCategory;

}
