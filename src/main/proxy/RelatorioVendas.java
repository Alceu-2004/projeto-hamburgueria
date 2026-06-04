package proxy;

public class RelatorioVendas implements Relatorio {

    public RelatorioVendas() {
        System.out.println("Carregando relatório de vendas...");
    }

    @Override
    public void exibir() {
        System.out.println("Relatório de vendas exibido.");
    }
}