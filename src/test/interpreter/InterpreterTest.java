package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterpreterTest {

    @Test
    void deveCalcularPedidoComTaxa() {

        InterpretadorPedido pedido =
                new InterpretadorPedido();

        double resultado =
                pedido.calcularPedido(
                        2,
                        20.0,
                        5.0);

        assertEquals(45.0, resultado);
    }

    @Test
    void deveCalcularOutroPedido() {

        InterpretadorPedido pedido =
                new InterpretadorPedido();

        double resultado =
                pedido.calcularPedido(
                        3,
                        15.0,
                        10.0);

        assertEquals(55.0, resultado);
    }
}