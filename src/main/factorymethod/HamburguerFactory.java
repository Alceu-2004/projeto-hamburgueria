package factorymethod;

public class HamburguerFactory {

    public static Hamburguer criar(String tipo) {
        if (tipo.equalsIgnoreCase("vegano")) {
            return new HamburguerVegano();
        }
        return new HamburguerSimples();
    }
}