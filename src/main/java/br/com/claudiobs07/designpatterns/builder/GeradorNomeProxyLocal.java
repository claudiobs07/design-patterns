package br.com.claudiobs07.designpatterns.builder;

public class GeradorNomeProxyLocal extends GeradorNome {

    private GeradorNome geradorNome;

    private String local;

    public GeradorNomeProxyLocal(GeradorNome geradorNome, String local) {
	this.geradorNome = geradorNome;
	this.local = local;
    }

    @Override
    public void setTratamento(PronomeTratamento pronomeTratamento) {
	geradorNome.setTratamento(pronomeTratamento);
    }

    @Override
    public PronomeTratamento getTratamento() {
	return geradorNome.getTratamento();
    }

    @Override
    public String gerarNome(String nomeBase) {
	return geradorNome.gerarNome(nomeBase) + " de " + local;
    }

    @Override
    protected String getPronomeTratamento() {
	return geradorNome.getPronomeTratamento();
    }
}
