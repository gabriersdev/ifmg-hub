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

        int l = 5, c = 3, minStockWarehouse = -1, maxProduct2Warehouse = -1, maxCostWarehouse = -1, i, j;
        double accCurrentProductQuantity = 0, currentWarehouseCost = 0, minStock = Double.MAX_VALUE, maxProduct2Stock = Double.MIN_VALUE, maxCost = Double.MIN_VALUE;
        double[][] matrix = new double[l][c];
        Scanner input = new Scanner(System.in);

        // Insere
        for (i = 0; i < l; i++) {
            for (j = 0; j < c; j++) {
                // Caso da última linha
                if (i == l - 1) {
                    System.out.println("Informe o custo de estocagem do produto " + (j + 1) + ": ");
                    matrix[i][j] = input.nextDouble();
                    input.nextLine();
                } else {
                    System.out.println("Informe o estoque atual do produto " + (j + 1) + " no armazem " + (i + 1) + ": ");
                    matrix[i][j] = input.nextInt();
                    input.nextLine();
                }
            }
        }

        // Verifica a quantidade de itens armazenados em cada armazém
        for (i = 0; i < l - 1; i++) {
            accCurrentProductQuantity = 0;
            currentWarehouseCost = 0;

            for (j = 0; j < c; j++) {
                accCurrentProductQuantity += matrix[i][j];
                currentWarehouseCost += matrix[i][j] * matrix[l - 1][j];
            }

            System.out.println("A quantidade de produtos do armazém " + (i + 1) + " é " + accCurrentProductQuantity);

            if (accCurrentProductQuantity < minStock) {
                minStock = accCurrentProductQuantity;
                minStockWarehouse = i + 1;
            }

            if (matrix[i][1] > maxProduct2Stock) {
                maxProduct2Stock = matrix[i][1];
                maxProduct2Warehouse = i + 1;
            }

            if (currentWarehouseCost > maxCost) {
                maxCost = currentWarehouseCost;
                maxCostWarehouse = i + 1;
            }
        }

        System.out.println("Armazém com maior estoque do produto 2: " + maxProduct2Warehouse);
        System.out.println("Armazém com menor estoque total: " + minStockWarehouse);
        System.out.println("Armazém com maior custo de estocagem: " + maxCostWarehouse);

        System.out.println("\nDados brutos da matriz:");
        System.out.println(Arrays.deepToString(matrix).replace("], ", "],\n"));
        input.close();
    }
}
