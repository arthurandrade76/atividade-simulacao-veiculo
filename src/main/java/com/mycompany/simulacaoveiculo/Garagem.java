package com.mycompany.simulacaoveiculo;
class Garagem {
    private Veiculo[] vagas = new Veiculo[10];
    private int contador = 0;

    public void estacionar(Carro c) {
        adicionarAoArray(c);
    }

    public void estacionar(Moto m) {
        adicionarAoArray(m);
    }

    private void adicionarAoArray(Veiculo v) {
        if (contador < vagas.length) {
            vagas[contador++] = v;
        } else {
            System.out.println("Erro: Garagem sem vagas!");
        }
    }
}

