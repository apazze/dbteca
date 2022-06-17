package com.example.dbteca.entity;

import javax.persistence.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String isbn;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Autor autor;
}