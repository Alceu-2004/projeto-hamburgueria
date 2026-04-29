package state;

public class PedidoPronto implements EstadoPedido {

    public void avancar(Pedido pedido) {
        pedido.setEstado(new PedidoEntregue());
    }

    public String getNomeEstado() {
        return "Pronto";
    }
}