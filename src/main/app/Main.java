package app;

import builder.PedidoBurger;
import builder.PedidoBurgerBuilder;
import builder.PedidoDiretor;
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
import templatemethod.PedidoBalcao;
import templatemethod.PedidoDelivery;
import templatemethod.PedidoTemplate;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n========== SINGLETON ==========");
        System.out.println(ConfiguracaoSistema.getInstancia().getStatus());

        System.out.println("\n========== FACTORY METHOD + DECORATOR ==========");
        Hamburguer h = HamburguerFactory.criar("simples");
        h = new Bacon(h);
        System.out.println(h.preparar());

        System.out.println("\n========== ABSTRACT FACTORY ==========");
        ComboFactory combo = new ComboTradicionalFactory();
        System.out.println(combo.criarBebida().servir());

        System.out.println("\n========== BRIDGE ==========");
        Pagamento pagamento = new PedidoPagamento(new Pix());
        pagamento.pagar(30);

        System.out.println("\n========== OBSERVER ==========");
        PedidoObservable pedidoObs = new PedidoObservable();
        Cliente cliente = new Cliente("Cliente 1");

        pedidoObs.adicionarObserver(cliente);
        pedidoObs.alterarStatus("Saiu para entrega");

        System.out.println("\n========== STRATEGY ==========");
        DescontoPedido desconto = new DescontoPedido();

        desconto.setStrategy(new DescontoClienteFiel());
        System.out.println("Valor com desconto: " + desconto.aplicarDesconto(50.0));

        System.out.println("\n========== CHAIN OF RESPONSIBILITY ==========");
        SuporteHandler atendente = new Atendente();
        SuporteHandler gerente = new Gerente();
        SuporteHandler diretor = new Diretor();

        atendente.setProximo(gerente);
        gerente.setProximo(diretor);

        System.out.println(atendente.atender("reclamacao"));

        System.out.println("\n========== MEDIATOR ==========");
        CentralPedidos central = new CentralPedidos();

        ClienteMediator clienteMediator = new ClienteMediator(central, "Cliente");
        Cozinha cozinha = new Cozinha(central, "Cozinha");

        central.adicionarUsuario(clienteMediator);
        central.adicionarUsuario(cozinha);

        clienteMediator.enviar("Novo pedido");

        System.out.println("\n========== TEMPLATE METHOD ==========");

        PedidoTemplate pedidoBalcao = new PedidoBalcao();
        pedidoBalcao.processarPedido();

        System.out.println();

        PedidoTemplate pedidoDelivery = new PedidoDelivery();
        pedidoDelivery.processarPedido();

        System.out.println("\n========== BUILDER ==========");

        PedidoDiretor diretorBuilder = new PedidoDiretor();

        PedidoBurger comboTradicional = diretorBuilder.construirComboTradicional();
        System.out.println(comboTradicional);

        PedidoBurger personalizado = new PedidoBurgerBuilder()
                .adicionarHamburguer("Duplo Bacon")
                .adicionarBebida("Milkshake")
                .adicionarSobremesa("Brownie")
                .build();

        System.out.println(personalizado);

        System.out.println("\n========== STATE ==========");
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