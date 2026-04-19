package com.mycompany.simulacaoveiculo;
public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public Carro(String marca, String modelo, int velocidade) {
        super(marca, modelo, velocidade);
    }
    
    @Override
    public void exibirStatus() {
        System.out.println("Carro: " + getMarca() + " | Portas: " + numPortas);
    }
    
     public void ligar(String modo) {
        System.out.println("Carro ligado no modo: " + modo);
    }


}
    