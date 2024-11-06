
package trabajo_final_poo2;

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
