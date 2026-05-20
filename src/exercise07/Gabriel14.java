package exercise07;

import java.util.Scanner;

public class Gabriel14 {
    public static void main(String[] args) {
        /*
         * 14. Faça um programa que calcule e imprima o fatorial do valor N. O valor de N será fornecido de entrada
         * pelo usuário. O fatorial de um número positivo N qualquer (representado por N!) é o produto de todos os
         * inteiros positivos menores ou iguais à N, ou seja, Fatorial (N) = 1 * 2 * 3 * ... * N. Por exemplo, o
         * fatorial de 5 = 1 * 2 * 3 * 4 * 5 = 120.
         */

        int accumulator = 1, number, initialNumber;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Informe um número N inteiro: ");

            if (scanner.hasNextInt()) {
                initialNumber = scanner.nextInt();

                if (initialNumber < 0) {
                    System.out.println("Não é possível obter o fatorial de um número negativo.");
                    break;
                } else if (initialNumber == 0) {
                    System.out.printf("O !%d é %d", initialNumber, 0);
                    break;
                }

                for (number = initialNumber; number > 1; number -= 1) accumulator = accumulator * number;
                System.out.printf("O !%d é %d", initialNumber, accumulator);

                break;
            }
        }
    }
}
