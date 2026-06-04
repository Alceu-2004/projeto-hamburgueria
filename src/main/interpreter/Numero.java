package interpreter;

public class Numero implements InterpretadorExpressao {

    private final double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public double interpretar() {
        return valor;
    }
}