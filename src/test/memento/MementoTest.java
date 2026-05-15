package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoTest {

    @Test
    void deveSalvarERestaurarEstadoPedido() {
        PedidoOriginador pedido = new PedidoOriginador();
        PedidoHistorico historico = new PedidoHistorico();

        pedido.setEstado("Recebido");
        historico.adicionarMemento(pedido.salvar());

        pedido.setEstado("Em preparo");
        historico.adicionarMemento(pedido.salvar());

        pedido.setEstado("Entregue");

        pedido.restaurar(historico.getMemento(0));

        assertEquals("Recebido", pedido.getEstado());
    }

    @Test
    void deveSalvarMultiplosEstados() {
        PedidoOriginador pedido = new PedidoOriginador();
        PedidoHistorico historico = new PedidoHistorico();

        pedido.setEstado("Recebido");
        historico.adicionarMemento(pedido.salvar());

        pedido.setEstado("Pronto");
        historico.adicionarMemento(pedido.salvar());

        pedido.restaurar(historico.getMemento(1));

        assertEquals("Pronto", pedido.getEstado());
    }
}