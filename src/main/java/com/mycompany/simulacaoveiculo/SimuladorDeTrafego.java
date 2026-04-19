package com.mycompany.simulacaoveiculo;
public class SimuladorDeTrafego {
    private Veiculo[] pista;
    private int veiculosNaPista;
    private double combustivelGlobal = 100.0;

    public SimuladorDeTrafego(int capacidadePista) {
        this.pista = new Veiculo[capacidadePista];
        this.veiculosNaPista = 0;
    }

    public void entrarNaPista(Veiculo v) {
        if (veiculosNaPista < pista.length) {
            pista[veiculosNaPista] = v;
            veiculosNaPista++;
        } else {
            System.out.println("Erro: Pista cheia!");
        }
    }

    public void abastecer(double litros) {
        this.combustivelGlobal += litros;
    }

    public void abastecer(double litros, String tipoCombustivel) {
        System.out.println("Abastecendo " + litros + " litros de " + tipoCombustivel);
        this.combustivelGlobal += litros;
    }

    public void executarAceleracao(Veiculo v) {
        if (combustivelGlobal <= 0) {
            System.out.println("Erro: Sem combustível para acelerar!");
        } else {
            v.acelerar();
            combustivelGlobal -= v.calcularConsumo();
        }
    }

    public void iniciarInteracao(Veiculo v1, Caminhao c) {
        v1.interagir(c);
    }
}