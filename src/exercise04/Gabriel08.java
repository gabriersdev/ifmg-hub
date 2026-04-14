package exercise04;

import java.util.Scanner;

public class Gabriel08 {
    public static void main(String[] args) {
        // Implemente um programa que receba um número inteiro positivo representando um ano qualquer e
        // imprima se o ano é bissexto ou não. Um ano bissexto é definido quando: (ano % 4 = 0 e (ano % 100 != 0
        // ou ano % 400 == 0)).

        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um número que seja um ano: ");
        number = keyboard.nextInt();
        System.out.println();

        if ((number % 4 == 0) && (number % 100 != 0 || number % 400 == 0)) System.out.printf("O ano informado (%d) É BISSEXTO.", number);
        else System.out.printf("O ano informado (%d) NÃO É BISSEXTO.", number);

        keyboard.close();
    }
}
