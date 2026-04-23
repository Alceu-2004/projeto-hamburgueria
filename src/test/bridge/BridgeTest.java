package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test
    void deveExecutarPagamentoPix() {
        Pagamento pagamento = new PedidoPagamento(new Pix());

        assertDoesNotThrow(() -> pagamento.pagar(10));
    }
}