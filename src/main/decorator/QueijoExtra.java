package decorator;

import factorymethod.Hamburguer;

public class QueijoExtra extends HamburguerDecorator {

    public QueijoExtra(Hamburguer h) {
        super(h);
    }

    public String preparar() {
        return hamburguer.preparar() + " + Queijo";
    }
}