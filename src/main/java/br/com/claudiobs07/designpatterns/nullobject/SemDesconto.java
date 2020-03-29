package br.com.claudiobs07.designpatterns.nullobject;

public class SemDesconto implements Desconto {

    @Override
    public double darDesconto(double valorOriginal) {
	return valorOriginal;
    }
}
