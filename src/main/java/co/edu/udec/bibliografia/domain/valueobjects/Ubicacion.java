package co.edu.udec.bibliografia.domain.valueobjects;

import co.edu.udec.bibliografia.domain.enums.TipoUbicacion;
import co.edu.udec.bibliografia.domain.exceptions.DominioException;

public record Ubicacion(TipoUbicacion tipoLugar, String descripcion) {
    public Ubicacion {
        if (tipoLugar == null) {
            throw new DominioException("El tipo de ubicación es obligatorio");
        }
        if (descripcion == null || descripcion.isBlank()) {
            throw new DominioException("La descripción de la ubicación no puede estar vacía");
        }
    }
}