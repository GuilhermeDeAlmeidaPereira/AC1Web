package com.ac1.ac1.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor

@Entity
public class Curso {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    

    @Column(length = 200, nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Integer cargaHoraria;

    private String objetivos;

    private String ementa;
    
    @ManyToMany(mappedBy = "cursos")
    private List<Professor> professores = new ArrayList<>();

}
