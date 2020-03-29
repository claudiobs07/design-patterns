package br.com.claudiobs07.designpatterns.strategy;

public class CalculoDiaria implements Calculo {

    private int valorDiaria;

    public CalculoDiaria(int valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public int calcularTarifa(int quantidadeHoras) {
	return valorDiaria * (int) Math.ceil(quantidadeHoras / 24.0);
    }
}
