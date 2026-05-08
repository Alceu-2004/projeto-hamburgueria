package templatemethod;

public abstract class PedidoTemplate {

    public final void processarPedido() {

        selecionarItens();
        prepararHamburguer();
        finalizarPedido();
    }

    protected abstract void selecionarItens();

    protected abstract void prepararHamburguer();

    protected abstract void finalizarPedido();
}