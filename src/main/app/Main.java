package app;

import chain.Atendente;
import chain.Diretor;
import chain.Gerente;
import chain.SuporteHandler;
import mediator.CentralPedidos;
import mediator.ClienteMediator;
import mediator.Cozinha;
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

        SuporteHandler atendente = new Atendente();
        SuporteHandler gerente = new Gerente();
        SuporteHandler diretor = new Diretor();

        atendente.setProximo(gerente);
        gerente.setProximo(diretor);

        System.out.println(atendente.atender("reclamacao"));

        CentralPedidos central = new CentralPedidos();

        ClienteMediator clienteMediator = new ClienteMediator(central, "Cliente");
        Cozinha cozinha = new Cozinha(central, "Cozinha");

        central.adicionarUsuario(clienteMediator);
        central.adicionarUsuario(cozinha);

        clienteMediator.enviar("Novo pedido");

        System.out.println(pedido.getEstadoAtual());
        pedido.avancarEstado();

        System.out.println(pedido.getEstadoAtual());
        pedido.avancarEstado();

        System.out.println(pedido.getEstadoAtual());
        pedido.avancarEstado();

        System.out.println(pedido.getEstadoAtual());
    }
}