package templatemethod;

public class PedidoDelivery extends PedidoTemplate {

    @Override
    protected void selecionarItens() {
        System.out.println("Itens selecionados no delivery");
    }

    @Override
    protected void prepararHamburguer() {
        System.out.println("Hambúrguer preparado para entrega");
    }

    @Override
    protected void finalizarPedido() {
        System.out.println("Pedido saiu para entrega");
    }
}