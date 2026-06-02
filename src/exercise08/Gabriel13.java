package exercise08;

import java.util.Scanner;

public class Gabriel13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 13. Faça um programa que leia 10 números digitados pelo usuário e os armazene em um vetor.
        Após isso, ordene esse vetor de forma crescente e mostre o resultado. */

        int i, j, temporaryVariable;
        int[] numbers;

        numbers = new int[10];

        System.out.println("Digite 10 números:");
        for (i = 0; i < 10; i++) numbers[i] = scanner.nextInt();

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Troca os elementos de posição
                    temporaryVariable = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temporaryVariable;
                }
            }
        }

        System.out.print("Vetor ordenado: ");
        for (i = 0; i < 10; i++) System.out.print(numbers[i] + " ");
        System.out.println();

        scanner.close();
    }
}
