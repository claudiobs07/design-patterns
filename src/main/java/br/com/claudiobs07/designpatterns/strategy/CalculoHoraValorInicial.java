package br.com.claudiobs07.designpatterns.strategy;

public class CalculoHoraValorInicial implements Calculo {

    private int valorInicial;
    private int limiteHorasInicial;
    private int valorHoraExcedente;

    public CalculoHoraValorInicial(int valorInicial, int limiteHorasInicial, int valorHoraExcedente) {
        this.valorInicial = valorInicial;
        this.limiteHorasInicial = limiteHorasInicial;
        this.valorHoraExcedente = valorHoraExcedente;
    }

    @Override
    public int calcularTarifa(int quantidadeHoras) {
        int valor = valorInicial;
        if (quantidadeHoras > limiteHorasInicial) {
            valor += (quantidadeHoras - limiteHorasInicial) * valorHoraExcedente;
        }
	return valor;
    }
}
