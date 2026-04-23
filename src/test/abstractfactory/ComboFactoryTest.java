package abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComboFactoryTest {

    @Test
    void deveCriarComboVegano() {
        ComboFactory combo = new ComboVeganoFactory();

        assertEquals("Suco", combo.criarBebida().servir());
        assertEquals("Mousse vegano de chocolate", combo.criarSobremesa().servir());
    }
}