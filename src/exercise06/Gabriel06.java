package exercise06;

import java.util.Scanner;

public class Gabriel06 {
    public static void main(String[] args) {
        //    6. Faça um programa que calcule e imprima a soma e a média dos N primeiros números positivos.
        //    Soma = 1 + 2 + 3 + ... + N

        double sum = 0, avg = 0, n;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um número N, positivo: ");

        while (true) {
            if (keyboard.hasNextDouble()) {
                n = keyboard.nextDouble();

                if (n <= 0) System.out.println("O número precisa ser POSITIVO");
                else break;

            } else System.out.println("Informe um número N, positivo: ");
        }

        for (int i = 0; i < n; i++) sum += i;
        avg = sum / n;

        System.out.println();
        System.out.printf("A SOMA dos %.2f números positivos é %.2f", n, sum);

        System.out.println();
        System.out.printf("A MÉDIA da SOMA dos %.2f números positivos é %.2f", n, avg);
    }
}
