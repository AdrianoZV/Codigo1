/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo40porciento;

import java.util.Date;

public class IncidenteFactory {

    public Incidente crearIncidente(String tipo, String descripcion, UbicacionEnum ubicacion, 
                                     String zonaExacta, Date fecha, String categoria) {
      /*  switch (tipo.toLowerCase()) {
            case "tipo1":
                return newTipo1Incidente(descripcion, ubicacion, zonaExacta, fecha, categoria);
            case "tipo2":
                return new Tipo2Incidente(descripcion, ubicacion, zonaExacta, fecha, categoria);
            // Agrega más tipos de incidentes según sea necesario
            default:
                throw new IllegalArgumentException("Tipo de incidente no reconocido: " + tipo);
        }*/return null;
      /*  switch (tipo.toLowerCase()) {
            case "tipo1":
                return newTipo1Incidente(descripcion, ubicacion, zonaExacta, fecha, categoria);
            case "tipo2":
                return new Tipo2Incidente(descripcion, ubicacion, zonaExacta, fecha, categoria);
            // Agrega más tipos de incidentes según sea necesario
            default:
                throw new IllegalArgumentException("Tipo de incidente no reconocido: " + tipo);
        }*/
    }
}