package flyweight;

import java.util.HashMap;
import java.util.Map;

public class IngredienteFactory {

    private static final Map<String, Ingrediente> ingredientes = new HashMap<>();

    public static Ingrediente getIngrediente(String nome) {

        if (!ingredientes.containsKey(nome)) {
            ingredientes.put(nome, new IngredienteConcreto(nome));
        }

        return ingredientes.get(nome);
    }

    public static int getQuantidadeIngredientes() {
        return ingredientes.size();
    }
}