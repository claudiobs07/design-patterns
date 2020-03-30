package br.com.claudiobs07.designpatterns.observer;

import java.util.HashMap;
import java.util.Map;

public class QuebradorPalavras {

    private static final String REGEX_ESPACO = "\\s+";

    private Map<String, ContadorPalavras> contadores   = new HashMap<>();

    public String[] quebrar(String frase) {
        String[] palavras = frase.split(REGEX_ESPACO);
        notifica(palavras);
        return palavras;
    }

    public void adicionaContador(String nome, ContadorPalavras contadorPalavras) {
        contadores.put(nome, contadorPalavras);
    }

    public int getContagem(String nome) {
        return contadores.get(nome).contagem();
    }

    private void notifica(String[] palavras) {
        for (String palavra : palavras) {
            contadores.values().forEach(contator -> contator.contar(palavra));
        }
    }
}
