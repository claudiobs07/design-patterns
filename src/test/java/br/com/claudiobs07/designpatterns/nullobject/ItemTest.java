package br.com.claudiobs07.designpatterns.nullobject;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

    @Test
    public void testSemDesconto() {
        Item item  = new Item("tenis", 150.00);
        Assert.assertEquals(300.0, item.precoQuantidade(2), 0.001);
        Assert.assertEquals("tenis R$150.0", item.toString());
    }

    @Test
    public void testDescontoPercentual() {
	Item item  = new Item("tenis", 150.00, new DescontoPercentual(10));
	Assert.assertEquals(270, item.precoQuantidade(2), 0.001);
	Assert.assertEquals("tenis R$135.0", item.toString());
    }

    @Test
    public void testDescontoAbsoluto() {
	Item item  = new Item("tenis", 150.00, new DescontoAbsoluto(10));
	Assert.assertEquals(280.0, item.precoQuantidade(2), 0.001);
	Assert.assertEquals("tenis R$140.0", item.toString());
    }

}