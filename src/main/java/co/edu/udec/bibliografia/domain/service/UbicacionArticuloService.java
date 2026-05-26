package co.edu.udec.bibliografia.domain.services;

import co.edu.udec.bibliografia.domain.exceptions.DominioException;
import co.edu.udec.bibliografia.domain.model.ArticuloCientifico;
import co.edu.udec.bibliografia.domain.valueobjects.Ubicacion;

public class UbicacionArticuloService {

    /**
     * Valida las reglas de negocio para determinar si una copia física
     * puede ser transferida a una nueva ubicación.
     */
    public boolean puedeTransferirCopia(ArticuloCientifico articulo, Ubicacion nuevaUbicacion) {
        if (articulo == null || nuevaUbicacion == null) {
            throw new DominioException("El artículo y la nueva ubicación son obligatorios para la transferencia");
        }

        if (!articulo.isTieneCopia()) {
            throw new DominioException("El artículo no tiene una copia física registrada para transferir");
        }

        Ubicacion ubicacionActual = articulo.getUbicacionCopia();

        // Regla de dominio: No se puede transferir a la misma ubicación exacta donde ya está
        if (ubicacionActual.tipoLugar() == nuevaUbicacion.tipoLugar() &&
                ubicacionActual.descripcion().equalsIgnoreCase(nuevaUbicacion.descripcion())) {
            return false;
        }

        return true;
    }
}