package interpreter;

public class InterpretadorPedido {

    public double calcularPedido(
            int quantidadeHamburgueres,
            double valorHamburguer,
            double taxaEntrega) {

        InterpretadorExpressao quantidade =
                new Numero(quantidadeHamburgueres);

        InterpretadorExpressao valor =
                new Numero(valorHamburguer);

        InterpretadorExpressao taxa =
                new Numero(taxaEntrega);

        InterpretadorExpressao subtotal =
                new Multiplicacao(quantidade, valor);

        InterpretadorExpressao total =
                new Adicao(subtotal, taxa);

        return total.interpretar();
    }
}