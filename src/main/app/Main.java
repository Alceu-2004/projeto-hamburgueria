package app;

import builder.PedidoBurger;
import builder.PedidoBurgerBuilder;
import builder.PedidoDiretor;
import chain.Atendente;
import chain.Diretor;
import chain.Gerente;
import chain.SuporteHandler;
import composite.Combo;
import composite.Produto;
import facade.CozinhaFacade;
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
import memento.PedidoHistorico;
import memento.PedidoOriginador;
import visitor.BebidaItem;
import visitor.CalculadoraPrecoVisitor;
import visitor.HamburguerItem;
import flyweight.Ingrediente;
import flyweight.IngredienteFactory;
import iterator.IteratorPedido;
import iterator.ListaPedidos;
import prototype.PedidoPersonalizado;
import adapter.AdaptadorPagamento;
import adapter.GatewayPagamentoAntigo;
import command.Comando;
import command.CozinhaCommand;
import command.FazerPedidoCommand;
import proxy.ProxyRelatorio;
import proxy.Relatorio;
import interpreter.InterpretadorPedido;

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

        System.out.println("\n========== ADAPTER ==========");

        GatewayPagamentoAntigo gateway =
                new GatewayPagamentoAntigo();

        MetodoPagamento pagamentoAdaptado =
                new AdaptadorPagamento(gateway);

        pagamentoAdaptado.pagar(45.0);

        System.out.println("\n========== COMMAND ==========");

        CozinhaCommand cozinhaCommand = new CozinhaCommand();

        Comando comando =
                new FazerPedidoCommand(cozinhaCommand);

        comando.executar();

        System.out.println("\n========== PROXY ==========");

        Relatorio relatorio = new ProxyRelatorio();

        relatorio.exibir();
        relatorio.exibir();

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

        System.out.println("\n========== FACADE ==========");

        CozinhaFacade facade = new CozinhaFacade();
        facade.finalizarPedido();

        System.out.println("\n========== COMPOSITE ==========");

        Produto hamburguer = new Produto("Hambúrguer", 20);
        Produto bebida = new Produto("Refrigerante", 8);
        Produto sobremesa = new Produto("Sorvete", 10);

        Combo comboComposite = new Combo("Combo Completo");

        comboComposite.adicionarItem(hamburguer);
        comboComposite.adicionarItem(bebida);
        comboComposite.adicionarItem(sobremesa);

        System.out.println("Nome do combo: " + comboComposite.getNome());
        System.out.println("Valor total: R$ " + comboComposite.getPreco());

        System.out.println("\n========== MEMENTO ==========");

        PedidoOriginador pedidoMemento = new PedidoOriginador();
        PedidoHistorico historico = new PedidoHistorico();

        pedidoMemento.setEstado("Recebido");
        historico.adicionarMemento(pedidoMemento.salvar());

        pedidoMemento.setEstado("Em preparo");
        historico.adicionarMemento(pedidoMemento.salvar());

        pedidoMemento.setEstado("Cancelado");
        System.out.println("Estado atual: " + pedidoMemento.getEstado());

        pedidoMemento.restaurar(historico.getMemento(0));
        System.out.println("Estado restaurado: " + pedidoMemento.getEstado());

        System.out.println("\n========== VISITOR ==========");

        HamburguerItem hamburguerVisitor = new HamburguerItem(25.0);
        BebidaItem bebidaVisitor = new BebidaItem(8.0);

        CalculadoraPrecoVisitor calculadora = new CalculadoraPrecoVisitor();

        hamburguerVisitor.aceitar(calculadora);
        bebidaVisitor.aceitar(calculadora);

        System.out.println("Total do pedido: " + calculadora.getTotal());

        System.out.println("\n========== FLYWEIGHT ==========");

        Ingrediente queijo1 =
                IngredienteFactory.getIngrediente("Queijo");

        Ingrediente queijo2 =
                IngredienteFactory.getIngrediente("Queijo");

        queijo1.exibir("X-Burger");
        queijo2.exibir("X-Salada");

        System.out.println(
                "Ingredientes compartilhados: "
                        + IngredienteFactory.getQuantidadeIngredientes()
        );

        System.out.println("\n========== ITERATOR ==========");

        ListaPedidos pedidosIterator = new ListaPedidos();

        pedidosIterator.adicionarPedido("X-Burger");
        pedidosIterator.adicionarPedido("X-Bacon");
        pedidosIterator.adicionarPedido("Combo Vegano");

        IteratorPedido iterator = pedidosIterator.criarIterador();

        while (iterator.temProximo()) {
            System.out.println("Pedido: " + iterator.proximo());
        }

        System.out.println("\n========== PROTOTYPE ==========");

        PedidoPersonalizado pedidoOriginal =
                new PedidoPersonalizado(
                        "X-Bacon",
                        "Refrigerante",
                        "Sorvete"
                );

        PedidoPersonalizado pedidoClone =
                (PedidoPersonalizado) pedidoOriginal.clonar();

        pedidoClone.setHamburguer("X-Duplo");

        System.out.println("Original:");
        System.out.println(pedidoOriginal);

        System.out.println("Clone:");
        System.out.println(pedidoClone);

        System.out.println("\n========== INTERPRETER ==========");

        InterpretadorPedido interpretador =
                new InterpretadorPedido();

        double total =
                interpretador.calcularPedido(
                        2,
                        20.0,
                        5.0);

        System.out.println("Total do pedido: R$ " + total);

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