package br.com.claudiobs07.designpatterns.builder;

public class GeradorNomeBuilder {

    GeradorNome geradorNome;

    public GeradorNomeBuilder criaPessoa() {
        geradorNome = new GeradorNome();
        return this;
    }

    public GeradorNome gerar() {
        return geradorNome;
    }

    public GeradorNomeBuilder criaMestre() {
        geradorNome = new GeradorMestre();
        return this;
    }

    public GeradorNomeBuilder criaDoutor() {
        geradorNome = new GeradorDoutor();
        return this;
    }

    public GeradorNomeBuilder excelentissimo() {
        inserirNovoTratamento(new Excelentissimo());
        return this;
    }

    public GeradorNomeBuilder magnifico() {
        inserirNovoTratamento(new Magnifico());
        return this;
    }

    private void inserirNovoTratamento(PronomeTratamento pronomeTratamento) {
	if (geradorNome.getTratamento() instanceof SemPronomeTratamento) {
	    geradorNome.setTratamento(pronomeTratamento);
	} else {
	    geradorNome.setTratamento(new PronomeTratamentoComposite(geradorNome.getTratamento(), pronomeTratamento));
	}
    }

    public GeradorNomeBuilder de(String local) {
        geradorNome = new GeradorNomeProxyLocal(geradorNome, local);
        return this;
    }
}
