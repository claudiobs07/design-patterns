package br.com.claudiobs07.designpatterns.composite;

public class TrechoAereoComConexao extends TrechoAereoComEscala {

    private int tarifaConexao;

    public TrechoAereoComConexao(TrechoAereo trechoInicial, TrechoAereo trechoFinal, int tarifaConexao) {
        super(trechoInicial, trechoFinal);
        this.tarifaConexao = tarifaConexao;
    }

    @Override
    public int getCusto() {
	return super.getCusto() + tarifaConexao;
    }
}
