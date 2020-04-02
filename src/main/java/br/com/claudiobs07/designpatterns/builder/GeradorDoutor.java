package br.com.claudiobs07.designpatterns.builder;

public class GeradorDoutor extends GeradorNome {

    @Override
    protected String getPronomeTratamento() {
	return "Doutor ";
    }
}
