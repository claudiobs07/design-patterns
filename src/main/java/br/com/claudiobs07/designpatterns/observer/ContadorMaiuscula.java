package br.com.claudiobs07.designpatterns.observer;

public class ContadorMaiuscula implements ContadorPalavras {

    private int quantidade;

    @Override
    public void contar(String palavra) {
        if (Character.isUpperCase(palavra.charAt(0))) {
            quantidade++;
        }
    }

    @Override
    public int contagem() {
	return quantidade;
    }
}
