package memento;

public class PedidoOriginador {
    private String estado;

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public PedidoMemento salvar() {
        return new PedidoMemento(estado);
    }

    public void restaurar(PedidoMemento memento) {
        this.estado = memento.getEstado();
    }
}