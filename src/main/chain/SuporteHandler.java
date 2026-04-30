package chain;

public abstract class SuporteHandler {

    protected SuporteHandler proximo;

    public void setProximo(SuporteHandler proximo) {
        this.proximo = proximo;
    }

    public abstract String atender(String solicitacao);
}