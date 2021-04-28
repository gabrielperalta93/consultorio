package com.example.AppConsultorio.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    private LocalDate day;
    private String horaInicio;
    private String horaFin;
}
