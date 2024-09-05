package com.gabriel.exercise4;

//4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//        • SP – R$67.836,43
//        • RJ – R$36.678,66
//        • MG – R$29.229,88
//        • ES – R$27.165,48
//        • Outros – R$19.849,53
//Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.


import java.text.DecimalFormat;

public class Exercise4 {
    public static void execute() {
        System.out.println("==============================================");
        System.out.println("Exercício 4:" + "\n");
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;
        double faturamentoTotal = SP + RJ + MG + ES + Outros;
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.printf("Faturamento total foi de "+ faturamentoTotal);
        System.out.println("SP teve " + df.format((SP/faturamentoTotal)*100) + "% de representação");
        System.out.println("RJ teve " + df.format((RJ/faturamentoTotal)*100) + "% de representação");
        System.out.println("MG teve " + df.format((MG/faturamentoTotal)*100) + "% de representação");
        System.out.println("ES teve " + df.format((ES/faturamentoTotal)*100) + "% de representação");
        System.out.println("Outros teve " + df.format((Outros/faturamentoTotal)*100) + "% de representação");

    }
}
