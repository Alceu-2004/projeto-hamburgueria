package decorator;

import factorymethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void deveAdicionarIngredientes() {
        Hamburguer h = HamburguerFactory.criar("simples");
        h = new Bacon(new QueijoExtra(h));

        assertTrue(h.preparar().contains("Bacon"));
        assertTrue(h.preparar().contains("Queijo"));
    }
}