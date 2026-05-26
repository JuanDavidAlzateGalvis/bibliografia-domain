package co.edu.udec.bibliografia.domain.valueobjects;

import co.edu.udec.bibliografia.domain.exceptions.DominioException;
import java.time.LocalDate;

public record DetallesCongreso(String nombre, int edicion, String ciudad, LocalDate fechaInicio, LocalDate fechaFin) {
    public DetallesCongreso {
        if (nombre == null || nombre.isBlank()) {
            throw new DominioException("El nombre del congreso es obligatorio");
        }
        if (edicion <= 0) {
            throw new DominioException("La edición del congreso debe ser mayor a cero");
        }
        if (fechaInicio != null && fechaFin != null && fechaInicio.isAfter(fechaFin)) {
            throw new DominioException("La fecha de inicio no puede ser posterior a la fecha de fin");
        }
    }
}