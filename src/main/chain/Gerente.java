package chain;

public class Gerente extends SuporteHandler {

    @Override
    public String atender(String solicitacao) {

        if (solicitacao.equalsIgnoreCase("reclamacao")) {
            return "Gerente resolveu";
        }

        return proximo.atender(solicitacao);
    }
}