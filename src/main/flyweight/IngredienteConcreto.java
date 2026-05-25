package flyweight;

public class IngredienteConcreto implements Ingrediente {

    private final String nome;

    public IngredienteConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String hamburguer) {
        System.out.println(
                "Hambúrguer: " + hamburguer +
                        " | Ingrediente compartilhado: " + nome
        );
    }

    public String getNome() {
        return nome;
    }
}