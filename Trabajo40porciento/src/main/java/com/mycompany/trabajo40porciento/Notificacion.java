/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo40porciento;

public class Notificacion {
    private String titulo;
    private String descripcion;
    private TipoNotificacionEnum tipo; // Asegúrate de definir la clase TipoNotificacion

    public Notificacion(String titulo, String descripcion, TipoNotificacionEnum tipo) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoNotificacionEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoNotificacionEnum tipo) {
        this.tipo = tipo;
    }
}