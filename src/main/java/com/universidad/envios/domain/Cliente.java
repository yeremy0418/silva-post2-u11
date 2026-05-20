package com.universidad.envios.domain;

public class Cliente {
    private boolean activo;
    private int score;
    private double limiteCredito;

    public Cliente(boolean activo, int score, double limiteCredito) {
        this.activo = activo;
        this.score = score;
        this.limiteCredito = limiteCredito;
    }

    public boolean isActivo() {
        return activo;
    }

    public int getScore() {
        return score;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
}
