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

   
}
   