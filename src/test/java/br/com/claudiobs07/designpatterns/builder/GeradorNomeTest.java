package br.com.claudiobs07.designpatterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class GeradorNomeTest {

    @Test
    public void testNomeBase() {
        GeradorNome geradorNome = new GeradorNomeBuilder()
                        .criaPessoa()
                        .gerar();
        String nome = geradorNome.gerarNome("Bentinho");
        Assert.assertEquals("Bentinho", nome);
    }

    @Test
    public void testMestre() {
	GeradorNome geradorNome = new GeradorNomeBuilder()
			.criaMestre()
			.gerar();
	String nome = geradorNome.gerarNome("Bentinho");
	Assert.assertEquals("Mestre Bentinho", nome);
    }

    @Test
    public void testDoutor() {
	GeradorNome geradorNome = new GeradorNomeBuilder()
			.criaDoutor()
			.gerar();
	String nome = geradorNome.gerarNome("Bentinho");
	Assert.assertEquals("Doutor Bentinho", nome);
    }

    @Test
    public void testExcelentissimoDoutor() {
	GeradorNome geradorNome = new GeradorNomeBuilder()
			.criaDoutor()
			.excelentissimo()
			.gerar();
	String nome = geradorNome.gerarNome("Bentinho");
	Assert.assertEquals("Excelentissimo Doutor Bentinho", nome);
    }

    @Test
    public void testMagnificoMestre() {
	GeradorNome geradorNome = new GeradorNomeBuilder()
			.criaMestre()
			.magnifico()
			.gerar();
	String nome = geradorNome.gerarNome("Bentinho");
	Assert.assertEquals("Magnifico Mestre Bentinho", nome);
    }

    @Test
    public void testExcelentissimoMagnificoDoutor() {
	GeradorNome geradorNome = new GeradorNomeBuilder()
			.criaMestre()
			.excelentissimo()
			.magnifico()
			.gerar();
	String nome = geradorNome.gerarNome("Bentinho");
	Assert.assertEquals("Excelentissimo Magnifico Mestre Bentinho", nome);
    }

    @Test
    public void testPessoaDeParanapiacaba() {
	GeradorNome geradorNome = new GeradorNomeBuilder()
			.criaPessoa()
			.de("Paranapiacaba")
			.gerar();
	String nome = geradorNome.gerarNome("Bentinho");
	Assert.assertEquals("Bentinho de Paranapiacaba", nome);
    }

    @Test
    public void testMagnificoDoutorDeParanapiacabaDeSantoAndre() {
	GeradorNome geradorNome = new GeradorNomeBuilder()
			.criaDoutor()
			.magnifico()
			.de("Paranapiacaba")
			.de("Santo André")
			.gerar();
	String nome = geradorNome.gerarNome("Bentinho");
	Assert.assertEquals("Magnifico Doutor Bentinho de Paranapiacaba de Santo André", nome);
    }
}