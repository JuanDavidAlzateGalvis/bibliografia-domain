package co.edu.udec.bibliografia.domain.model;

public class ArticuloDisponibleSpec implements Especificacion<ArticuloCientifico> {

    @Override
    public boolean esSatisfechaPor(ArticuloCientifico articulo) {
        // La regla de negocio indica que está disponible si se marcó que tiene copia
        // y además se registró su ubicación física (estantería o despacho).
        return articulo != null && articulo.isTieneCopia() && articulo.getUbicacionCopia() != null;
    }
}