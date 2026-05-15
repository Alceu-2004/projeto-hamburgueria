package visitor;

public class BebidaItem implements ItemPedido {
    private final double preco;

    public BebidaItem(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarBebida(this);
    }
}