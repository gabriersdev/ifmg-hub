package exercise10;

import java.util.Arrays;
import java.util.Scanner;

public class Gabriel11 {
    public static void main(String[] args) {
        // 11. Faça um programa que receba o estoque atual de 3 produtos que estão armazenados em 4 armazéns e coloque esses dados em uma matriz 5 x 3. Sendo que a última linha da matriz contém o custo de estocagem de uma unidade de cada produto, calcule e mostre:
        // a) Quantidade de itens armazenados em cada armazém;
        // b) Qual armazém possui maior estoque do produto 2;
        // c) Qual armazém possui menor estoque;
        // d) Qual armazém possui maior custo de estocagem.

        int l = 5, c = 4;
        double accCurrentProductQuantity = 0;
        double[][] matrix = new double[l][c];
        Scanner input = new Scanner(System.in);

        // Insere
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                // Caso da última linha
                if (i == c - 1) {
                    System.out.println("Informe o custo de estocagem do produto " + (i + 1) + " no armazem " + (j + 1) + ": ");
                    matrix[i][j] = input.nextDouble();
                    input.nextLine();
                }

                else {
                    System.out.println("Informe o estoque atual do produto " + (i + 1) + " no armazem " + (j + 1) + ": ");
                    matrix[i][j] = input.nextInt();
                    input.nextLine();
                }
            }
        }

        // Verifica a quantidade de itens armazenados em cada armazém
        for (int i = 0; i < l; i++) {
            accCurrentProductQuantity = 0;
            // c - 1 pois a última linha é de custo de armazenamento
            // TODO - está errado!
            for (int j = 0; j < (c - 1); j++) accCurrentProductQuantity += matrix[j][i];
            System.out.println("A quantidade de produtos do armazém " + (i + 1) + " é " + accCurrentProductQuantity);
        }

        System.out.println("Dados brutos da matriz:");
        System.out.println(Arrays.deepToString(matrix).replace("], ", "],\n"));
        input.close();
    }
}
