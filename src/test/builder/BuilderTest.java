package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuilderTest {

    @Test
    void deveConstruirComboTradicional() {

        PedidoDiretor diretor = new PedidoDiretor();

        PedidoBurger pedido = diretor.construirComboTradicional();

        assertTrue(pedido.toString().contains("Hambúrguer Tradicional"));
    }

    @Test
    void deveConstruirComboVegano() {

        PedidoDiretor diretor = new PedidoDiretor();

        PedidoBurger pedido = diretor.construirComboVegano();

        assertTrue(pedido.toString().contains("Hambúrguer Vegano"));
    }

    @Test
    void deveMontarPedidoPersonalizado() {

        PedidoBurger pedido = new PedidoBurgerBuilder()
                .adicionarHamburguer("Duplo Bacon")
                .adicionarBebida("Milkshake")
                .adicionarSobremesa("Brownie")
                .build();

        assertTrue(pedido.toString().contains("Duplo Bacon"));
    }
}