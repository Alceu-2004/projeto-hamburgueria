package app;

import singleton.*;
import factorymethod.*;
import decorator.*;
import abstractfactory.*;
import bridge.*;
import state.Pedido;

public class Main {

    public static void main(String[] args) {

        System.out.println(ConfiguracaoSistema.getInstancia().getStatus());

        Hamburguer h = HamburguerFactory.criar("simples");
        h = new Bacon(h);
        System.out.println(h.preparar());

        ComboFactory combo = new ComboTradicionalFactory();
        System.out.println(combo.criarBebida().servir());

        Pagamento pagamento = new PedidoPagamento(new Pix());
        pagamento.pagar(30);

        Pedido pedido = new Pedido();

        System.out.println(pedido.getEstadoAtual());
        pedido.avancarEstado();

        System.out.println(pedido.getEstadoAtual());
        pedido.avancarEstado();

        System.out.println(pedido.getEstadoAtual());
        pedido.avancarEstado();

        System.out.println(pedido.getEstadoAtual());
    }
}