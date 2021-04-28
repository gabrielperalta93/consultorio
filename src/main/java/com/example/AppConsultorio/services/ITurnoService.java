package com.example.AppConsultorio.services;

import com.example.AppConsultorio.dtos.TurnoDTO;
import com.example.AppConsultorio.entities.Turno;

import java.util.List;

public interface ITurnoService {
    public void saveTurno(TurnoDTO turno);
    //public void deletePaciente(Long studentId);
    //public Paciente findPaciente(Long studentId);
    public List<Turno> getTurnos();
}
