package com.example.dbteca.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "autor")
    private List<Livro> livros;
    public String getNome() {
        return nome;
    }
    public Long getId() {
        return id;
    }

}
