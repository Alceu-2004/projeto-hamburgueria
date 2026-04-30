package chain;

public class Atendente extends SuporteHandler {

    @Override
    public String atender(String solicitacao) {

        if (solicitacao.equalsIgnoreCase("pedido")) {
            return "Atendente resolveu";
        }

        return proximo.atender(solicitacao);
    }
}