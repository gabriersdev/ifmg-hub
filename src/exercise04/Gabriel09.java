package exercise04;

import java.util.Scanner;

public class Gabriel09 {
    public static void main(String[] args) {
        // Faça um algoritmo que receba três números e mostre-os em ordem crescente e decrescente.

        int number1, number2, number3, temp;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        number1 = keyboard.nextInt();

        System.out.println("Digite o segundo numero: ");
        number2 = keyboard.nextInt();

        System.out.println("Digite o terceiro numero: ");
        number3 = keyboard.nextInt();

        // Faz a ordenação trocando os números de lugar e usando, para isso, a variável inteira TEMP
        if (number1 > number2) {
            temp = number2;
            number2 = number1;
            number1 = temp;
        }

        if (number2 > number3) {
            temp = number3;
            number3 = number2;
            number2 = temp;
        }

        if (number1 > number2) {
            temp = number2;
            number2 = number1;
            number1 = temp;
        }

        System.out.println("Os números digitados acima, em ordem CRESCENTE, são: ");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.println("Os números digitados acima, em ordem DECRESCENTE, são: ");
        System.out.println(number3);
        System.out.println(number2);
        System.out.println(number1);
    }
}
