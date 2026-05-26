package co.edu.udec.bibliografia.domain.model;

public interface Especificacion<T> {
    boolean esSatisfechaPor(T candidato);
}