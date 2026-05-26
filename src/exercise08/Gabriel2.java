package exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class Gabriel2 {
    public static void main(String[] args) {
        /*
         * 2. Faça um algoritmo em java que preencha dois vetores de 10 posições e exiba um terceiro vetor resultante em que cada posição é a soma das posições dos outros vetores.
         * Exemplo
         * vet1 [10 27 3 -4 -6 19 6 9 14 53]
         * vet2 [0 -76 4 5 15 -6 19 1 47]
         * vet3 [10 20 90 -11 -4 0 28 15 100]
         */

        int[] vector1 = new int[10], vector2 = new int[10], vector3 = new int[10];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < vector3.length; i++) {
            System.out.print("Informe um valor para a posição " + (i + 1) + " do ARRAY 1: ");
            vector1[i] = keyboard.nextInt();

            System.out.print("Informe um valor para a posição " + (i + 1) + " do ARRAY 2: ");
            vector2[i] = keyboard.nextInt();

            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("O array de soma é: " + Arrays.toString(vector3));
    }
}
