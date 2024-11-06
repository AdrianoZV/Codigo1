
package trabajo_final_poo2;

public interface SujetoNotificaciones {
    
    void agregarObserver(Observer o);
    void eliminarObserver(Observer o);
    void notificarObservers();
    
}
