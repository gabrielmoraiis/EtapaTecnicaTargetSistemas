package com.gabriel.exercise2;

//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma
// dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
// escreva um programa na linguagem que desejar onde, informado um número,
// ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence
// ou não a sequência.

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static void execute() {
        System.out.println("==============================================");
        System.out.println("Exercício 2:" + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número que deseja verificar na sequencia de fibonacci: ");
        int numSearch = sc.nextInt();
        ArrayList<Integer> arrayFibonacci = new ArrayList<>();

       arrayFibonacci.add(0);
       arrayFibonacci.add(1);

      while(arrayFibonacci.get(arrayFibonacci.size() - 1) < numSearch) {
          int nextElement = arrayFibonacci.get(arrayFibonacci.size() - 1) + arrayFibonacci.get(arrayFibonacci.size() - 2);

          if(nextElement == numSearch) {
              System.out.println("O número "+ numSearch + " pertence a sequência.");
              break;
          }else if(nextElement > numSearch) {
              System.out.println("O número " + numSearch + " não pertence a sequência.");
              arrayFibonacci.add(nextElement);
              break;
          }else {
              arrayFibonacci.add(nextElement);
          }
      }
      System.out.println(arrayFibonacci);
    }
}
