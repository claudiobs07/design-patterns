package br.com.claudiobs07.designpatterns.proxy;

public class SegurancaNegocio implements Negocio {

    private Negocio negocio;

    private Usuario usuario;

    public SegurancaNegocio(Negocio negocio, Usuario usuario) {
	this.negocio = negocio;
	this.usuario = usuario;
    }

    @Override
    public void executaTransacao() {
        validaAcesso("Negocio", "executaTransacao");
        negocio.executaTransacao();
    }

    @Override
    public void cancelaTransacao() {
        validaAcesso("Negocio", "cancelaTransacao");
        negocio.cancelaTransacao();
    }

    private void validaAcesso(String classe, String metodo) {
        if (!usuario.possuiAcesso(classe, metodo)) {
            throw new RuntimeException();
        }
    }
}
