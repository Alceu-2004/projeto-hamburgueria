package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoSistemaTest {

    @Test
    void deveRetornarMesmaInstancia() {
        ConfiguracaoSistema s1 = ConfiguracaoSistema.getInstancia();
        ConfiguracaoSistema s2 = ConfiguracaoSistema.getInstancia();

        assertSame(s1, s2);
    }
}