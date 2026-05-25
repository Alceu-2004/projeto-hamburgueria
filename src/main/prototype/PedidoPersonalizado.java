package prototype;

public class PedidoPersonalizado implements PedidoPrototype {

    private String hamburguer;
    private String bebida;
    private String sobremesa;

    public PedidoPersonalizado(String hamburguer,
                               String bebida,
                               String sobremesa) {
        this.hamburguer = hamburguer;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public String getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(String hamburguer) {
        this.hamburguer = hamburguer;
    }

    public String getBebida() {
        return bebida;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    @Override
    public PedidoPrototype clonar() {
        return new PedidoPersonalizado(
                hamburguer,
                bebida,
                sobremesa
        );
    }

    @Override
    public String toString() {
        return "PedidoPersonalizado{" +
                "hamburguer='" + hamburguer + '\'' +
                ", bebida='" + bebida + '\'' +
                ", sobremesa='" + sobremesa + '\'' +
                '}';
    }
}