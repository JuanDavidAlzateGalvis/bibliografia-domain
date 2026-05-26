package co.edu.udec.bibliografia.domain.factory;

import co.edu.udec.bibliografia.domain.model.ArticuloCongreso;
import co.edu.udec.bibliografia.domain.model.ArticuloRevista;
import co.edu.udec.bibliografia.domain.model.InformeTecnico;
import co.edu.udec.bibliografia.domain.enums.TipoCongreso;
import co.edu.udec.bibliografia.domain.valueobjects.DetallesCongreso;

public class ArticuloFactory {

    public static InformeTecnico crearInforme(String id, String titulo, String numeroId, String centro) {
        return new InformeTecnico(id, titulo, numeroId, centro);
    }

    public static ArticuloCongreso crearCongreso(String id, String titulo, DetallesCongreso detalles, TipoCongreso tipo) {
        return new ArticuloCongreso(id, titulo, detalles, tipo);
    }

    public static ArticuloRevista crearRevista(String id, String titulo, String nombreRevista, int anio) {
        return new ArticuloRevista(id, titulo, nombreRevista, anio);
    }
}