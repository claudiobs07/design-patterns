package br.com.claudiobs07.designpatterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class TarifaEstacionamentoTest {

    @Test
    public void testTarifaFixaPorHora() {
        TarifaEstacionamento tarifaEstacionamento = new TarifaEstacionamento(3, new CalculoHora(4));
        int valor = tarifaEstacionamento.valor();
        Assert.assertEquals(12, valor);
    }

    @Test
    public void testTarifaComValorInicialDepoisFixaPorHora() {
        TarifaEstacionamento tarifaEstacionamento = new TarifaEstacionamento(5, new CalculoHoraValorInicial(5, 3, 2));
        int valor = tarifaEstacionamento.valor();
        Assert.assertEquals(9, valor);
    }

    @Test
    public void testTarifaComValorInicialDentroDoLimite() {
        TarifaEstacionamento tarifaEstacionamento = new TarifaEstacionamento(2, new CalculoHoraValorInicial(5, 3, 2));
        int valor = tarifaEstacionamento.valor();
        Assert.assertEquals(5, valor);
    }

    @Test
    public void testTarifaDiaria() {
        TarifaEstacionamento tarifaEstacionamento = new TarifaEstacionamento(50, new CalculoDiaria(20));
        int valor = tarifaEstacionamento.valor();
        Assert.assertEquals(60, valor);
    }

    @Test
    public void testTarifaDiariaMenorQueUmDia() {
        TarifaEstacionamento tarifaEstacionamento = new TarifaEstacionamento(10, new CalculoDiaria(20));
        int valor = tarifaEstacionamento.valor();
        Assert.assertEquals(20, valor);
    }

}