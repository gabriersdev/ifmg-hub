package exercise06;

import java.util.Scanner;

public class Gabriel09 {
    public static void main(String[] args) {
        //    9. Faça um programa que calcule e imprima a soma e a média de N números digitados pelo usuário. O valor
        //    de N deve ser fornecido pelo usuário.

        double number, sum = 0, avg = 0, i;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um número N: ");

        while (true) {
            if (keyboard.hasNextDouble()) {
                number = keyboard.nextDouble();
                break;

            } else System.out.println("Informe um número N: ");
        }

        for (i = 0; i <= number; i++) sum += i;
        if (sum != 0) avg = sum / number;

        System.out.println();
        System.out.printf("A soma dos N números anteriores à %f a partir do 0 é %.2f", number, sum);

        System.out.println();
        System.out.printf("A média da soma dos N números é %.2f", avg);
    }
}
