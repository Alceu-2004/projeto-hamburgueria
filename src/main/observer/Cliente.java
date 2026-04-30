package observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaMensagem;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        this.ultimaMensagem = mensagem;
        System.out.println(nome + " recebeu: " + mensagem);
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }
}