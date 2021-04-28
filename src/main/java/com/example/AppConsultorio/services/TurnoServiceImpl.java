package com.example.AppConsultorio.services;

import com.example.AppConsultorio.dtos.TurnoDTO;
import com.example.AppConsultorio.entities.EstadoOdontologoHorario;
import com.example.AppConsultorio.entities.OdontologoHorario;
import com.example.AppConsultorio.entities.Paciente;
import com.example.AppConsultorio.entities.Turno;
import com.example.AppConsultorio.repositories.IOdontologoHorarioRepository;
import com.example.AppConsultorio.repositories.IPacienteRepository;
import com.example.AppConsultorio.repositories.ITurnoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TurnoServiceImpl implements ITurnoService{

    public final ITurnoRepository turnoRepository;
    public final IPacienteRepository pacienteRepository;
    public final IOdontologoHorarioRepository odontologoHorarioRepository;

    public TurnoServiceImpl(ITurnoRepository turnoRepository, IPacienteRepository pacienteRepository, IOdontologoHorarioRepository odontologoHorarioRepository) {
        this.turnoRepository = turnoRepository;
        this.pacienteRepository = pacienteRepository;
        this.odontologoHorarioRepository = odontologoHorarioRepository;
    }

    @Override
    @Transactional
    public void saveTurno(TurnoDTO turno) {
        Paciente paciente = pacienteRepository.findById(turno.getIdPaciente()).orElse(null);
        if (paciente != null){
            OdontologoHorario odontologoHorario = odontologoHorarioRepository.findById(turno.getIdOdontologoHorario()).orElse(null);

            if (odontologoHorario != null){
                EstadoOdontologoHorario estado = new EstadoOdontologoHorario(3L, "reservado");
                odontologoHorario.setEstadoOdontologoHorario(estado);
                odontologoHorarioRepository.save(odontologoHorario);

                Turno nuevoTurno = new Turno();
                nuevoTurno.setPaciente(paciente);
                nuevoTurno.setOdontologoHorario(odontologoHorario);
                turnoRepository.save(nuevoTurno);
            }
        }
    }

    @Override
    public List<Turno> getTurnos() {
        return turnoRepository.findAll();
    }
}
