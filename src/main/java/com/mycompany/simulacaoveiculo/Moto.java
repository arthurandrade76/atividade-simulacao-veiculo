package com.mycompany.simulacaoveiculo;
public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    
     @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 15);
    }
    
     @Override
    public void exibirStatus() {
        System.out.println("Moto: " + getMarca() + " | Cilindradas: " + cilindradas);
    }
    
     public void ligar(String modo) {
        System.out.println("Moto ligada no modo: " + modo);
    }
     
    @Override
    public double calcularConsumo() {
        return 35.0;
    }

}
