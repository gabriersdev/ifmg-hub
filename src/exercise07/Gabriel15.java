package exercise07;

import java.util.Scanner;

public class Gabriel15 {
    public static void main(String[] args) {
        /*
         * 15. Faça um programa em JAVA que imprima os N primeiros termos da serie de Fibonacci. Sabe-se que N é
         * fornecido pelo usuário. Fibonacci = 1, 1, 2, 3, 5, 8, 13, 21, ...
         */

        int quantityTerms, next, curr = 0, prev = 1, i;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Informe a quantidade de números que você deseja ver: ");

            if (keyboard.hasNextInt()) {
                quantityTerms = keyboard.nextInt();

                if (quantityTerms < 1) {
                    System.out.println("A quantidade de termos precisa ser POSITIVO, maior que ZERO");
                    continue;
                }

                System.out.printf("%nA sequência de números da Série de Fibonacci:%n");

                for (i = 0; i < quantityTerms; i++) {
                    next = prev + curr;
                    prev = curr;
                    curr = next;

                    System.out.printf("%d%s", next, (i == (quantityTerms - 1)) ? "." : ", ");
                }

                break;
            }

            //
            else System.out.println("Por favor informe um número INTEIRO");
        }
    }
}
