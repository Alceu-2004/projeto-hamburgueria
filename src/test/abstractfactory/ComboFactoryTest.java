package abstractfactory;

public class ComboFactoryTest {

    public static void main(String[] args) {
        ComboFactory combo = new ComboVeganoFactory();

        if (combo.criarBebida().servir().equals("Suco")) {
            System.out.println("PASSOU: Abstract Factory");
        } else {
            System.out.println("FALHOU");
        }
    }
}