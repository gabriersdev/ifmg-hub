package exercise10;

import java.util.Arrays;
import java.util.Random;

public class Gabriel06 {
    public static void main(String[] args) {
        // 6. Na teoria de sistemas define-se o elemento MINMAX de uma matriz como sendo o maior elemento da linha onde se encontra o menor elemento da matriz. Faça um programa que carregue uma matriz 4 x 7 com números reais, calcule e mostre o MINMAX e sua posição (linha e coluna).

        int countLines = 4, countColumns = 7, posX = -1, posY = -1;
        double minElementOfLine = Double.MAX_VALUE, currentNumber;
        double[][] matrix = new double[countLines][countColumns];
        Random random = new Random();

        // Preenche
        for (int i = 0; i < countLines; i++) {
            for (int j = 0; j < countColumns; j++) matrix[i][j] = random.nextDouble(10);
        }

        // Percorre e encontra o MINMAX
        for (int i = 0; i < countLines; i++) {
            for (int j = 0; j < countColumns; j++) {
                // TODO - há um problema de lógica na verificação do minmax
                currentNumber = matrix[i][j];
                if (currentNumber < minElementOfLine) {
                    minElementOfLine = currentNumber;
                    posX = i;
                    posY = j;
                }
            }
        }

        System.out.printf("%nMINMAX: %.2f. Posição: (%d, %d).%n", minElementOfLine, posX, posY);

        System.out.println(Arrays.deepToString(matrix).replace("], ", "],\n"));
    }
}
