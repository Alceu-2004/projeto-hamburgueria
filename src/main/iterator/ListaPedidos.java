package iterator;

import java.util.ArrayList;
import java.util.List;

public class ListaPedidos implements ColecaoPedidos {

    private final List<String> pedidos = new ArrayList<>();

    public void adicionarPedido(String pedido) {
        pedidos.add(pedido);
    }

    public List<String> getPedidos() {
        return pedidos;
    }

    @Override
    public IteradorPedido criarIterador() {
        return new PedidoIterator(this);
    }
}