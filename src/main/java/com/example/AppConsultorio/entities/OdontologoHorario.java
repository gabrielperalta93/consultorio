package com.example.AppConsultorio.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OdontologoHorario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @ManyToOne
    @JoinColumn(name = "odontologo_id", referencedColumnName = "id")
    private Odontologo odontologo;

    @ManyToOne
    @JoinColumn(name = "horario_id", referencedColumnName = "id")
    private Horario horario;

    @ManyToOne
    @JoinColumn(name = "estadoOdontologoHorario_id", referencedColumnName = "id")
    private EstadoOdontologoHorario estadoOdontologoHorario;

}
