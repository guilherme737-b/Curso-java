package br.com.cursoOO;

public class Carro {



    String medelo;
    int velocidadeMaxima;
    double segundosZeroACem;
    Motor motor;

    public Carro() {

    }

    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
        this(modelo, velocidadeMaxima, segundosZeroACem, null);
    }

    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
        this.medelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
        this.motor = motor;

    }

}
