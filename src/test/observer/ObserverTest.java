package observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {

    @Test
    void deveNotificarCliente() {

        PedidoObservable pedido = new PedidoObservable();
        Cliente cliente = new Cliente("Alceu");

        pedido.adicionarObserver(cliente);
        pedido.alterarStatus("Pronto");

        assertEquals("Status do pedido: Pronto", cliente.getUltimaMensagem());
    }
}