package exercise08;

import java.util.Scanner;

public class Gabriel13 {
    public static void main(String[] args) {
        /*
         * 13. Faça um programa que leia 10 números digitados pelo usuário e os armazene em um vetor.
         * Após isso, ordene esse vetor de forma crescente e mostre o resultado.
         */
        int i, j, temp;
        int[] vector;
        Scanner scanner;

        scanner = new Scanner(System.in);
        vector = new int[10];

        System.out.println("Digite 10 numeros:");
        for (i = 0; i < 10; i++) {
            vector[i] = scanner.nextInt();
        }

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado:");
        for (i = 0; i < 10; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}