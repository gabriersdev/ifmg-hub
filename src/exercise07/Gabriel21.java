package exercise07;

import java.util.Scanner;

public class Gabriel21 {
    public static void main(String[] args) {
        /*
         * 21. Uma Empresa de fornecimento de energia elétrica faz a leitura mensal dos medidores de consumo. Para
         * cada consumidor, são digitados os seguintes dados:
         *
         * - Número do consumidor;
         * - Quantidade de kWh consumidos durante o mês;
         * - Tipo (código) do consumidor.
         * 1 – residencial, preço em reais por kWh = 0,3
         * 2 – comercial, preço em reais por kWh = 0,5
         * 3 – industrial, preço em reais por kWh = 0,7
         *
         * Os dados devem ser lidos até que seja encontrado um consumidor com Número 0 (zero). Escreva um
         * programa que calcule e imprima:
         * - O custo total para cada consumidor;
         * - O total de consumo para os três tipos de consumidor;
         * - A média de consumo dos tipos 1 e 2.
         */

        int consumerNumber, consumerType, countType1 = 0, countType2 = 0;
        double kwhConsumed, cost, totalType1 = 0.0, totalType2 = 0.0, totalType3 = 0.0, averageType1, averageType2;
        Scanner input;

        System.out.println("Digite o número do consumidor (0 para encerrar): ");
        input = new Scanner(System.in);
        consumerNumber = input.nextInt();

        while (consumerNumber != 0) {
            System.out.println("Quantidade de kWh consumidos: ");
            kwhConsumed = input.nextDouble();

            System.out.println("Tipo do consumidor (1 - Residencial, 2 - Comercial, 3 - Industrial): ");
            consumerType = input.nextInt();

            if (consumerType == 1) {
                cost = kwhConsumed * 0.3;
                totalType1 += kwhConsumed;
                countType1++;
                System.out.println("Custo total para o consumidor " + consumerNumber + ": R$ " + cost);
            }

            //
            else if (consumerType == 2) {
                cost = kwhConsumed * 0.5;
                totalType2 += kwhConsumed;
                countType2++;
                System.out.println("Custo total para o consumidor " + consumerNumber + ": R$ " + cost);
            }

            //
            else if (consumerType == 3) {
                cost = kwhConsumed * 0.7;
                totalType3 += kwhConsumed;
                System.out.println("Custo total para o consumidor " + consumerNumber + ": R$ " + cost);
            } else System.out.println("Tipo de consumidor inválido.");

            System.out.printf("%nDigite o Número do consumidor (0 para encerrar):%n");
            consumerNumber = input.nextInt();
        }

        System.out.println();
        System.out.println("Resultados Finais");
        System.out.println("Total de consumo Tipo 1 (Residencial): " + totalType1 + " kWh");
        System.out.println("Total de consumo Tipo 2 (Comercial): " + totalType2 + " kWh");
        System.out.println("Total de consumo Tipo 3 (Industrial): " + totalType3 + " kWh");

        if (countType1 > 0) {
            averageType1 = totalType1 / countType1;
            System.out.println("Média de consumo do Tipo 1: " + averageType1 + " kWh");
        } else System.out.println("Não houve consumidores do Tipo 1.");

        if (countType2 > 0) {
            averageType2 = totalType2 / countType2;
            System.out.println("Média de consumo do Tipo 2: " + averageType2 + " kWh");
        } else System.out.println("Não houve consumidores do Tipo 2.");

        input.close();
    }
}
