package memento;

public class PedidoMemento {
    private final String estado;

    public PedidoMemento(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}