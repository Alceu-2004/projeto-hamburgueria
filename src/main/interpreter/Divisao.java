package interpreter;

public class Divisao implements InterpretadorExpressao {

    private final InterpretadorExpressao esquerda;
    private final InterpretadorExpressao direita;

    public Divisao(
            InterpretadorExpressao esquerda,
            InterpretadorExpressao direita) {

        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double interpretar() {
        return esquerda.interpretar() / direita.interpretar();
    }
}