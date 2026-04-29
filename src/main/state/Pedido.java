package state;

public class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        this.estado = new PedidoRecebido();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void avancarEstado() {
        estado.avancar(this);
    }

    public String getEstadoAtual() {
        return estado.getNomeEstado();
    }
}