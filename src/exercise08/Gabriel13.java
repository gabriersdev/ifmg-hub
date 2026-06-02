package exercise08;

import java.util.Scanner;

public class Gabriel13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* 13. Faça um programa que leia 10 números digitados pelo usuário e os armazene em um vetor.
        Após isso, ordene esse vetor de forma crescente e mostre o resultado. */

        int i, j, temp;
        int[] vetor;

        vetor = new int[10];

        System.out.println("Digite 10 números:");
        for (i = 0; i < 10; i++) {
            vetor[i] = in.nextInt();
        }

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.print("Vetor ordenado: ");
        for (i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        in.close();
    }
}
