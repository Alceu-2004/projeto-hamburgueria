package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MediatorTest {

    @Test
    void deveEnviarMensagemDoClienteParaCozinha() {

        CentralPedidos central = new CentralPedidos();

        ClienteMediator cliente = new ClienteMediator(central, "Cliente");
        Cozinha cozinha = new Cozinha(central, "Cozinha");

        central.adicionarUsuario(cliente);
        central.adicionarUsuario(cozinha);

        assertDoesNotThrow(() -> cliente.enviar("Pedido realizado"));
    }

    @Test
    void deveEnviarMensagemDaCozinhaParaCliente() {

        CentralPedidos central = new CentralPedidos();

        ClienteMediator cliente = new ClienteMediator(central, "Cliente");
        Cozinha cozinha = new Cozinha(central, "Cozinha");

        central.adicionarUsuario(cliente);
        central.adicionarUsuario(cozinha);

        assertDoesNotThrow(() -> cozinha.enviar("Pedido pronto"));
    }

    @Test
    void devePermitirMultiplosUsuariosNaCentral() {

        CentralPedidos central = new CentralPedidos();

        ClienteMediator cliente1 = new ClienteMediator(central, "Cliente 1");
        ClienteMediator cliente2 = new ClienteMediator(central, "Cliente 2");
        Cozinha cozinha = new Cozinha(central, "Cozinha");

        central.adicionarUsuario(cliente1);
        central.adicionarUsuario(cliente2);
        central.adicionarUsuario(cozinha);

        assertDoesNotThrow(() -> cliente1.enviar("Novo pedido"));
    }
}