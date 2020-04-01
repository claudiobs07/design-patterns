package br.com.claudiobs07.designpatterns.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProxySegurancaTest {

    @Test
    public void testeAutorizaAcesso() {
        Usuario usuario = new Usuario("Silva");
        usuario.autorizaAcesso("Negocio", "executaTransacao");
        NegocioMock negocioMock = new NegocioMock();
        Negocio negocio = new SegurancaNegocio(negocioMock, usuario);
        negocio.executaTransacao();
        assertTrue(negocioMock.isAcessado());
    }

    @Test(expected = RuntimeException.class)
    public void testeNaoAutorizaAcesso() {
	Usuario usuario = new Usuario("Silva");
	usuario.autorizaAcesso("Negocio", "executaTransacao");
	NegocioMock negocioMock = new NegocioMock();
	Negocio negocio = new SegurancaNegocio(negocioMock, usuario);
	negocio.cancelaTransacao();
    }

}