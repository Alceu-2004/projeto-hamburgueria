package bridge;

public class PedidoPagamento extends Pagamento {

    public PedidoPagamento(MetodoPagamento metodo) {
        super(metodo);
    }

    public void pagar(double valor) {
        metodo.pagar(valor);
    }
}