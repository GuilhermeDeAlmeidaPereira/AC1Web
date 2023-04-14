package com.ac1.ac1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac1.ac1.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
