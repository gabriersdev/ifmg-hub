package exercise08;

import java.util.Scanner;

public class Gabriel10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 10. Faça um programa que carregue dois vetores de dez elementos e mostre um terceiro vetor resultante da intercalação desses dois vetores. */

        int[] primeiroVetor, segundoVetor, vetorIntercalado;
        int indice;

        primeiroVetor = new int[10];
        segundoVetor = new int[10];
        vetorIntercalado = new int[20];

        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (indice = 0; indice < 10; indice++) {
            primeiroVetor[indice] = scanner.nextInt();
        }

        System.out.println("Digite os 10 elementos do segundo vetor:");
        for (indice = 0; indice < 10; indice++) {
            segundoVetor[indice] = scanner.nextInt();
        }

        for (indice = 0; indice < 10; indice++) {
            vetorIntercalado[2 * indice] = primeiroVetor[indice];
            vetorIntercalado[2 * indice + 1] = segundoVetor[indice];
        }

        System.out.print("Vetor intercalado: ");
        for (indice = 0; indice < 20; indice++) {
            System.out.print(vetorIntercalado[indice] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
