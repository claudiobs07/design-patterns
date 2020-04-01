package br.com.claudiobs07.designpatterns.proxy;

public class NegocioMock implements Negocio {

    private boolean acessado = false;

    @Override
    public void executaTransacao() {
        acessado = true;
    }

    @Override
    public void cancelaTransacao() {
        acessado = true;
    }

    public boolean isAcessado() {
	return acessado;
    }
}
