package chain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChainTest {

    @Test
    void deveResolverPedidoNoAtendente() {

        SuporteHandler atendente = new Atendente();
        SuporteHandler gerente = new Gerente();
        SuporteHandler diretor = new Diretor();

        atendente.setProximo(gerente);
        gerente.setProximo(diretor);

        assertEquals("Atendente resolveu", atendente.atender("pedido"));
    }

    @Test
    void deveResolverReclamacaoNoGerente() {

        SuporteHandler atendente = new Atendente();
        SuporteHandler gerente = new Gerente();
        SuporteHandler diretor = new Diretor();

        atendente.setProximo(gerente);
        gerente.setProximo(diretor);

        assertEquals("Gerente resolveu", atendente.atender("reclamacao"));
    }

    @Test
    void deveResolverReembolsoNoDiretor() {

        SuporteHandler atendente = new Atendente();
        SuporteHandler gerente = new Gerente();
        SuporteHandler diretor = new Diretor();

        atendente.setProximo(gerente);
        gerente.setProximo(diretor);

        assertEquals("Diretor resolveu", atendente.atender("reembolso"));
    }
}