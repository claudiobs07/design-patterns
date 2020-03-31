package br.com.claudiobs07.designpatterns.composite;

import org.junit.Assert;
import org.junit.Test;

public class TrechoAereoCompostosTest {

    @Test
    public void trechoComEscala() {
        TrechoAereo trechoInicial = new TrechoAereoSimples("GRU", "BSB", 320, 1000);
        TrechoAereo trechoFinal = new TrechoAereoSimples("BSB", "BEL", 500, 2000);
        TrechoAereo escala = new TrechoAereoComEscala(trechoInicial, trechoFinal);
        Assert.assertEquals("GRU", escala.getOrigem());
        Assert.assertEquals("BEL", escala.getDestino());
        Assert.assertEquals(820, escala.getCusto());
        Assert.assertEquals(3000, escala.getDistancia());
    }

    @Test(expected = RuntimeException.class)
    public void trechoComEscalaAeroportosDiferentes() {
        TrechoAereo trechoInicial = new TrechoAereoSimples("GRU", "BSB", 320, 1000);
        TrechoAereo trechoFinal = new TrechoAereoSimples("BEL", "GRU", 900, 3000);
	new TrechoAereoComEscala(trechoInicial, trechoFinal);
    }

    @Test
    public void trechoComConexao() {
	TrechoAereo trechoInicial = new TrechoAereoSimples("GRU", "BSB", 320, 1000);
	TrechoAereo trechoFinal = new TrechoAereoSimples("BSB", "BEL", 500, 2000);
	TrechoAereo conexao = new TrechoAereoComConexao(trechoInicial, trechoFinal, 50);
	Assert.assertEquals("GRU", conexao.getOrigem());
	Assert.assertEquals("BEL", conexao.getDestino());
	Assert.assertEquals(870, conexao.getCusto());
	Assert.assertEquals(3000, conexao.getDistancia());
    }

    @Test
    public void trechoComEscalaEConexao() {
	TrechoAereo trechoInicial = new TrechoAereoSimples("GRU", "GIG", 120, 400);
	TrechoAereo trechoIntermediario = new TrechoAereoSimples("GIG", "BSB", 270, 1000);
	TrechoAereo trechoFinal = new TrechoAereoSimples("BSB", "BEL", 500, 2000);
	TrechoAereo escala = new TrechoAereoComEscala(trechoInicial, trechoIntermediario);
	TrechoAereo conexao = new TrechoAereoComConexao(escala, trechoFinal, 50);
	Assert.assertEquals("GRU", conexao.getOrigem());
	Assert.assertEquals("BEL", conexao.getDestino());
	Assert.assertEquals(940, conexao.getCusto());
	Assert.assertEquals(3400, conexao.getDistancia());
    }

}