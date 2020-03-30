package br.com.claudiobs07.designpatterns.observer;

import org.junit.Assert;
import org.junit.Test;

public class QuebradorPalavrasTest {

    @Test
    public void testQuebradorPalavras() {
        String frase = "O rato roeu a roupa do rei";
        QuebradorPalavras quebradorPalavras = new QuebradorPalavras();
        String[] palavras = quebradorPalavras.quebrar(frase);
        Assert.assertEquals(7, palavras.length);
    }

    @Test
    public void testContadorSimples() {
        String frase = "O rato roeu a roupa do rei";
        QuebradorPalavras quebradorPalavras = new QuebradorPalavras();
        quebradorPalavras.adicionaContador("SIMPLES", new ContadorSimples());
        quebradorPalavras.quebrar(frase);
        Assert.assertEquals(7, quebradorPalavras.getContagem("SIMPLES"));
    }

    @Test
    public void testContadorLetrasMaiuscula() {
        String frase = "o Rato roeu a roupa do Rei";
        QuebradorPalavras quebradorPalavras = new QuebradorPalavras();
        quebradorPalavras.adicionaContador("MAIUSCULA", new ContadorMaiuscula());
        quebradorPalavras.quebrar(frase);
        Assert.assertEquals(2, quebradorPalavras.getContagem("MAIUSCULA"));
    }

    @Test
    public void testContadorLetrasPares() {
        String frase = "o Rato roeu a roupa do Rei";
        QuebradorPalavras quebradorPalavras = new QuebradorPalavras();
        quebradorPalavras.adicionaContador("PARES", new ContadoPares());
        quebradorPalavras.quebrar(frase);
        Assert.assertEquals(3, quebradorPalavras.getContagem("PARES"));
    }

    @Test
    public void testContadorIntegrado() {
        String frase = "o Rato roeu a roupa do Rei";
        QuebradorPalavras quebradorPalavras = new QuebradorPalavras();
        quebradorPalavras.adicionaContador("SIMPLES", new ContadorSimples());
        quebradorPalavras.adicionaContador("MAIUSCULA", new ContadorMaiuscula());
        quebradorPalavras.adicionaContador("PARES", new ContadoPares());
        quebradorPalavras.quebrar(frase);
        Assert.assertEquals(7, quebradorPalavras.getContagem("SIMPLES"));
        Assert.assertEquals(2, quebradorPalavras.getContagem("MAIUSCULA"));
        Assert.assertEquals(3, quebradorPalavras.getContagem("PARES"));
    }

}