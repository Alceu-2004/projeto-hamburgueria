package command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CommandTest {

    @Test
    void deveExecutarPedido() {

        CozinhaCommand cozinha = new CozinhaCommand();
        Comando comando = new FazerPedidoCommand(cozinha);

        assertDoesNotThrow(comando::executar);
    }

    @Test
    void deveExecutarMultiplosPedidos() {

        CozinhaCommand cozinha = new CozinhaCommand();
        Comando comando = new FazerPedidoCommand(cozinha);

        assertDoesNotThrow(() -> {
            comando.executar();
            comando.executar();
            comando.executar();
        });
    }
}