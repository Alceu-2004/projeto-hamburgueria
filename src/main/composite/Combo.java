package composite;

import java.util.ArrayList;
import java.util.List;

public class Combo implements ItemPedido {

    private String nome;
    private List<ItemPedido> itens = new ArrayList<>();

    public Combo(String nome) {
        this.nome = nome;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {

        double total = 0;

        for (ItemPedido item : itens) {
            total += item.getPreco();
        }

        return total;
    }

    @Override
    public String getNome() {
        return nome;
    }
}