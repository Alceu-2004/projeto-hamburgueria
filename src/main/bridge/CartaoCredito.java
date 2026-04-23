package bridge;

public class CartaoCredito implements MetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Cartão: " + valor);
    }
}