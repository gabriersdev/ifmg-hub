package exercise09;

import java.util.Scanner;

public class Gabriel02 {
    public static void main(String[] args) {
        // Questão 2 - Contagem de Vogais
        // Desenvolva um programa que receba uma frase digitada pelo usuário e informe quantas vogais ela possui.
        // Considere as vogais a, e, i, o e u, tratando letras maiúsculas e minúsculas da mesma forma.

        String phrase = "";
        Scanner keyboard = new Scanner(System.in);
        String vowels = "AEIOU";
        int countVowels = 0;

        System.out.println("Digite uma frase: ");
        phrase = keyboard.nextLine();

        for (String letter : phrase.split("")) {
            if (vowels.contains(letter.toUpperCase())) countVowels++;
        }

        System.out.printf("%nA frase digitada %s.%n", (countVowels > 0 ? "possui " + countVowels + " vogais" : "não possui vogais"));
    }
}
