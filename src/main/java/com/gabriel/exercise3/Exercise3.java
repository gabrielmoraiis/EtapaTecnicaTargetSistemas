package com.gabriel.exercise3;

import com.google.gson.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


//3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
//        • O menor valor de faturamento ocorrido em um dia do mês;
//• O maior valor de faturamento ocorrido em um dia do mês;
//• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
//
//        IMPORTANTE:
//a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
//b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;

public class Exercise3 {
    private static List<JsonElement> faturamentos = new ArrayList<>();

    public static void execute() throws IOException {
        System.out.println("==============================================");
        System.out.println("Exercício 3:" + "\n");
        double menorValorFaturamento = 0;
        double maiorValorFaturamento = 0;
        double somaFaturamento = 0;
        int diasFaturamento = 0;
        double media = 0;
        int diasAcimaDaMedia = 0;

        adicionarJsonNaListaFaturamento();
        for (JsonElement faturamento : faturamentos) {
           JsonObject obj = faturamento.getAsJsonObject();
           double valor = obj.get("valor").getAsDouble();

           if(valor > 0){
               if (valor < menorValorFaturamento){
                   menorValorFaturamento = valor;
               }
               if(valor > maiorValorFaturamento){
                   maiorValorFaturamento = valor;
               }

               somaFaturamento += valor;
               diasFaturamento++;
           }
           media = somaFaturamento/diasFaturamento;

            if(valor > diasAcimaDaMedia){
                diasAcimaDaMedia++;
            }
        }
        System.out.println("O menor valor de faturamento ocorrido em um dia do mês: " + menorValorFaturamento);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: " + maiorValorFaturamento);
        System.out.println("Media: " + media);
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + diasAcimaDaMedia);
    }

    private static String lerJson() {
        try {
           return String.join("", Files.readAllLines(Paths.get("src/main/resources/dados.json"),StandardCharsets.UTF_8));

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void adicionarJsonNaListaFaturamento( ){
        JsonArray array = JsonParser.parseString(lerJson()).getAsJsonArray();
        for (JsonElement element : array) {
            JsonObject obj = element.getAsJsonObject();
            faturamentos.add(obj);
        }

    }
}
