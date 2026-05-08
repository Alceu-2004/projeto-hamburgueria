package builder;

public class PedidoBurgerBuilder {

    private PedidoBurger pedido;

    public PedidoBurgerBuilder() {
        pedido = new PedidoBurger();
    }

    public PedidoBurgerBuilder adicionarHamburguer(String hamburguer) {
        pedido.setHamburguer(hamburguer);
        return this;
    }

    public PedidoBurgerBuilder adicionarBebida(String bebida) {
        pedido.setBebida(bebida);
        return this;
    }

    public PedidoBurgerBuilder adicionarSobremesa(String sobremesa) {
        pedido.setSobremesa(sobremesa);
        return this;
    }

    public PedidoBurger build() {
        return pedido;
    }
}