package exercise08;

import java.util.Scanner;

public class Gabriel10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 10. Faça um programa que carregue dois vetores de dez elementos e mostre um terceiro vetor resultante da intercalação desses dois vetores. */

        int[] firstVector, secondVector, interleavedVector;
        int index;

        firstVector = new int[10];
        secondVector = new int[10];
        interleavedVector = new int[20];

        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (index = 0; index < 10; index++) {
            System.out.println("Digite a nota " + (index + 1) + ": ");
            firstVector[index] = scanner.nextInt();
        }

        System.out.println("Digite os 10 elementos do segundo vetor:");
        for (index = 0; index < 10; index++) secondVector[index] = scanner.nextInt();

        for (index = 0; index < 10; index++) {
            interleavedVector[2 * index] = firstVector[index];
            interleavedVector[2 * index + 1] = secondVector[index];
        }

        System.out.print("Vetor intercalado: ");
        for (index = 0; index < 20; index++) System.out.print(interleavedVector[index] + " ");
        System.out.println();

        scanner.close();
    }
}
