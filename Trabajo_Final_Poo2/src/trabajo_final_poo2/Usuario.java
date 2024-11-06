
package trabajo_final_poo2;

import java.util.List;

public class Usuario implements Observer {
    // Atributos
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

    // Constructor que recibe un UsuarioBuilder
    public Usuario(UsuarioBuilder builder) {
        this.nombre = builder.nombre;
        this.correo = builder.correo;
        this.contraseña = builder.contraseña;
        this.edad = builder.edad;
        this.genero = builder.genero;
        this.telefono = builder.telefono;
        this.seguidores = builder.seguidores;
        this.seguidos = builder.seguidos;
        this.comentarios = builder.comentarios;
        this.incidentesCreados = builder.incidentesCreados;
        this.incidentesMeGusta = builder.incidentesMeGusta;
        this.incidentesGuardados = builder.incidentesGuardados;
    }

    // Métodos getter
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
    
      // Implementación del método de Observer para actualizar
    @Override
    public void actualizar(Incidente incidente) {
        System.out.println("Usuario " + nombre + " ha sido notificado sobre un incidente: " + "Descripcion");
        // Agregar lógica adicional si se desea, como guardar el incidente en una lista.
    }  

}
