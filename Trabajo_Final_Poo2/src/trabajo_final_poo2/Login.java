
package trabajo_final_poo2;

import java.util.ArrayList;
import java.util.List;

public class Login {
    // Atributo
    private List<Usuario> usuarios;

    // Constructor
    public Login() {
        this.usuarios = new ArrayList<>();
    }

    // Método para agregar un usuario (útil para pruebas)
    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    // Método para autenticar un usuario basado en su nombre y contraseña
    public boolean autenticar(String nombre, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    // Método para eliminar un usuario basado en su nombre y contraseña
    public void eliminarUsuario(String nombre, String contraseña) {
        usuarios.removeIf(usuario -> usuario.getNombre().equals(nombre) && usuario.getContraseña().equals(contraseña));
    }
}
