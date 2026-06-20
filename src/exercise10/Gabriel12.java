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

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) matrixA[i][j] = random.nextInt(100);
        }

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

        for (int i = 0; i < linesNum; i++) {
            for (int j = 0; j < colsNum; j++) matrixInf[i][j] = random.nextInt(100);
        }

        // TODO - quando é que a operação de multiplicar matrizes pode ser aplicada ?
    }
}
