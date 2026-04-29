package exercise03;

import java.util.Scanner;

public class Gabriel05 {
    public static void main(String[] args) {
        // Faça um programa que solicite ao usuário que digite um caracter e em seguida imprima se o caracter
        // digitado é ou não uma vogal.

        Scanner keyboard = new Scanner(System.in);
        String input;
        char character;

        System.out.print("Digite UM caractere qualquer: ");
        input = keyboard.next();

        if (input.length() != 1) {
            System.out.println("É necessário digitar APENAS UM caractere.");
        } else {
            character = Character.toLowerCase(input.charAt(0));

            switch (character) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.printf("O caractere '%c' é uma vogal.\n", input.charAt(0));
                    break;
                default:
                    if (Character.isLetter(character)) {
                        System.out.printf("O caractere '%c' é uma consoante.\n", input.charAt(0));
                    } else {
                        System.out.printf("O caractere '%c' não é uma vogal (nem uma letra).\n", input.charAt(0));
                    }
                    break;
            }
        }
        
        keyboard.close();
    }
}
