package exercise03;

import java.util.Scanner;

public class Gabriel05 {
    public static void main(String[] args) {
        // Faça um programa que solicite ao usuário que digite um caracter e em seguida imprima se o caracter
        // digitado é ou não uma vogal.

        String character;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite UM caractere qualquer: ");
        character = keyboard.next().toLowerCase();

        if (character.length() != 1) System.out.println("É necessário digitar APENAS UM caractere.");

        else {
            switch (character) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.printf("O caractere %s é uma vogal.", character);
                    break;

                default:
                    System.out.printf("O caractere %s não é uma vogal.", character);
                    break;
            }
        }
    }
}
