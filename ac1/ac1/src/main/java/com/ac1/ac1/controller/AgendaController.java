package com.ac1.ac1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ac1.ac1.model.Agenda;
import com.ac1.ac1.repository.AgendaRepository;

public class AgendaController {
    @Autowired
    private AgendaRepository repository;
    
    @PostMapping
    public Agenda cadastrarAgenda(@RequestBody Agenda agenda){
        return repository.save(agenda);
    }

    @GetMapping
    public ResponseEntity<List<Agenda>> findAll() {
        List<Agenda> result = repository.findAll();

        return ResponseEntity.ok(result);
    }

    @PutMapping
    public Agenda editarAgenda(@RequestBody Agenda agenda) {
        return repository.save(agenda);
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Agenda> deletarAgenda(@PathVariable Long id) {
        Agenda result = repository.findById(id).orElseThrow();

        repository.delete(result);

        return ResponseEntity.ok(result);
    }
}
