package strategy;

public class DescontoClienteNovo implements DescontoStrategy {

    @Override
    public double calcular(double valor) {
        return valor * 0.95;
    }
}