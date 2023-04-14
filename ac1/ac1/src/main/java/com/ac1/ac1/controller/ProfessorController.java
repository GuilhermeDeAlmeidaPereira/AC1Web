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

import com.ac1.ac1.model.Professor;
import com.ac1.ac1.repository.ProfessorRepository;

public class ProfessorController {
    @Autowired
    private ProfessorRepository repository;
    
    @PostMapping
    public Professor cadastrarProfessor(@RequestBody Professor professor){
        return repository.save(professor);
    }

    @GetMapping
    public ResponseEntity<List<Professor>> findAll() {
        List<Professor> result = repository.findAll();

        return ResponseEntity.ok(result);
    }

    @PutMapping
    public Professor editarProfessor(@RequestBody Professor professor) {
        return repository.save(professor);
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Professor> deletarProfessor(@PathVariable Long id) {
        Professor result = repository.findById(id).orElseThrow();

        repository.delete(result);

        return ResponseEntity.ok(result);
    }
}
