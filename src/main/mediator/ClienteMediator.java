package mediator;

public class ClienteMediator extends Usuario {

    public ClienteMediator(Mediator mediator, String nome) {
        super(mediator, nome);
    }

    @Override
    public void enviar(String mensagem) {
        mediator.enviarMensagem(nome + ": " + mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println(nome + " recebeu -> " + mensagem);
    }
}