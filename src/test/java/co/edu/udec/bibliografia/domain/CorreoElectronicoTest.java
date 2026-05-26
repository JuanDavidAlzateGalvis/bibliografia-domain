package co.edu.udec.bibliografia.domain;

import co.edu.udec.bibliografia.domain.exceptions.DominioException;
import co.edu.udec.bibliografia.domain.valueobjects.CorreoElectronico;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CorreoElectronicoTest {

    @Test
    void debeCrearCorreoValido() {
        var correo = new CorreoElectronico("juan@unicartagena.edu.co");

        assertThat(correo.valor()).isEqualTo("juan@unicartagena.edu.co");
    }

    @Test
    void debeFallarConCorreoInvalido() {
        assertThatThrownBy(() -> new CorreoElectronico("correo-sin-arroba"))
                .isInstanceOf(DominioException.class)
                .hasMessageContaining("Formato de correo electrónico inválido");
    }
}