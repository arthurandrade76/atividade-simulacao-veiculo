package com.mycompany.simulacaoveiculo;
public class Caminhao extends Veiculo {
    public Caminhao(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public void exibirStatus() {
        System.out.println("Caminhão: " + getMarca() + " " + getModelo());
    }
}