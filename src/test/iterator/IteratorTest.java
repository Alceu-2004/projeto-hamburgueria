package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTest {

    @Test
    void devePercorrerTodosPedidos() {

        ListaPedidos pedidos = new ListaPedidos();

        pedidos.adicionarPedido("X-Burger");
        pedidos.adicionarPedido("X-Bacon");
        pedidos.adicionarPedido("X-Salada");

        IteratorPedido iterator = pedidos.criarIterador();

        assertEquals("X-Burger", iterator.proximo());
        assertEquals("X-Bacon", iterator.proximo());
        assertEquals("X-Salada", iterator.proximo());
        assertFalse(iterator.temProximo());
    }

    @Test
    void deveIndicarQueHaProximoElemento() {

        ListaPedidos pedidos = new ListaPedidos();

        pedidos.adicionarPedido("Combo Tradicional");

        IteratorPedido iterator = pedidos.criarIterador();

        assertTrue(iterator.temProximo());
    }

    @Test
    void deveIndicarColecaoVazia() {

        ListaPedidos pedidos = new ListaPedidos();

        IteratorPedido iterator = pedidos.criarIterador();

        assertFalse(iterator.temProximo());
    }
}