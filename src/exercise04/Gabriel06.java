package exercise04;

import java.util.Scanner;
import java.io.*;

public class Gabriel06 {
    public static void main(String[] args) {
        // Implemente um programa que receba um número inteiro de 3 dígitos de entrada. Após isso, verifique se o
        // mesmo é palíndromo, ou seja, é o mesmo número lido da direita para esquerda ou vice-versa. Ex.: 121,
        // 353, etc.

        int number;

        // Usando StringBuilder do pacote java.io, para auxiliar o processo de reversão da str
        StringBuilder stringBuilder = new StringBuilder();
        String string, reverseString;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite um número com 3 dígitos: ");
        number = keyboard.nextInt();

        string = String.valueOf(number);
        reverseString = String.valueOf(stringBuilder.append(string).reverse());

        if (reverseString.equals(string)) System.out.println("O número informado é um palíndromo.");
        else System.out.println("O número informado não é um palíndromo.");
        keyboard.close();
    }
}
