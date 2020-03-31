package br.com.claudiobs07.designpatterns.composite;

public class TrechoAereoComEscala implements TrechoAereo {

    private TrechoAereo trechoInicial;
    private TrechoAereo trechoFinal;

    public TrechoAereoComEscala(TrechoAereo trechoInicial, TrechoAereo trechoFinal) {
        if (!trechoInicial.getDestino().equals(trechoFinal.getOrigem())) {
            throw new RuntimeException("Aeroporto de destino do trecho inicial é diferente do aeroporto de origem do trecho final");
        }

        this.trechoInicial = trechoInicial;
        this.trechoFinal = trechoFinal;
    }

    @Override
    public String getOrigem() {
        return trechoInicial.getOrigem();
    }

    @Override
    public String getDestino() {
        return trechoFinal.getDestino();
    }

    @Override
    public int getCusto() {
        return trechoInicial.getCusto() + trechoFinal.getCusto();
    }

    @Override
    public int getDistancia() {
        return trechoInicial.getDistancia() + trechoFinal.getDistancia();
    }
}
