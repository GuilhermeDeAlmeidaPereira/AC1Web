package com.ac1.ac1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac1.ac1.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}