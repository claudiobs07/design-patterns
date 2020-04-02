package br.com.claudiobs07.designpatterns.builder;

public class GeradorMestre extends GeradorNome {

    @Override
    protected String getPronomeTratamento() {
	return "Mestre ";
    }
}
