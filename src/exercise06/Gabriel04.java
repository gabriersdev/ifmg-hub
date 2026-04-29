package exercise06;

import java.util.Scanner;

public class Gabriel04 {
    public static void main(String[] args) {
        //    4. Escreva um algoritmo que receba números do usuário e imprima o triplo de cada número. O algoritmo
        //    deve encerrar ao ser digitado o número –999. Obs.: O triplo de -999 não deve ser exibido.

        int number;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número: ");

            if (keyboard.hasNextInt()) {
                number = keyboard.nextInt();
                if (number == -999) break;
                System.out.printf("O triplo de %d é %d.", number, number * 3);
                System.out.println();
            }

            //
            else {
                System.out.println("Digite um número: ");
                keyboard.nextInt();
            }
        }

    }
}
