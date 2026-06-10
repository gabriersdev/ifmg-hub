package exercise09;

import java.util.Scanner;

public class Gabriel03 {
    public static void main(String[] args) {
        // Questão 3 - O Sapo Não Lava o Pé: Versão das Vogais
        // Armazene a letra da música 'O Sapo Não Lava o Pé' em uma String.
        // 
        // Leia uma vogal (a, e, i, o ou u).
        // 
        // Substitua todas as vogais da música pela vogal informada utilizando o método replace().
        // 
        // Exiba a nova versão da música.

        String music = "O Sapo Não Lava o Pé", newMusic = "", vowelSelected = "", vowels = "AEIOU";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe uma vogal (A | E | I | O | U)");
        vowelSelected = keyboard.next();

        if (vowels.contains(vowelSelected.toUpperCase())) {
            newMusic = music.replaceAll("(?i)" + vowels.trim().toLowerCase(), vowelSelected);

            System.out.println("A nova música:");
            System.out.println(newMusic);

        } else {
            // O que foi digitado não é uma vogal
            System.out.println("O que foi digitado não é um vogal. Digite uma vogal (A | E | I | O | U).");
        }
    }
}
