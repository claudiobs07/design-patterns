package br.com.claudiobs07.designpatterns.nullobject;

public class DescontoAbsoluto implements Desconto {

    private double valorDesconto;

    public DescontoAbsoluto(double valorDesconto) {
	this.valorDesconto = valorDesconto;
    }

    @Override
    public double darDesconto(double valorOriginal) {
	return valorOriginal - valorDesconto;
    }
}
