package exercise06;

import java.util.Scanner;

public class Gabriel10 {
    public static void main(String[] args) {
        //    10. Implemente um algoritmo que receba de entrada N valores digitados pelo usuário. Dentre os valores
        //    digitados, seu programa deve encontrar o menor e o maior dos valores fornecidos.

        double minValue = 0, maxValue = 0, currentNumber;
        int count = 0, i;
        Scanner keyboard = new Scanner(System.in);


        while (true) {
            System.out.println("Informe a quantidade de números que você vai digitar: ");

            if (keyboard.hasNextInt()) {
                count = keyboard.nextInt();

                if (count <= 0) System.out.println("A quantidade de números precisa ser positiva.");

                else {
                    for (i = 0; i < count; i++) {
                        System.out.println("Informe o número #" + (i + 1) + ": ");
                        currentNumber = keyboard.nextDouble();

                        if (currentNumber < minValue) minValue = currentNumber;
                        if (currentNumber > maxValue) maxValue = currentNumber;
                    }

                    System.out.println();
                    System.out.printf("O MAIOR número dentre os %d digitados é %.2f", count, maxValue);

                    System.out.println();
                    System.out.printf("O MENOR número dentre os %d digitados é %.2f", count, minValue);

                    break;
                }
            }
        }
    }
}
