
package trabajo_final_poo2;

import java.util.ArrayList;
import java.util.List;

public class UsuarioBuilder {
    // Atributos
    String nombre;
    String correo;
    String contraseña;
    int edad;
    String genero;
    String telefono;
    List<Usuario> seguidores = new ArrayList<>();
    List<Usuario> seguidos = new ArrayList<>();
    List<Comentario> comentarios = new ArrayList<>();
    List<Incidente> incidentesCreados = new ArrayList<>();
    List<Incidente> incidentesMeGusta = new ArrayList<>();
    List<Incidente> incidentesGuardados = new ArrayList<>();

    // Métodos para establecer valores
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

    // Método para construir el objeto Usuario
    public Usuario build() {
        
        return new Usuario(this);
    }
}



