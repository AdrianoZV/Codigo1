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
public class UsuarioBuilder {
        String nombre;
        String correo;
        String contraseña;
        private int edad;
        private String genero;
        private String telefono;
        private List<Usuario> seguidores;
        private List<Usuario> seguidos;
        private List<Comentario> comentarios;
        private List<Incidente> incidentesCreados;
        private List<Incidente> incidentesMeGusta;
        private List<Incidente> incidentesGuardados;


        public UsuarioBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public UsuarioBuilder setCorreo(String correo) {
            this.correo = correo;
            return this;
        }

        public UsuarioBuilder setContraseña(String contraseña) {
            this.contraseña = contraseña;
            return this;
        }

        public UsuarioBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public UsuarioBuilder setGenero(String genero) {
            this.genero = genero;
            return this;
        }

        public UsuarioBuilder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public UsuarioBuilder setSeguidores(List<Usuario> seguidores) {
            this.seguidores = seguidores;
            return this;
        }

        public UsuarioBuilder setSeguidos(List<Usuario> seguidos) {
            this.seguidos = seguidos;
            return this;
        }

        public UsuarioBuilder setComentarios(List<Comentario> comentarios) {
            this.comentarios = comentarios;
            return this;
        }

        public UsuarioBuilder setIncidentesCreados(List<Incidente> incidentesCreados) {
            this.incidentesCreados = incidentesCreados;
            return this;
        }

        public UsuarioBuilder setIncidentesMeGusta(List<Incidente> incidentesMeGusta) {
            this.incidentesMeGusta = incidentesMeGusta;
            return this;
        }

        public UsuarioBuilder setIncidentesGuardados(List<Incidente> incidentesGuardados) {
            this.incidentesGuardados = incidentesGuardados;
            return this;
        }


        public Usuario build() {
            return new Usuario(this);
        }
    }
