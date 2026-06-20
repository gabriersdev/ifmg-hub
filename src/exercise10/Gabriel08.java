package exercise10;

import java.util.Scanner;

public class Gabriel08 {
    public static void main(String[] args) {
        // 8. Faça um programa que carregue uma matriz 8 x 8 com números reais e mostre uma mensagem dizendo se a matriz é ou não simétrica. Uma matriz é simétrica se para todas as posições da mesma, tem-se a relação A[i][j] = A[j][i]

        int l = 2, c = 2;
        int[][] matrix = new int[l][c];
        Scanner input = new Scanner(System.in);
        boolean allPositionsAreSim = true;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%nInforme um número para a posição [%d][%d] da matriz: ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    allPositionsAreSim = false;
                    break;
                }
            }
            if (!allPositionsAreSim) break;
        }

        System.out.printf("%nA matriz %s.", (allPositionsAreSim ? "é simétrica" : "não é simétrica"));
    }
}
