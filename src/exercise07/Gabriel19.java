package exercise07;

import java.util.Scanner;

public class Gabriel19 {
    public static void main(String[] args) {
        /*
         * 19. Implemente um programa que receba de entrada um número inteiro qualquer, após isso verifique se o
         * número inserido é ou não um PALÍNDROMO, ou seja, o número é o mesmo tanto de visto da direita para
         * esquerda quanto da esquerda para a direita. Ex: 121, 1441, 34643, etc. Não utilize funções pré-definidas
         * no JAVA.
         */

        int number, lengthNumber, i, j;
        Scanner keyboard = new Scanner(System.in);
        String stringNumber, numberInverted = "";

        System.out.println("Informe um número: ");
        number = keyboard.nextInt();
        stringNumber = String.valueOf(number);
        lengthNumber = stringNumber.length();

        // Percorrer o número invertido
        for (
                j = lengthNumber - 1;
                j >= 0;
                j--
        )
            numberInverted += stringNumber.split("")[j];

        if (numberInverted.equals(stringNumber)) System.out.println("O número informado é um PALÍNDROMO");
        else System.out.println("O número informado não é um PALÍNDROMO");

        keyboard.close();
    }
}
