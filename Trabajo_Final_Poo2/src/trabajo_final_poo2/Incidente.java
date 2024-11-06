
package trabajo_final_poo2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Incidente implements SujetoNotificaciones {
    protected String descripcion;
    protected UbicacionEnum ubicacion;
    protected String zonaExacta;
    protected Date fechaHora;
    protected String categoria;
    protected List<Imagen> imagenesEvidencia;
    protected int nivelPeligro;
    protected List<Observer> observers;

    public Incidente(String descripcion, UbicacionEnum ubicacion, String zonaExacta, Date fechaHora, String categoria, int nivelPeligro) {
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.zonaExacta = zonaExacta;
        this.fechaHora = fechaHora;
        this.categoria = categoria;
        this.nivelPeligro = nivelPeligro;
        this.imagenesEvidencia = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    // Getters y setters para los atributos según sea necesario

    // Implementación de los métodos de SujetoNotificaciones

    @Override
    public void agregarObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void eliminarObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.actualizar(this); // Notifica el incidente actual a todos los observadores
        }
    }

    // Método para agregar evidencia de imagen
    public void agregarImagenEvidencia(Imagen imagen) {
        imagenesEvidencia.add(imagen);
    }

    // Otros métodos abstractos o concretos específicos de los incidentes
}
