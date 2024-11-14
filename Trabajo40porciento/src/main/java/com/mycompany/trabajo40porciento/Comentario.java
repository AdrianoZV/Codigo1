/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo40porciento;

import java.util.ArrayList;
import java.util.List;

public class Comentario {
    private Usuario autor;
    private String descripcion;
    private List<Comentario> comentarios;

    public Comentario(Usuario autor, String descripcion) {
        this.autor = autor;
        this.descripcion = descripcion;
        this.comentarios = new ArrayList<>();
    }

    // Getters y Setters
    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    // Método para agregar un comentario de respuesta
    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }
}