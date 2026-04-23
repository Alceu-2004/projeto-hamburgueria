package singleton;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instancia;

    private ConfiguracaoSistema() {}

    public static ConfiguracaoSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    public String getStatus() {
        return "Sistema ativo";
    }
}