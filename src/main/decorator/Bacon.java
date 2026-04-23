package decorator;

import factorymethod.Hamburguer;

public class Bacon extends HamburguerDecorator {

    public Bacon(Hamburguer h) {
        super(h);
    }

    public String preparar() {
        return hamburguer.preparar() + " + Bacon";
    }
}