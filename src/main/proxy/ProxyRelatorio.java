package proxy;

public class ProxyRelatorio implements Relatorio {

    private RelatorioVendas relatorio;

    @Override
    public void exibir() {

        if (relatorio == null) {
            relatorio = new RelatorioVendas();
        }

        relatorio.exibir();
    }
}