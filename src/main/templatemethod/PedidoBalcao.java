package templatemethod;

public class PedidoBalcao extends PedidoTemplate {

    @Override
    protected void selecionarItens() {
        System.out.println("Itens selecionados no balcão");
    }

    @Override
    protected void prepararHamburguer() {
        System.out.println("Hambúrguer preparado no balcão");
    }

    @Override
    protected void finalizarPedido() {
        System.out.println("Pedido entregue no balcão");
    }
}