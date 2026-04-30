package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest {

    @Test
    void deveAplicarDescontoClienteNovo() {

        DescontoPedido pedido = new DescontoPedido();
        pedido.setStrategy(new DescontoClienteNovo());

        assertEquals(95.0, pedido.aplicarDesconto(100.0));
    }

    @Test
    void deveAplicarDescontoClienteFiel() {

        DescontoPedido pedido = new DescontoPedido();
        pedido.setStrategy(new DescontoClienteFiel());

        assertEquals(85.0, pedido.aplicarDesconto(100.0));
    }
}