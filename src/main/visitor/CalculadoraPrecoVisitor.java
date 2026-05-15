package visitor;

public class CalculadoraPrecoVisitor implements Visitor {
    private double total = 0;

    @Override
    public void visitarHamburguer(HamburguerItem hamburguer) {
        total += hamburguer.getPreco();
    }

    @Override
    public void visitarBebida(BebidaItem bebida) {
        total += bebida.getPreco();
    }

    public double getTotal() {
        return total;
    }
}