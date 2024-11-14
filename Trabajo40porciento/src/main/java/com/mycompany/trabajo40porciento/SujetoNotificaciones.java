
package com.mycompany.trabajo40porciento;



public interface SujetoNotificaciones {
    
    void agregarObserver(Observer o);
    void eliminarObserver(Observer o);
    void notificarObservers();
    
}