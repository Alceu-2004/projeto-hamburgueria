package state;

public class PedidoRecebido implements EstadoPedido {

    public void avancar(Pedido pedido) {
        pedido.setEstado(new PedidoEmPreparo());
    }

    public String getNomeEstado() {
        return "Recebido";
    }
}