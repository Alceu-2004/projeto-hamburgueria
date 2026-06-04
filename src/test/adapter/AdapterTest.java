package adapter;

import bridge.MetodoPagamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AdapterTest {

    @Test
    void deveAdaptarSistemaLegado() {

        GatewayPagamentoAntigo gateway = new GatewayPagamentoAntigo();

        MetodoPagamento pagamento =
                new AdaptadorPagamento(gateway);

        assertDoesNotThrow(() ->
                pagamento.pagar(50.0)
        );
    }

    @Test
    void deveRealizarMultiplosPagamentos() {

        GatewayPagamentoAntigo gateway = new GatewayPagamentoAntigo();

        MetodoPagamento pagamento =
                new AdaptadorPagamento(gateway);

        assertDoesNotThrow(() -> {
            pagamento.pagar(25.0);
            pagamento.pagar(100.0);
            pagamento.pagar(200.0);
        });
    }
}