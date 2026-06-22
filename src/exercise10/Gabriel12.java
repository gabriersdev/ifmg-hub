package exercise10;

import java.util.Random;
import java.util.Scanner;

public class Gabriel12 {
    public static void main(String[] args) {
        // 12. Faça um programa que preencha uma matriz A[3][4], e outra matriz B[linhas][colunas] em que as dimensões são digitadas pelo usuário. Após isso, verifique se a operação de multiplicação de matrizes (A x B) pode ser realizada, caso seja possível, realize a operação e imprima a matriz resultante.

        Random random = new Random();
        int[][] matrixA = new int[3][4];
        int linesNum, colsNum;
        Scanner input = new Scanner(System.in);

        // Randomiza e preenche a matriz
        for (int i = 0; i < 3; i++) for (int j = 0; j < 4; j++) matrixA[i][j] = random.nextInt(100);

        System.out.println("Digite a quantidade de linhas que a matriz terá: ");
        linesNum = input.nextInt();
        if (linesNum < 1) {
            System.out.println("Não é possível trabalhar com a quantidade de linhas menor que 1.");
            return;
        }

        System.out.println("Digite a quantidade de colunas que a matriz terá: ");
        colsNum = input.nextInt();
        if (colsNum < 1) {
            System.out.println("Não é possível trabalhar com a quantidade de colunas menor que 1.");
            return;
        }

        int[][] matrixInf = new int[linesNum][colsNum];
        for (int i = 0; i < linesNum; i++) for (int j = 0; j < colsNum; j++) matrixInf[i][j] = random.nextInt(100);

        if (linesNum == 4) {
            int[][] resultMatrix = new int[3][colsNum];
            System.out.println("Resultado (A x B):");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < colsNum; j++) {
                    resultMatrix[i][j] = 0;
                    for (int k = 0; k < 4; k++) resultMatrix[i][j] += matrixA[i][k] * matrixInf[k][j];
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        // #
        else
            System.out.println("O número de colunas da matriz A (4) é diferente do número de linhas da matriz B (" + linesNum + "). Não é possível multiplicar.");
    }
}
