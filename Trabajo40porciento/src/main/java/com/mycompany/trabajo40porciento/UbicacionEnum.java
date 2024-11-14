
package com.mycompany.trabajo40porciento;

public enum UbicacionEnum {
    ANCÓN("Ancón"),
    ATE("Ate"),
    BARRANCO("Barranco"),
    BREÑA("Breña"),
    CARABAYLLO("Carabayllo"),
    CHACLACAYO("Chaclacayo"),
    CHORRILLOS("Chorrillos"),
    CIENEGUILLA("Cieneguilla"),
    COMAS("Comas"),
    EL_AGUSTINO("El Agustino"),
    INDEPENDENCIA("Independencia"),
    JESÚS_MARÍA("Jesús María"),
    LA_MOLINA("La Molina"),
    LA_VICTORIA("La Victoria"),
    Lince("Lince"),
    LOS_OLIVOS("Los Olivos"),
    LURIGANCHO("Lurigancho"),
    LURÍN("Lurín"),
    MAGDALENA_DEL_MAR("Magdalena del Mar"),
    MIRAFLORES("Miraflores"),
    PACHACÁMAC("Pachacámac"),
    PUCUSANA("Pucusana"),
    PUENTE_PIEDRA("Puente Piedra"),
    PUNTA_HERMOSA("Punta Hermosa"),
    PUNTA_NEGRA("Punta Negra"),
    RÍMAC("Rímac"),
    SAN_BARTOLO("San Bartolo"),
    SAN_BORJA("San Borja"),
    SAN_ISIDRO("San Isidro"),
    SAN_JUAN_DE_LURIGANCHO("San Juan de Lurigancho"),
    SAN_JUAN_DE_MIRAFLORES("San Juan de Miraflores"),
    SAN_LUIS("San Luis"),
    SAN_MARTÍN_DE_PORRES("San Martín de Porres"),
    SAN_MIGUEL("San Miguel"),
    SANTA_ANITA("Santa Anita"),
    SANTA_MARÍA_DEL_MAR("Santa María del Mar"),
    SANTA_ROSA("Santa Rosa"),
    SANTIAGO_DE_SURCO("Santiago de Surco"),
    SURQUILLO("Surquillo"),
    VILLA_EL_SALVADOR("Villa El Salvador"),
    VILLA_MARÍA_DEL_TRIUNFO("Villa María del Triunfo"),
    CERCADO_DE_LIMA("Cercado de Lima");

    private final String nombre;

    UbicacionEnum(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}