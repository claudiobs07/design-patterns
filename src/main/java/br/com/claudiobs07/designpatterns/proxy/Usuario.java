package br.com.claudiobs07.designpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;

    private List<String> permissoes;

    public Usuario(String nome) {
        this.nome = nome;
        this.permissoes = new ArrayList<>();
    }

    public void autorizaAcesso(String classe, String metodo) {
	permissoes.add(criaChave(classe, metodo));
    }

    public boolean possuiAcesso(String classe, String metodo) {
	return permissoes.contains(criaChave(classe, metodo));
    }

    private String criaChave(String classe, String metodo) {
        return classe + ":" + metodo;
    }
}
