package state;

public class PedidoEntregue implements EstadoPedido {

    public void avancar(Pedido pedido) {
        System.out.println("Pedido já foi entregue.");
    }

    public String getNomeEstado() {
        return "Entregue";
    }
}