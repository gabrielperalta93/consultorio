package com.example.AppConsultorio.controllers;

import com.example.AppConsultorio.dtos.TurnoDTO;
import com.example.AppConsultorio.entities.Paciente;
import com.example.AppConsultorio.entities.Turno;
import com.example.AppConsultorio.services.ITurnoService;
import com.example.AppConsultorio.services.TurnoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turno")
public class TurnoController {

    @Autowired
    ITurnoService turnoService;

    @PostMapping("/save")
    private String saveTurno(@RequestBody TurnoDTO turno){
        turnoService.saveTurno(turno);
        return "Turno created succesfully";
    }

    @GetMapping("/all")
    private List<Turno> findAll(){
        return turnoService.getTurnos();
    }

}
