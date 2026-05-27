package exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class Gabriel7 {
    public static void main(String[] args) {
        /*
         * 7. Leia um conjunto de N números inteiros (n<=100). Faça a divisão desses números em dois vetores seguindo a regra:
         * Vetor1 - Apenas números positivos e pares; e Vetor2 - Apenas números ímpares e/ou negativos.
         */

        int n, i = 1, countNumbersNeg = 0, countNumberPos = 0;
        int[] vector = new int[100];
        Scanner scanner = new Scanner(System.in);
        String keyboard;

        System.out.println("Formação de um VETOR");

        while (true) {
            i += 1;

            if (i >= 100) {
                System.out.println("O vetor atingiu a quantidade máxima de elementos");
                break;
            }

            System.out.println("Informe um número N. Digite P para parar: ");
            keyboard = scanner.next();

            if (keyboard.toUpperCase().trim().equals("P")) break;
            n = Integer.parseInt(keyboard);

            System.out.println("N: " + n);

            if (n > 100) {
                System.out.println("O número deve ser MENOR ou IGUAL a 100.");
                continue;
            }

            //
            else {
                vector[i] = n;
                if (n < 0) countNumbersNeg += 1;
                else countNumberPos += 1;
                break;
            }
        }

        int[] vector2NumbersNeg = new int[countNumbersNeg];
        int[] vector2NumberPos = new int[countNumberPos];

        for (int u = 0; u < i; i++) {
            if (vector[u] < 0) vector2NumbersNeg[u] = vector[u];
            else vector2NumberPos[u] = vector[u];
        }

        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2NumbersNeg));
        System.out.println(Arrays.toString(vector2NumberPos));
    }
}
