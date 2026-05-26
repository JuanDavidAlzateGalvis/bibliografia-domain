package co.edu.udec.bibliografia.domain.valueobjects;

import co.edu.udec.bibliografia.domain.exceptions.DominioException;

public record CorreoElectronico(String valor) {
    public CorreoElectronico {
        if (valor == null || valor.isBlank()) {
            throw new DominioException("El correo electrónico no puede estar vacío");
        }
        if (!valor.contains("@")) {
            throw new DominioException("Formato de correo electrónico inválido");
        }
    }
}