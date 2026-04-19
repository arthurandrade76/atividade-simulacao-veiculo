package com.mycompany.simulacaoveiculo;
public class Veiculo {
    private String marca;
    private String modelo;
    private int velocidade;
    private String placa;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
    }

    public Veiculo(String marca, String modelo, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getMarca() { 
        return marca;       } 
    public void setMarca(String marca) { 
        this.marca = marca; }
    public String getModelo() { 
        return modelo; }
    public void setModelo(String modelo) { 
        this.modelo = modelo; }
    public int getVelocidade() { 
        return velocidade; }
    public void setVelocidade(int velocidade) { 
        this.velocidade = velocidade; }
    public String getPlaca() { 
        return placa; }
    public void setPlaca(String placa) { 
        this.placa = placa; }
    
    public void acelerar() {
        this.velocidade += 10;
    }

    public void acelerar(int incremento) {
        this.velocidade += incremento;
    }

    public void frear() {
        this.velocidade -= 10;
        if (this.velocidade < 0) this.velocidade = 0;
    }
    
    public void exibirStatus() {
        System.out.println("Status: " + marca + " " + modelo + " - Vel: " + velocidade);
    }
    
    public void ligar() {
        System.out.println("Veículo ligado.");
    }
    
    public void interagir(Veiculo outro) {
        System.out.println("Interação genérica entre veículos.");
    }

    public double calcularConsumo() {
        return 0.0;
    }
   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return placa != null && placa.equals(veiculo.placa);
    }

    @Override
    public int hashCode() {
        return placa != null ? placa.hashCode() : 0;
    }
}
   