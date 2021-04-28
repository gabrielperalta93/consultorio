package com.example.AppConsultorio.repositories;

import com.example.AppConsultorio.entities.OdontologoHorario;
import com.example.AppConsultorio.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoHorarioRepository extends JpaRepository<OdontologoHorario, Long> {
}
