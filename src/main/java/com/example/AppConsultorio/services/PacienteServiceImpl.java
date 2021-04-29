package com.example.AppConsultorio.services;

import com.example.AppConsultorio.entities.Paciente;
import com.example.AppConsultorio.repositories.IPacienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteServiceImpl implements IPacienteService {

    public final IPacienteRepository pacienteRepository;

    public PacienteServiceImpl(IPacienteRepository studentRepository) {
        this.pacienteRepository = studentRepository;
    }

    @Override
    @Transactional
    public void savePaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    @Transactional
    public void deletePaciente(Long pacienteId) {
        pacienteRepository.deleteById(pacienteId);
    }

    @Override
    @Transactional(readOnly = true)
    public Paciente findPaciente(Long pacienteId) {
        return pacienteRepository.findById(pacienteId).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }
}
