/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo40porciento;

import java.util.Date;
import java.util.List;

public interface IncidenteInterface {
    String getDescripcion();
    void setDescripcion(String descripcion);

    String getUbicacion();
    void setUbicacion(String ubicacion);

    String getZonaExacta();
    void setZonaExacta(String zonaExacta);

    Date getFechaHora();
    void setFechaHora(Date fechaHora);

    String getCategoria();
    void setCategoria(String categoria);

    List<Imagen> getImagenesEvidencia();
    void setImagenesEvidencia(List<Imagen> imagenesEvidencia);

    int getNivelPeligro();
    void setNivelPeligro(int nivelPeligro);
}