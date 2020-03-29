package br.com.claudiobs07.designpatterns.strategy;

public class TarifaEstacionamento {

    private int quantidadeHoras;
    private Calculo calculo;


    public TarifaEstacionamento(int quantidadeHoras, Calculo calculo) {
	this.quantidadeHoras = quantidadeHoras;
	this.calculo = calculo;
    }

    public int valor() {
        return calculo.calcularTarifa(quantidadeHoras);
    }
}
