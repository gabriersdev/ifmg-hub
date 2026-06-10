package exercise06;

import java.util.Scanner;

public class Gabriel08 {
    public static void main(String[] args) {
        //    8. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1 - 1/2 + 1/3 – 1/4 + 1/5... 1/N.
        //    O valor de N deve ser positivo e fornecido pelo usuário.
        int number;
        double sumSequence = 1.0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um número N inteiro e positivo: ");

        while (true) {
            if (keyboard.hasNextInt()) {
                number = keyboard.nextInt();
                if (number <= 0) System.out.println("O número precisa ser POSITIVO. Tente novamente: ");
                else break;
            }

            //
            else {
                System.out.println("Entrada inválida. Informe um número N inteiro e positivo: ");
                keyboard.next();
            }
        }

        for (int i = 2; i <= number; i++) {
            if (i % 2 == 0) sumSequence -= 1.0 / i;
            else sumSequence += 1.0 / i;
        }

        System.out.println();
        System.out.printf("A soma da sequência é %.2f\n", sumSequence);

        keyboard.close();
    }
}
