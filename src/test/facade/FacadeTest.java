package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class FacadeTest {

    @Test
    void deveExecutarFluxoCompletoDoPedido() {

        CozinhaFacade facade = new CozinhaFacade();

        assertDoesNotThrow(facade::finalizarPedido);
    }

    @Test
    void deveCriarFacadeSemErros() {

        assertDoesNotThrow(CozinhaFacade::new);
    }
}