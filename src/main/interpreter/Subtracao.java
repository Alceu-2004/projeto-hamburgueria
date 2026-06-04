package interpreter;

public class Subtracao implements InterpretadorExpressao {

    private final InterpretadorExpressao esquerda;
    private final InterpretadorExpressao direita;

    public Subtracao(
            InterpretadorExpressao esquerda,
            InterpretadorExpressao direita) {

        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double interpretar() {
        return esquerda.interpretar() - direita.interpretar();
    }
}