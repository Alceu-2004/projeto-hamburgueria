package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitorTest {

    @Test
    void deveCalcularPrecoTotalPedido() {
        HamburguerItem hamburguer = new HamburguerItem(25.0);
        BebidaItem bebida = new BebidaItem(8.0);

        CalculadoraPrecoVisitor visitor = new CalculadoraPrecoVisitor();

        hamburguer.aceitar(visitor);
        bebida.aceitar(visitor);

        assertEquals(33.0, visitor.getTotal());
    }

    @Test
    void deveSomarMultiplosItens() {
        CalculadoraPrecoVisitor visitor = new CalculadoraPrecoVisitor();

        new HamburguerItem(20.0).aceitar(visitor);
        new HamburguerItem(15.0).aceitar(visitor);
        new BebidaItem(10.0).aceitar(visitor);

        assertEquals(45.0, visitor.getTotal());
    }
}