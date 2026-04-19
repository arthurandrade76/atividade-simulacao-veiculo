package com.mycompany.simulacaoveiculo;
public class Veiculo {
    private String marca;
    private String modelo;
    private int velocidade;
    

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
   
}
   