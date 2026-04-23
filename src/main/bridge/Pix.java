package bridge;

public class Pix implements MetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Pix: " + valor);
    }
}