package exercise08;

import java.util.Scanner;

public class Gabriel14 {
    public static void main(String[] args) {
        /*
         * 14. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à média.
         * Valores baixos indicam que os dados tendem a estar próximos à média, por outro lado, valores altos indicam maior dispersão dos dados.
         * O gerente de produção da Refrigerator Tabajará está avaliando o processo de fabricação de seus refrigerantes em lata, especificamente a etapa de preenchimento do conteúdo.
         * As latas devem possuir 390 ml, com desvio padrão de + ou - 5 ml.
         * Na análise foram coletadas 20 amostras aleatórias da linha de produção, medindo-se a quantidade de produto das mesmas.
         * Você é o programador da empresa, e ficou incumbido de implemente um programa que auxilie seu gerente, mostrando ao mesmo a média e o desvio padrão entre os elementos das amostras.
         * Além disso, exiba se o processo deve ou não ser revisado.
         */
        int i;
        double sum, mean, standardDeviation, variance;
        double[] samples;
        Scanner scanner;

        samples = new double[20];
        scanner = new Scanner(System.in);
        sum = 0.0;

        System.out.println("Digite as 20 amostras (em ml):");
        for (i = 0; i < 20; i++) {
            samples[i] = scanner.nextDouble();
            sum += samples[i];
        }

        mean = sum / 20;

        variance = 0.0;
        for (i = 0; i < 20; i++) {
            variance += Math.pow(samples[i] - mean, 2);
        }
        variance /= 20;

        standardDeviation = Math.sqrt(variance);

        System.out.printf("Média: %.2f ml\n", mean);
        System.out.printf("Desvio Padrão: %.2f ml\n", standardDeviation);

        if (standardDeviation > 5) {
            System.out.println("Processo de fabricação precisa ser revisado.");
        } else {
            System.out.println("Processo de fabricação está dentro dos padrões.");
        }

        scanner.close();
    }
}