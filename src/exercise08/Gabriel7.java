package exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class Gabriel7 {
    public static void main(String[] args) {
        /*
         * 7. Leia um conjunto de N números inteiros (n<=100). Faça a divisão desses números em dois vetores seguindo a regra:
         * Vetor1 - Apenas números positivos e pares; e Vetor2 - Apenas números ímpares e/ou negativos.
         */

        int n, count = 0, evenPosCount = 0, oddOrNegCount = 0;
        int[] allNumbers = new int[100];
        int[] vector1, vector2;
        Scanner scanner = new Scanner(System.in);
        String keyboard;

        System.out.println("Informe até 100 números inteiros. Digite 'P' para parar.");

        while (count < 100) {
            System.out.print("Informe o número " + (count + 1) + ": ");
            keyboard = scanner.next();

            if (keyboard.toUpperCase().equals("P")) break;

            try {
                n = Integer.parseInt(keyboard);
                allNumbers[count] = n;
                count++;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro ou 'P' para parar.");
            }
        }

        // Conta quantos números pertencem a cada categoria
        for (int i = 0; i < count; i++) {
            int num = allNumbers[i];
            if (num > 0 && num % 2 == 0) evenPosCount++;
            else oddOrNegCount++;
        }

        vector1 = new int[evenPosCount];
        vector2 = new int[oddOrNegCount];
        int index1 = 0, index2 = 0;

        // Preenche os dois vetores com base na regra
        for (int i = 0; i < count; i++) {
            int num = allNumbers[i];
            if (num > 0 && num % 2 == 0) vector1[index1++] = num;
            else vector2[index2++] = num;
        }

        System.out.println("\nVetor 1 (Positivos e Pares): " + Arrays.toString(vector1));
        System.out.println("Vetor 2 (Ímpares e/ou Negativos): " + Arrays.toString(vector2));
    }
}
