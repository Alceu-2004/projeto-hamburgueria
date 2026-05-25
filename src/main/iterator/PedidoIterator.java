package iterator;

public class PedidoIterator implements IteradorPedido {

    private final ListaPedidos listaPedidos;
    private int posicao = 0;

    public PedidoIterator(ListaPedidos listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    @Override
    public boolean temProximo() {
        return posicao < listaPedidos.getPedidos().size();
    }

    @Override
    public String proximo() {
        return listaPedidos.getPedidos().get(posicao++);
    }
}