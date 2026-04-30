package app;

import observer.Cliente;
import observer.PedidoObservable;
import singleton.*;
import factorymethod.*;
import decorator.*;
import abstractfactory.*;
import bridge.*;
import state.Pedido;
import strategy.DescontoClienteFiel;
import strategy.DescontoPedido;

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

        PedidoObservable pedidoObs = new PedidoObservable();
        Cliente cliente = new Cliente("Cliente 1");

        pedidoObs.adicionarObserver(cliente);
        pedidoObs.alterarStatus("Saiu para entrega");

        DescontoPedido desconto = new DescontoPedido();

        desconto.setStrategy(new DescontoClienteFiel());
        System.out.println("Valor com desconto: " + desconto.aplicarDesconto(50.0));

        System.out.println(pedido.getEstadoAtual());
        pedido.avancarEstado();

        System.out.println(pedido.getEstadoAtual());
        pedido.avancarEstado();

        System.out.println(pedido.getEstadoAtual());
        pedido.avancarEstado();

        System.out.println(pedido.getEstadoAtual());
    }
}