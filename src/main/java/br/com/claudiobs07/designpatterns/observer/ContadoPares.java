package br.com.claudiobs07.designpatterns.observer;

public class ContadoPares implements ContadorPalavras {

    private int quantidade;

    @Override
    public void contar(String palavra) {
        if (palavra.length() % 2 == 0) {
            quantidade++;
        }
    }

    @Override
    public int contagem() {
	return quantidade;
    }
}
