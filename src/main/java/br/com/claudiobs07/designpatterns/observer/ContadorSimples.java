package br.com.claudiobs07.designpatterns.observer;

public class ContadorSimples implements ContadorPalavras {

    private int quantidade;

    @Override
    public void contar(String palavra) {
	quantidade++;
    }

    @Override
    public int contagem() {
	return quantidade;
    }
}
