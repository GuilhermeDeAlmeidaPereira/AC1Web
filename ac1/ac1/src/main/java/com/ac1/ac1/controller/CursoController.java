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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ac1.ac1.model.Curso;
import com.ac1.ac1.repository.CursoRepository;

@RestController
@RequestMapping(value = "/cursos")
public class CursoController {
    @Autowired
    private CursoRepository repository;
    
    @PostMapping
    public Curso cadastrarCurso(@RequestBody Curso curso){
        return repository.save(curso);
    }

    @GetMapping
    public ResponseEntity<List<Curso>> findAll() {
        List<Curso> result = repository.findAll();

        return ResponseEntity.ok(result);
    }

    @PutMapping
    public Curso editarCurso(@RequestBody Curso curso) {
        return repository.save(curso);
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Curso> deletarCurso(@PathVariable Long id) {
        Curso result = repository.findById(id).orElseThrow();

        repository.delete(result);

        return ResponseEntity.ok(result);
    }
}