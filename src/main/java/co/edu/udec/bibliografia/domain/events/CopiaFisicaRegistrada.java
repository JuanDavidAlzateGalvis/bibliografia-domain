package co.edu.udec.bibliografia.domain.events;

import java.time.Instant;

public record CopiaFisicaRegistrada(String articuloId, String descripcionUbicacion, Instant fecha) {}