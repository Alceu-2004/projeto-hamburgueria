package strategy;

public class DescontoPedido {

    private DescontoStrategy strategy;

    public void setStrategy(DescontoStrategy strategy) {
        this.strategy = strategy;
    }

    public double aplicarDesconto(double valor) {
        return strategy.calcular(valor);
    }
}