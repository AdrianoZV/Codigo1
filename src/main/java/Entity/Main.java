/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Entity;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Gestión de Libros
        GestionLibro gestionLibro = new GestionLibro();
        
        // Crear algunos usuarios
        Usuario usuario1 = new Usuario(1, "Said", "Taravay", 30);
        
        Usuario usuario2 = new Usuario(2, "María", "Gómez", 25);
        
        // Agregar usuarios como observadores
        gestionLibro.agregarObservador(usuario1);
        gestionLibro.agregarObservador(usuario2);
        
        // Listar libros al inicio (debería mostrar la lista cargada)
        gestionLibro.listarLibros();
        
        // Crear y agregar un nuevo libro
               Libro libro1 = new Libro.Builder()
                .setTitulo("Cien años de soledad")
                .setAutor("Gabriel García Márquez")
                .setAñoPublicacion(1967)
                .setGenero("Ficción")
                .setNumeroPaginas(400)
                .setNumeroCapitulos(20)
                .setEstadoPrestamo("LIBRE") // Este es el valor por defecto, pero puedes especificarlo
                .build();
        gestionLibro.agregarLibro(libro1); // Notifica a los observadores que el libro está disponible
        
        // Crear y agregar otro libro que no está disponible
        Libro libro2 = new Libro.Builder()
                .setTitulo("El Principito")
                .setAutor("Antoine de Saint-Exupéry")
                .setAñoPublicacion(1943)
                .setGenero("Ficción")
                .setNumeroPaginas(96)
                .setNumeroCapitulos(27)
                .setEstadoPrestamo("PRESTADO") // Cambia el estado para indicar que está ocupado
                .setFechaLiberacion("2024-12-01") // Solo si el libro está "PRESTADO"
                .build();
        
        gestionLibro.agregarLibro(libro2); // No notificará a los observadores ya que no está "LIBRE"
        
        // Actualizar el estado de préstamo de un libro a "LIBRE"
        gestionLibro.actualizarEstadoPrestamo("El Principito", "LIBRE", "2024-12-01"); // Notifica a los observadores que ahora está disponible
        
        // Listar libros después de las operaciones
        gestionLibro.listarLibros();
        
        // Intentar eliminar un libro
        gestionLibro.eliminarLibro("Cien años de soledad"); // Eliminará el libro y notificará en caso de que se necesite
    }
}
