package br.com.claudiobs07.designpatterns.builder;

public class PronomeTratamentoComposite implements PronomeTratamento {

    private PronomeTratamento tratamentoAnterior;

    private PronomeTratamento tratamentoPosterior;

    public PronomeTratamentoComposite(PronomeTratamento tratamentoAnterior, PronomeTratamento tratamentoPosterior) {
	this.tratamentoAnterior = tratamentoAnterior;
	this.tratamentoPosterior = tratamentoPosterior;
    }

    @Override
    public String tratar() {
	return tratamentoAnterior.tratar() + tratamentoPosterior.tratar();
    }
}
