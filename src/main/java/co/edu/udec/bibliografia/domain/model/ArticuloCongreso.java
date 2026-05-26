package co.edu.udec.bibliografia.domain.model;

import co.edu.udec.bibliografia.domain.enums.TipoCongreso;
import co.edu.udec.bibliografia.domain.exceptions.DominioException;
import co.edu.udec.bibliografia.domain.valueobjects.DetallesCongreso;

public class ArticuloCongreso extends ArticuloCientifico {
    private final DetallesCongreso detallesCongreso;
    private final TipoCongreso tipoCongreso;

    public ArticuloCongreso(String id, String titulo, DetallesCongreso detallesCongreso, TipoCongreso tipoCongreso) {
        super(id, titulo);
        if (detallesCongreso == null || tipoCongreso == null) {
            throw new DominioException("Los detalles y el tipo de congreso son obligatorios");
        }
        this.detallesCongreso = detallesCongreso;
        this.tipoCongreso = tipoCongreso;
    }

    public TipoCongreso getTipoCongreso() { return tipoCongreso; }
}