package exercise07;

import java.util.Scanner;

public class Gabriel26 {
    public static void main(String[] args) {
        /*
         * 26. Implemente um programa que solicite um valor inteiro positivo (N) ao usuário. Após isso, imprima a
         * tabuada dos números de 1 à N.
         */

        int number;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Informe um número INTEIRO positivo, diferente de ZERO: ");

            if (keyboard.hasNextInt()) {
                number = keyboard.nextInt();

                if (number <= 0) {
                    System.out.println("O número tem que ser um INTEIRO positivo, diferente de ZERO");
                    continue;
                }

                //
                else {
                    for (int i = 1; i <= number; i++) {
                        System.out.println();
                        System.out.printf("Tabulada do %d:%n", i);

                        for (int j = 1; j <= 10; j++) System.out.printf("%d * %d = %d%n", i, j, (i * j));
                    }

                    break;
                }

            } else keyboard.next();
        }
    }
}
