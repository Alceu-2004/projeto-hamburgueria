package proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ProxyTest {

    @Test
    void deveExibirRelatorio() {

        Relatorio relatorio = new ProxyRelatorio();

        assertDoesNotThrow(relatorio::exibir);
    }

    @Test
    void deveReutilizarMesmoRelatorio() {

        Relatorio relatorio = new ProxyRelatorio();

        assertDoesNotThrow(() -> {
            relatorio.exibir();
            relatorio.exibir();
            relatorio.exibir();
        });
    }
}