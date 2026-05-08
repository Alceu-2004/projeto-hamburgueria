package mediator;

public abstract class Usuario {

    protected Mediator mediator;
    protected String nome;

    public Usuario(Mediator mediator, String nome) {
        this.mediator = mediator;
        this.nome = nome;
    }

    public abstract void enviar(String mensagem);

    public abstract void receber(String mensagem);
}