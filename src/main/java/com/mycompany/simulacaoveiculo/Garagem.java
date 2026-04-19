package com.mycompany.simulacaoveiculo;
class Garagem {
    private Veiculo[] vagas = new Veiculo[10];
    private int contador = 0;


    private void adicionarAoArray(Veiculo v) {
        if (contador < vagas.length) {
            vagas[contador++] = v;
        } else {
            System.out.println("Erro: Garagem sem vagas!");
        }
    }
}

