package com.gabriel.exercise5;

//5) Escreva um programa que inverta os caracteres de um string.
//
//IMPORTANTE:
//a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//b) Evite usar funções prontas, como, por exemplo, reverse;

public class Exercise5 {

    public static void execute() {
        System.out.println("==============================================");
        System.out.println("Exercício 5:" + "\n");

        String caracteres = "ABCDEFG";

        System.out.println("String original: " + caracteres);
        System.out.println("String invertida: " + inverterString(caracteres));
    }

    private static String inverterString(String caracteres) {
        int i;
        StringBuilder auxiliar = new StringBuilder();

        for (i = caracteres.length() - 1; i >= 0; i--) {
            auxiliar.append(caracteres.charAt(i));
        }
        return auxiliar.toString();
    }
}
