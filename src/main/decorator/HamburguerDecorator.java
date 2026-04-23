package decorator;

import factorymethod.Hamburguer;

public abstract class HamburguerDecorator extends Hamburguer {

    protected Hamburguer hamburguer;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }
}