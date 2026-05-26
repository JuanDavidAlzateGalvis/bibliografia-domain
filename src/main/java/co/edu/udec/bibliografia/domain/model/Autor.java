package co.edu.udec.bibliografia.domain.model;

import co.edu.udec.bibliografia.domain.exceptions.DominioException;
import co.edu.udec.bibliografia.domain.valueobjects.CorreoElectronico;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private final String id;
    private final String nombre;
    private String centroTrabajo;
    private CorreoElectronico correoElectronico;
    private final List<String> temasInvestigacion;

    public Autor(String id, String nombre, String centroTrabajo, CorreoElectronico correoElectronico) {
        if (id == null || id.isBlank()) throw new DominioException("El ID del autor es obligatorio");
        if (nombre == null || nombre.isBlank()) throw new DominioException("El nombre del autor es obligatorio");

        this.id = id;
        this.nombre = nombre;
        this.centroTrabajo = centroTrabajo;
        this.correoElectronico = correoElectronico;
        this.temasInvestigacion = new ArrayList<>();
    }

    public void agregarTemaInvestigacion(String tema) {
        if (tema != null && !tema.isBlank() && !temasInvestigacion.contains(tema)) {
            temasInvestigacion.add(tema);
        }
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<String> getTemasInvestigacion() { return temasInvestigacion; }
}