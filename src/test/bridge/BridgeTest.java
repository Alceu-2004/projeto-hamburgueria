package bridge;

public class BridgeTest {

    public static void main(String[] args) {
        Pagamento p = new PedidoPagamento(new Pix());
        p.pagar(20);

        System.out.println("PASSOU: Bridge");
    }
}