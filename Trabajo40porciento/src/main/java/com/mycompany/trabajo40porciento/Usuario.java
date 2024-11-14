/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo40porciento;

import java.util.List;

/**
 *
 * @author JAIRO
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;
    private int edad;
    private String genero;
    private String telefono;
    private List<Usuario> seguidores;
    private List<Usuario> seguidos;
    private List<Comentario> comentarios;
    private List<Incidente> incidentesCreados;
    private List<Incidente> incidentesMeGusta;
    private List<Incidente> incidentesGuardados;

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    
    
    public Usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    

    public Usuario(String nombre, String correo, String contraseña, int edad, String genero, String telefono, List<Usuario> seguidores, List<Usuario> seguidos, List<Comentario> comentarios, List<Incidente> incidentesCreados, List<Incidente> incidentesMeGusta, List<Incidente> incidentesGuardados) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.edad = edad;
        this.genero = genero;
        this.telefono = telefono;
        this.seguidores = seguidores;
        this.seguidos = seguidos;
        this.comentarios = comentarios;
        this.incidentesCreados = incidentesCreados;
        this.incidentesMeGusta = incidentesMeGusta;
        this.incidentesGuardados = incidentesGuardados;
    }

    Usuario(UsuarioBuilder aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Usuario> getSeguidores() {
        return seguidores;
    }

    public List<Usuario> getSeguidos() {
        return seguidos;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public List<Incidente> getIncidentesCreados() {
        return incidentesCreados;
    }

    public List<Incidente> getIncidentesMeGusta() {
        return incidentesMeGusta;
    }

    public List<Incidente> getIncidentesGuardados() {
        return incidentesGuardados;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + '}';
    }

 
    }
