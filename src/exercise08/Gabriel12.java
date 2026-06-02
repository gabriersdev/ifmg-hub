package exercise08;

import java.util.Scanner;

public class Gabriel12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 12. Implemente um algoritmo que verifique se um vetor preenchido pelo usuário está ordenado crescentemente ou não. */

        int indice, tamanhoDoVetor;
        boolean estaOrdenado;
        int[] vetor;

        System.out.print("Informe o tamanho do vetor: ");
        tamanhoDoVetor = scanner.nextInt();

        if (tamanhoDoVetor <= 0) {
            System.out.println("Tamanho inválido.");
            scanner.close();
            return;
        }

        vetor = new int[tamanhoDoVetor];
        System.out.println("Digite os " + tamanhoDoVetor + " elementos do vetor:");
        for (indice = 0; indice < tamanhoDoVetor; indice++) {
            vetor[indice] = scanner.nextInt();
        }

        estaOrdenado = true;
        for (indice = 0; indice < tamanhoDoVetor - 1; indice++) {
            if (vetor[indice] > vetor[indice + 1]) {
                estaOrdenado = false;
                break;
            }
        }

        if (estaOrdenado) {
            System.out.println("O vetor está ordenado crescentemente.");
        } else {
            System.out.println("O vetor NÃO está ordenado crescentemente.");
        }

        scanner.close();
    }
}
