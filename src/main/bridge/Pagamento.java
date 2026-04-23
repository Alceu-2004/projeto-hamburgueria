package bridge;

public abstract class Pagamento {

    protected MetodoPagamento metodo;

    public Pagamento(MetodoPagamento metodo) {
        this.metodo = metodo;
    }

    public abstract void pagar(double valor);
}