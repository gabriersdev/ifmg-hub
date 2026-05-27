package exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class Gabriel6 {
    public static void main(String[] args) {
        /*
         * 6. Faça um programa em JAVA que carregue em um vetor os N primeiros valores da série de Fibonacci.
         * Fibonacci = [1,1,2,3,5,8,13,21,....]
         */

        int n = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe a quantidade de itens do vetor N que você deseja: ");
        n = keyboard.nextInt();

        if (n > 0) {
            int[] fibonacciSequence = new int[n];
            fibonacciSequence[0] = 1;

            for (int i = 1; i < n; i++) {
                if (i == 1) fibonacciSequence[i] = 1;
                else fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
            }

            System.out.printf("%nO vetor com a sequência de Fibonacci com %d números é: %s", n, Arrays.toString(fibonacciSequence));
        }

        //
        else System.out.println("Informe um valor N maior de ZERO.");
    }
}
