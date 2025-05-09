package com.example.labo02.Domain.Entities;

import com.fasterxml.jackson.databind.DatabindException;
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

public class Training {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdTraining;

    @Column
    private String topicTitle;

    @Column
    private Date date;

    @Column
    private int time;

    @Column
    private String description;

}

