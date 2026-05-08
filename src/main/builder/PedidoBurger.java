package builder;

public class PedidoBurger {

    private String hamburguer;
    private String bebida;
    private String sobremesa;

    public void setHamburguer(String hamburguer) {
        this.hamburguer = hamburguer;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    @Override
    public String toString() {
        return "Pedido: " +
                hamburguer + ", " +
                bebida + ", " +
                sobremesa;
    }
}