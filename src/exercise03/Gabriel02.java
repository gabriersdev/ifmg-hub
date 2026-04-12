package exercise03;

import java.util.Scanner;

public class Gabriel02 {
    public static void main(String[] args) {
        // Faça um algoritmo que dado um número digitado pelo usuário mostre se o mesmo é par ou ímpar
        double number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number = keyboard.nextDouble();

        if (number % 2 == 0) System.out.printf("O número digitado (%.2f) é PAR", number);
        else System.out.printf("O número digitado (%.2f) é ÍMPAR", number);
    }
}
