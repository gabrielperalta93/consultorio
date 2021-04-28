package com.example.AppConsultorio.services;

import com.example.AppConsultorio.entities.Paciente;

import java.util.List;

public interface IPacienteService {
    public void savePaciente(Paciente student);
    public void deletePaciente(Long studentId);
    public Paciente findPaciente(Long studentId);
    public List<Paciente> getPacientes();
}
