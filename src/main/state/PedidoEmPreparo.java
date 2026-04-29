package state;

public class PedidoEmPreparo implements EstadoPedido {

    public void avancar(Pedido pedido) {
        pedido.setEstado(new PedidoPronto());
    }

    public String getNomeEstado() {
        return "Em preparo";
    }
}