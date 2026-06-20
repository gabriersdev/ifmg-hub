package exercise10;

import java.util.Arrays;
import java.util.Scanner;

public class Gabriel01 {
    public static void main(String[] args) {
        // 1. Faça um programa que preencha uma matriz 2 x 2, calcule e mostre uma matriz resultante que será a matriz digitada multiplicada pelo maior elemento da mesma.

        double[][] matrix = new double[2][2];
        double[][] resultMatrix = new double[2][2];
        double numberInf, highNumber = Double.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                System.out.printf("%nDigite um número para ser inserido na matriz posição [%d][%d]: %n", i, j);
                numberInf = scanner.nextInt();
                if (numberInf > highNumber) highNumber = numberInf;
                matrix[i][j] = numberInf;
            }
        }

        for (int i = 0; i <= resultMatrix.length - 1; i++) {
            for (int j = 0; j <= resultMatrix[i].length - 1; j++) {
                resultMatrix[i][j] = matrix[i][j] * highNumber;
            }
        }

        System.out.println("O resultado foi:");
        System.out.println(Arrays.deepToString(resultMatrix));
    }
}
