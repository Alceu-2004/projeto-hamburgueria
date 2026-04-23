package abstractfactory;

public class ComboVeganoFactory implements ComboFactory {

    public Bebida criarBebida() {
        return () -> "Suco";
    }

    public Sobremesa criarSobremesa() {
        return () -> "Mousse vegano de chocolate";
    }
}