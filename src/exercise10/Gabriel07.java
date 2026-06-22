package exercise10;

import java.util.Scanner;

public class Gabriel07 {
    public static void main(String[] args) {
        // 7. Uma matriz quadrada de dimensão n é dita uma matriz permutação se em cada linha e em cada coluna houver n-1 elementos nulos e um único elemento igual à 1. Dada uma matriz digitada pelo usuário, informe se a mesma é ou não uma matriz permutação.
        // Ex.: Matriz permutação:
        // 0 0 0 1
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0

        int n, count1Col, count1Row;
        boolean isPermutation = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro como dimensão para a matriz: ");
        n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Não é possível trabalhar com uma dimensão menor que 1.");
            return;
        }

        int[][] matrix = new int[n][n];

        // Preenche a matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Digite um valor inteiro para ocupar a posição [" + i + "][" + j + "] da matriz: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            count1Row = 0;
            count1Col = 0;

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) count1Row++;
                else if (matrix[i][j] != 0) isPermutation = false;

                if (matrix[j][i] == 1) count1Col++;
                else if (matrix[j][i] != 0) isPermutation = false;
            }

            if (count1Row != 1 || count1Col != 1) {
                isPermutation = false;
                break;
            }
        }

        if (isPermutation) System.out.println("A matriz é de permutação.");
        else System.out.println("A matriz não é de permutação.");
    }
}
