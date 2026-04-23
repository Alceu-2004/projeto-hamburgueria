package factorymethod;

public class HamburguerFactoryTest {

    public static void main(String[] args) {
        Hamburguer h = HamburguerFactory.criar("vegano");

        if (h.preparar().equals("Hamburguer Vegano")) {
            System.out.println("PASSOU: Factory Method");
        } else {
            System.out.println("FALHOU");
        }
    }
}