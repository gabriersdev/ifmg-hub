package exercise10;

import java.util.Random;
import java.util.Scanner;

public class Gabriel07 {
    public static void main(String[] args) {
        // 7. Uma matriz quadrada de dimensão n é dita uma matriz permutação se em cada linha e em cada coluna houver n-1 elementos nulos e um único elemento igual à 1. Dada uma matriz digitada pelo usuário, informe se a mesma é ou não uma matriz permutação.
        // Ex.: Matriz permutação:
        // 0 0 0 1
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0

        int n;
        boolean isPermutation = true, existsSome1InCurrentLine = false, existsSome1InCurrentColumn = false, exists1InColumn = false, exists1InLine = false;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

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

        // Verifica se é de permutação
        // TODO - verificar a lógica. Parece muito equivocada
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!existsSome1InCurrentColumn && matrix[i][j] == 1) existsSome1InCurrentColumn = true;
                else if (existsSome1InCurrentColumn && matrix[i][j] == 1) {
                    isPermutation = false;
                    break;
                }
            }
        }
    }
}
