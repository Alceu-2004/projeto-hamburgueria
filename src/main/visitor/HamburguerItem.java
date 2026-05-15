package visitor;

public class HamburguerItem implements ItemPedido {
    private final double preco;

    public HamburguerItem(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarHamburguer(this);
    }
}