package builder;

public class PedidoDiretor {

    public PedidoBurger construirComboTradicional() {

        return new PedidoBurgerBuilder()
                .adicionarHamburguer("Hambúrguer Tradicional")
                .adicionarBebida("Refrigerante")
                .adicionarSobremesa("Sorvete")
                .build();
    }

    public PedidoBurger construirComboVegano() {

        return new PedidoBurgerBuilder()
                .adicionarHamburguer("Hambúrguer Vegano")
                .adicionarBebida("Suco Natural")
                .adicionarSobremesa("Fruta")
                .build();
    }
}