package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TemplateMethodTest {

    @Test
    void deveProcessarPedidoBalcao() {

        PedidoTemplate pedido = new PedidoBalcao();

        assertDoesNotThrow(pedido::processarPedido);
    }

    @Test
    void deveProcessarPedidoDelivery() {

        PedidoTemplate pedido = new PedidoDelivery();

        assertDoesNotThrow(pedido::processarPedido);
    }
}