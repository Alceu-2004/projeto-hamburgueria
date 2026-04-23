package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HamburguerFactoryTest {

    @Test
    void deveCriarHamburguerVegano() {
        Hamburguer h = HamburguerFactory.criar("vegano");
        assertEquals("Hamburguer Vegano", h.preparar());
    }
}