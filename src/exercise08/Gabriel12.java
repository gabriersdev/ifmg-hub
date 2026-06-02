package exercise08;

import java.util.Scanner;

public class Gabriel12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 12. Implemente um algoritmo que verifique se um vetor preenchido pelo usuário está ordenado crescentemente ou não. */

        int index, vectorSize;
        boolean isSorted;
        int[] vector;

        System.out.print("Informe o tamanho do vetor: ");
        vectorSize = scanner.nextInt();

        if (vectorSize <= 0) {
            System.out.println("Tamanho inválido.");
            scanner.close();
            return;
        }

        vector = new int[vectorSize];
        System.out.println("Digite os " + vectorSize + " elementos do vetor:");
        for (index = 0; index < vectorSize; index++) {
            vector[index] = scanner.nextInt();
        }

        isSorted = true;
        for (index = 0; index < vectorSize - 1; index++) {
            if (vector[index] > vector[index + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) System.out.println("O vetor está ordenado crescentemente.");
        else System.out.println("O vetor NÃO está ordenado crescentemente.");

        scanner.close();
    }
}
