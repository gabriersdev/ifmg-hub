package exercise10;

import java.util.Arrays;
import java.util.Random;

public class Gabriel02 {
    public static void main(String[] args) {
        // 2. Faça um programa que preencha uma matriz 3 x 5 com números reais. Some os valores de cada linha e armazene em um vetor. A seguir, mostre qual a linha que tem maior valor somado.

        int countLines = 3, highValueAccLineNumber = 0;
        double accLineValue = 0, highValueAcc = Double.MIN_VALUE;
        double[][] matrix = new double[countLines][5];
        double[] vector = new double[countLines];
        Random random = new Random();

        // Preenche randomicamente a matriz `matrix`
        for (int i = 0; i < countLines; i++) for (int j = 0; j < 5; j++) matrix[i][j] = random.nextDouble(100);

        // Itera sobre cada linha e obtem a soma dos valores
        for (int i = 0; i < countLines; i++) {
            accLineValue = 0;

            for (int j = 0; j < 5; j++) accLineValue += matrix[i][j];
            vector[i] = accLineValue;

            if (highValueAcc < accLineValue) {
                highValueAccLineNumber = i;
                highValueAcc = accLineValue;
            }
        }

        System.out.printf("%nA linha com o maior valor de soma (%.2f) foi a de índice %d da matriz 'matrix'.%n%n", highValueAcc, highValueAccLineNumber);

        System.out.println("Matriz original:");
        System.out.println(Arrays.deepToString(matrix));

        System.out.println();
        System.out.println("Vetor de somas");
        System.out.println(Arrays.toString(vector));
    }
}
