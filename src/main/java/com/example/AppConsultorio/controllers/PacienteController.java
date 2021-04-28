package com.example.AppConsultorio.controllers;

import com.example.AppConsultorio.entities.Paciente;
import com.example.AppConsultorio.services.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    IPacienteService pacienteService;

    @PostMapping("/save")
    private String savePaciente(@RequestBody Paciente paciente){
        pacienteService.savePaciente(paciente);
        return "Paciente created succesfully";
    }

    @GetMapping("/find/{id}")
    private Paciente findById(@PathVariable Long id){
        return pacienteService.findPaciente(id);
    }

    @PatchMapping("/update/{id}")
    private String update1(@PathVariable Long id, @RequestParam String name){
        Paciente student = pacienteService.findPaciente(id);
        student.setName(name);
        pacienteService.savePaciente(student);
        return "Paciente updated succesfully (update1)";
    }

    @PutMapping("/update")
    private String update2(@RequestBody Paciente student){
        pacienteService.savePaciente(student);
        return "Paciente updated succesfully (update2)";
    }

    @GetMapping("/all")
    private List<Paciente> findAll(){
        return pacienteService.getPacientes();
    }

    @DeleteMapping("/delete/{id}")
    private String deleteStudent(@PathVariable Long id){
        pacienteService.deletePaciente(id);
        return "Paciente deleted succesfully";
    }
}
