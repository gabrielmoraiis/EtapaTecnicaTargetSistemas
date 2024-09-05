package com.gabriel.exercise1;

//1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
//Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
//Imprimir(SOMA);
//Ao final do processamento, qual será o valor da variável SOMA?

public class Exercise1 {
    public static void execute() {
        System.out.println("==============================================");
        System.out.println("Exercício 1:" + "\n");
        int INDICE = 13;
        int SOMA = 0;

        for(int K = 0; K < INDICE; K = K + 1) {
            SOMA = SOMA + K;
        }

        System.out.println("O resultado do exercício 1 é: "+ SOMA);
    }
}