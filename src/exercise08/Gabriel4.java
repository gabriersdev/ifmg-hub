package exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class Gabriel4 {
    public static void main(String[] args) {
        /*
         * 4. Faça um programa que solicite o preenchimento de um vetor com 10 posições chamado Vetor Original.
         * Em seguida, o programa deve armazenar os números digitados de maneira invertida em vetor chamado Vetor Invertido.
         * Vetor Original: 10, 15, 9, 14, 2, 3, 6, 8, 20, 11
         * Vetor Invertido: 11, 20, 8, 6, 3, 2, 14, 9, 15, 10
         */

        int[] vetorOriginal = new int[10];
        int[] vetorInvertido = new int[10];
        int currentValue = 0;
        Scanner keyboard = new Scanner(System.in);

        for (
                int i = 0, j = (vetorInvertido.length - 1);
                i < vetorInvertido.length;
                i++, j--
        ) {
            System.out.println("Informe um número: ");
            currentValue = keyboard.nextInt();

            vetorOriginal[i] = currentValue;
            vetorInvertido[j] = currentValue;
        }

        System.out.println("O vetorOriginal é: " + Arrays.toString(vetorOriginal));
        System.out.println("O vetorInvertido é: " + Arrays.toString(vetorInvertido));
    }
}
