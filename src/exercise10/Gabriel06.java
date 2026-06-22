package exercise10;

import java.util.Arrays;
import java.util.Random;

public class Gabriel06 {
    public static void main(String[] args) {
        // 6. Na teoria de sistemas define-se o elemento MINMAX de uma matriz como sendo o maior elemento da linha onde se encontra o menor elemento da matriz. Faça um programa que carregue uma matriz 4 x 7 com números reais, calcule e mostre o MINMAX e sua posição (linha e coluna).

        int countLines = 4, countColumns = 7, posX = -1, posY = -1, minRow = -1;
        double minMatrix = Double.MAX_VALUE, minMax = Double.MIN_VALUE;
        double[][] matrix = new double[countLines][countColumns];
        Random random = new Random();

        // Preenche
        for (int i = 0; i < countLines; i++) {
            for (int j = 0; j < countColumns; j++) matrix[i][j] = random.nextDouble(10);
        }

        // Encontra o MENOR ELEMENTO DA MATRIZ e descobre em qual linha ele está
        for (int i = 0; i < countLines; i++) {
            for (int j = 0; j < countColumns; j++) {
                if (matrix[i][j] < minMatrix) {
                    minMatrix = matrix[i][j];
                    minRow = i;
                }
            }
        }

        posX = minRow;

        // Encontra O MAIOR ELEMENTO da linha e onde ele está
        for (int j = 0; j < countColumns; j++) {
            if (matrix[minRow][j] > minMax) {
                minMax = matrix[minRow][j];
                posY = j;
            }
        }

        System.out.printf("%nMINMAX (aprox.): %.2f. Posição: (%d, %d).%n", minMax, posX, posY);

        System.out.println("A matriz: ");
        System.out.println(Arrays.deepToString(matrix).replace("], ", "],\n"));
    }
}
