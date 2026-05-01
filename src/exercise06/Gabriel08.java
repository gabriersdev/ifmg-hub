package exercise06;

import java.util.Scanner;

public class Gabriel08 {
    public static void main(String[] args) {
        //    8. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1 - 1/2 + 1/3 – 1/4 + 1/5... 1/N.
        //    O valor de N deve ser positivo e fornecido pelo usuário.

        double number, sumSequence = 0, i;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um número N: ");

        while (true) {
            if (keyboard.hasNextDouble()) {
                number = keyboard.nextDouble();

                if (number <= 0) System.out.println("O número precisa ser POSITIVO");
                else break;

            } else System.out.println("Informe um número N, positivo: ");
        }

        for (i = 2; i <= number; i++) sumSequence += 1 - 1 / i;

        System.out.println();
        System.out.printf("A soma da sequência é %.2f", sumSequence);
    }
}
