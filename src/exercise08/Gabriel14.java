package exercise08;

import java.util.Scanner;

public class Gabriel14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 14. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à média.
        As latas devem possuir 390 ml, com desvio padrão de + ou - 5 ml.
        Foram coletadas 20 amostras aleatórias da linha de produção, medindo-se a quantidade de produto das mesmas.
        Mostre a média e o desvio padrão entre os elementos das amostras e exiba se o processo deve ou não ser revisado. */

        int index;
        double variance, samplesSum, samplesAverage, standardDeviation, sumOfSquaredDifferences, maxStandardDeviation = 5.0;
        final int numberOfSamples = 20;
        double[] samples;

        samples = new double[numberOfSamples];
        samplesSum = 0.0;

        System.out.println("Digite as " + numberOfSamples + " amostras (em ml):");

        for (index = 0; index < numberOfSamples; index++) {
            System.out.println("Digite a amostra " + (index + 1) + ":");
            samples[index] = scanner.nextDouble();
            samplesSum += samples[index];
        }

        sumOfSquaredDifferences = 0.0;
        samplesAverage = samplesSum / numberOfSamples;

        // Cálculo do desvio padrão
        // Itera sobre a quantidade de amostras
        for (index = 0; index < numberOfSamples; index++) {
            // O cálculo usado é o (valor da amostra X - Média das amostras)²
            sumOfSquaredDifferences += Math.pow(samples[index] - samplesAverage, 2);
        }

        // A variância é a média da soma dos quadrados da diferença
        variance = sumOfSquaredDifferences / numberOfSamples;
        standardDeviation = Math.sqrt(variance);

        System.out.printf("Média: %.2f ml%n", samplesAverage);
        System.out.printf("Desvio Padrão: %.2f ml%n", standardDeviation);

        if (standardDeviation > maxStandardDeviation) System.out.println("O processo de fabricação precisa ser revisado.");
        else System.out.println("O processo de fabricação está dentro dos padrões.");

        scanner.close();
    }
}
