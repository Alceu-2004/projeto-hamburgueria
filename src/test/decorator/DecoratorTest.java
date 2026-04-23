package decorator;

import factorymethod.*;

public class DecoratorTest {

    public static void main(String[] args) {
        Hamburguer h = HamburguerFactory.criar("simples");
        h = new Bacon(new QueijoExtra(h));

        if (h.preparar().contains("Bacon")) {
            System.out.println("PASSOU: Decorator");
        } else {
            System.out.println("FALHOU");
        }
    }
}