package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {

    @Test
    void deveClonarPedido() {

        PedidoPersonalizado original =
                new PedidoPersonalizado(
                        "X-Bacon",
                        "Refrigerante",
                        "Sorvete"
                );

        PedidoPersonalizado copia =
                (PedidoPersonalizado) original.clonar();

        assertNotSame(original, copia);

        assertEquals(
                original.getHamburguer(),
                copia.getHamburguer()
        );

        assertEquals(
                original.getBebida(),
                copia.getBebida()
        );
    }

    @Test
    void alteracaoNaCopiaNaoDeveAfetarOriginal() {

        PedidoPersonalizado original =
                new PedidoPersonalizado(
                        "X-Burger",
                        "Suco",
                        "Brownie"
                );

        PedidoPersonalizado copia =
                (PedidoPersonalizado) original.clonar();

        copia.setHamburguer("X-Duplo");

        assertEquals(
                "X-Burger",
                original.getHamburguer()
        );

        assertEquals(
                "X-Duplo",
                copia.getHamburguer()
        );
    }
}