package com.example.AppConsultorio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoOdontologoHorario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    private String descripcion;
}
