package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest {

    @Test
    void deveSomarValoresDoCombo() {

        Produto hamburguer = new Produto("Hambúrguer", 20);
        Produto bebida = new Produto("Refrigerante", 8);

        Combo combo = new Combo("Combo Tradicional");

        combo.adicionarItem(hamburguer);
        combo.adicionarItem(bebida);

        assertEquals(28, combo.getPreco());
    }

    @Test
    void devePermitirComboComVariosItens() {

        Produto hamburguer = new Produto("Hambúrguer", 20);
        Produto bebida = new Produto("Refrigerante", 8);
        Produto sobremesa = new Produto("Sorvete", 10);

        Combo combo = new Combo("Combo Completo");

        combo.adicionarItem(hamburguer);
        combo.adicionarItem(bebida);
        combo.adicionarItem(sobremesa);

        assertEquals(38, combo.getPreco());
    }

    @Test
    void deveRetornarNomeDoCombo() {

        Combo combo = new Combo("Combo Família");

        assertEquals("Combo Família", combo.getNome());
    }
}