package com.example.AppConsultorio.services;

import com.example.AppConsultorio.entities.Paciente;
import com.example.AppConsultorio.repositories.IPacienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteServiceImpl implements IPacienteService {

    public final IPacienteRepository studentRepository;

    public PacienteServiceImpl(IPacienteRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public void savePaciente(Paciente student) {
        studentRepository.save(student);
    }

    @Override
    @Transactional
    public void deletePaciente(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    @Transactional(readOnly = true)
    public Paciente findPaciente(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> getPacientes() {
        return studentRepository.findAll();
    }
}
