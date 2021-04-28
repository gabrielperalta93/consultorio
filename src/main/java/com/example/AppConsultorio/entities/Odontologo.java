package com.example.AppConsultorio.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Odontologo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    private String name;
    private String lastName;

}
