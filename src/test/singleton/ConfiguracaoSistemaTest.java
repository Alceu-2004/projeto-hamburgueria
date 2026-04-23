package singleton;

public class ConfiguracaoSistemaTest {

    public static void main(String[] args) {
        ConfiguracaoSistema s1 = ConfiguracaoSistema.getInstancia();
        ConfiguracaoSistema s2 = ConfiguracaoSistema.getInstancia();

        if (s1 == s2) {
            System.out.println("PASSOU: Singleton");
        } else {
            System.out.println("FALHOU");
        }
    }
}