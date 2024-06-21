package com.gaming.domain.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_jogo")
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String editor;

    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("jogo")
    private List<Desenvolvedor> desenvolvedores;

    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("jogo")
    private List<Genero> genero;

    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("jogo")
    private List<Plataforma> plataformas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }

    public void setDesenvolvedores(List<Desenvolvedor> desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }

    public List<Genero> getGenero() {
        return genero;
    }

    public void setGenero(List<Genero> genero) {
        this.genero = genero;
    }

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(List<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }
}