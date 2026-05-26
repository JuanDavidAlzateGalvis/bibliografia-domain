package co.edu.udec.bibliografia.domain.model;

import co.edu.udec.bibliografia.domain.exceptions.DominioException;
import co.edu.udec.bibliografia.domain.valueobjects.CorreoElectronico;
import co.edu.udec.bibliografia.domain.valueobjects.Ubicacion;

import java.util.ArrayList;
import java.util.List;

public abstract class ArticuloCientifico {
    protected final String id;
    protected final String titulo;
    protected final List<Autor> autores;
    protected final List<String> palabrasClave;
    protected CorreoElectronico correoContacto;
    protected boolean tieneCopia;
    protected Ubicacion ubicacionCopia;

    public ArticuloCientifico(String id, String titulo) {
        if (id == null || id.isBlank()) throw new DominioException("El ID del artículo es obligatorio");
        if (titulo == null || titulo.isBlank()) throw new DominioException("El título es obligatorio");

        this.id = id;
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.palabrasClave = new ArrayList<>();
        this.tieneCopia = false;
    }

    public void agregarAutor(Autor autor) {
        if (autor == null) throw new DominioException("El autor no puede ser nulo");
        this.autores.add(autor);
    }

    public void registrarCopiaFisica(Ubicacion ubicacion) {
        if (ubicacion == null) throw new DominioException("La ubicación es obligatoria para registrar una copia física");
        this.tieneCopia = true;
        this.ubicacionCopia = ubicacion;
    }

    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public boolean isTieneCopia() { return tieneCopia; }
    public Ubicacion getUbicacionCopia() { return ubicacionCopia; }
}