package chain;

public class Diretor extends SuporteHandler {

    @Override
    public String atender(String solicitacao) {

        if (solicitacao.equalsIgnoreCase("reembolso")) {
            return "Diretor resolveu";
        }

        return "Solicitação não atendida";
    }
}