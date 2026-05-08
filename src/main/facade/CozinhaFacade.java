package facade;

public class CozinhaFacade {

    private CozinhaService cozinhaService;
    private PagamentoService pagamentoService;
    private EntregaService entregaService;

    public CozinhaFacade() {
        cozinhaService = new CozinhaService();
        pagamentoService = new PagamentoService();
        entregaService = new EntregaService();
    }

    public void finalizarPedido() {

        System.out.println(cozinhaService.prepararPedido());
        System.out.println(pagamentoService.realizarPagamento());
        System.out.println(entregaService.enviarEntrega());
    }
}