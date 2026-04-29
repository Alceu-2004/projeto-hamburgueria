package state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveAvancarEstadosDoPedido() {

        Pedido pedido = new Pedido();

        assertEquals("Recebido", pedido.getEstadoAtual());

        pedido.avancarEstado();
        assertEquals("Em preparo", pedido.getEstadoAtual());

        pedido.avancarEstado();
        assertEquals("Pronto", pedido.getEstadoAtual());

        pedido.avancarEstado();
        assertEquals("Entregue", pedido.getEstadoAtual());
    }
}