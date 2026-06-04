package adapter;

import bridge.MetodoPagamento;

public class AdaptadorPagamento implements MetodoPagamento {

    private final GatewayPagamentoAntigo gateway;

    public AdaptadorPagamento(GatewayPagamentoAntigo gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pagar(double valor) {
        gateway.realizarPagamento(valor);
    }
}