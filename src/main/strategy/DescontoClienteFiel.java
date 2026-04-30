package strategy;

public class DescontoClienteFiel implements DescontoStrategy {

    @Override
    public double calcular(double valor) {
        return valor * 0.85;
    }
}