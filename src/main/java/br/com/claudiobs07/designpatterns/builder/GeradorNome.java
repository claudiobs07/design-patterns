package br.com.claudiobs07.designpatterns.builder;

public class GeradorNome {

    private PronomeTratamento pronomeTratamento = new SemPronomeTratamento();

    public void setTratamento(PronomeTratamento pronomeTratamento) {
	this.pronomeTratamento = pronomeTratamento;
    }

    public PronomeTratamento getTratamento() {
	return this.pronomeTratamento;
    }

    public String gerarNome(String nomeBase) {
        return pronomeTratamento.tratar() + getPronomeTratamento() + nomeBase;
    }

    protected String getPronomeTratamento() {
        return "";
    }
}
