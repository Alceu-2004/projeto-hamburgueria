package flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlyweightTest {

    @Test
    void deveCompartilharMesmaInstancia() {

        Ingrediente queijo1 =
                IngredienteFactory.getIngrediente("Queijo");

        Ingrediente queijo2 =
                IngredienteFactory.getIngrediente("Queijo");

        assertSame(queijo1, queijo2);
    }

    @Test
    void deveCriarSomenteUmaInstanciaPorIngrediente() {

        IngredienteFactory.getIngrediente("Queijo");
        IngredienteFactory.getIngrediente("Queijo");
        IngredienteFactory.getIngrediente("Queijo");

        assertEquals(
                1,
                IngredienteFactory.getQuantidadeIngredientes()
        );
    }

    @Test
    void deveCriarInstanciasDiferentesParaIngredientesDiferentes() {

        IngredienteFactory.getIngrediente("Queijo");
        IngredienteFactory.getIngrediente("Bacon");

        assertEquals(
                2,
                IngredienteFactory.getQuantidadeIngredientes()
        );
    }
}