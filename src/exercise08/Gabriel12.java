package exercise08;

import java.util.Scanner;

public class Gabriel12 {
    public static void main(String[] args) {
        /*
         * 12. Implemente um algoritmo que verifique se um vetor preenchido pelo usuário está ordenado crescentemente ou não.
         */
        int i, size;
        boolean isSorted;
        int[] vector;
        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor: ");
        size = scanner.nextInt();
        
        if (size <= 0) {
            System.out.println("Tamanho inválido.");
            scanner.close();
            return;
        }

        vector = new int[size];
        System.out.println("Digite os " + size + " elementos do vetor:");
        for (i = 0; i < size; i++) {
            vector[i] = scanner.nextInt();
        }

        isSorted = true;
        for (i = 0; i < size - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("O vetor está ordenado crescentemente.");
        } else {
            System.out.println("O vetor NÃO está ordenado crescentemente.");
        }

        scanner.close();
    }
}