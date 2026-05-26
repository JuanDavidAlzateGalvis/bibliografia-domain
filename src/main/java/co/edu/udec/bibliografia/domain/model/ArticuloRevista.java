package co.edu.udec.bibliografia.domain.model;

import co.edu.udec.bibliografia.domain.exceptions.DominioException;

public class ArticuloRevista extends ArticuloCientifico {
    private final String nombreRevista;
    private final int anioPublicacion;

    public ArticuloRevista(String id, String titulo, String nombreRevista, int anioPublicacion) {
        super(id, titulo);
        if (nombreRevista == null || nombreRevista.isBlank()) {
            throw new DominioException("El nombre de la revista es obligatorio");
        }
        this.nombreRevista = nombreRevista;
        this.anioPublicacion = anioPublicacion;
    }
}