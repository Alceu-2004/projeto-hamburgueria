package abstractfactory;

public class ComboTradicionalFactory implements ComboFactory {

    public Bebida criarBebida() {
        return () -> "Refrigerante";
    }

    public Sobremesa criarSobremesa() {
        return () -> "Sorvete";
    }
}