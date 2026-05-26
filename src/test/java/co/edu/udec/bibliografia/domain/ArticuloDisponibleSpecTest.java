package co.edu.udec.bibliografia.domain;

import co.edu.udec.bibliografia.domain.enums.TipoUbicacion;
import co.edu.udec.bibliografia.domain.factory.ArticuloFactory;
import co.edu.udec.bibliografia.domain.model.ArticuloDisponibleSpec;
import co.edu.udec.bibliografia.domain.model.InformeTecnico;
import co.edu.udec.bibliografia.domain.valueobjects.Ubicacion;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArticuloDisponibleSpecTest {

    @Test
    void debeRetornarTrueSiTieneCopiaYUbicacion() {
        // Usamos el Factory para crear la entidad
        InformeTecnico informe = ArticuloFactory.crearInforme("1", "Clean Architecture", "INF-001", "UdeC");
        Ubicacion ubicacion = new Ubicacion(TipoUbicacion.ESTANTERIA_LABORATORIO, "Estante A1");

        // Ejecutamos la regla de dominio
        informe.registrarCopiaFisica(ubicacion);
        ArticuloDisponibleSpec spec = new ArticuloDisponibleSpec();

        // Verificamos con AssertJ
        assertThat(spec.esSatisfechaPor(informe)).isTrue();
    }

    @Test
    void debeRetornarFalseSiNoTieneCopia() {
        InformeTecnico informe = ArticuloFactory.crearInforme("2", "DDD Basico", "INF-002", "UdeC");
        ArticuloDisponibleSpec spec = new ArticuloDisponibleSpec();

        assertThat(spec.esSatisfechaPor(informe)).isFalse();
    }
}