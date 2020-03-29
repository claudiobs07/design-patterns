package br.com.claudiobs07.designpatterns.strategy;

public class CalculoHora implements Calculo {

    private int valorHora;

    public CalculoHora(int valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int calcularTarifa(int quantidadeHoras) {
        return quantidadeHoras * valorHora;
    }
}
