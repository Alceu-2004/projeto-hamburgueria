package state;

public interface EstadoPedido {
    void avancar(Pedido pedido);
    String getNomeEstado();
}