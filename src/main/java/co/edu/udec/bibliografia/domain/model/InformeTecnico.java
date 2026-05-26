package co.edu.udec.bibliografia.domain.model;

import co.edu.udec.bibliografia.domain.exceptions.DominioException;

public class InformeTecnico extends ArticuloCientifico {
    private final String numeroIdentificacion;
    private final String centroPublicacion;

    public InformeTecnico(String id, String titulo, String numeroIdentificacion, String centroPublicacion) {
        super(id, titulo);
        if (numeroIdentificacion == null || numeroIdentificacion.isBlank()) {
            throw new DominioException("El número de identificación del informe técnico es obligatorio");
        }
        this.numeroIdentificacion = numeroIdentificacion;
        this.centroPublicacion = centroPublicacion;
    }

    public String getNumeroIdentificacion() { return numeroIdentificacion; }
}