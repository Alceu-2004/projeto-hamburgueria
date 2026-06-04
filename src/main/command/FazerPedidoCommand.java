package command;

public class FazerPedidoCommand implements Comando {

    private final CozinhaCommand cozinha;

    public FazerPedidoCommand(CozinhaCommand cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public void executar() {
        cozinha.prepararPedido();
    }
}