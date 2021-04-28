package com.example.AppConsultorio.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    private String name;
    private String lastName;
    private int dni;
}
