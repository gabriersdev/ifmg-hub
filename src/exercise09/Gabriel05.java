package exercise09;

import java.util.Scanner;

public class Gabriel05 {
    public static void main(String[] args) {
        // Questão 5 - Sistema de Moderação de Comentários
        // Uma rede social deseja ocultar palavras inadequadas publicadas pelos usuários.
        // Faça um programa que:
        // 1.	Leia um comentário digitado pelo usuário.
        // 2.	Leia uma lista de 5 palavras que devem ser censuradas.
        // 3.	Substitua todas as ocorrências dessa palavra por "***".
        // 4.	Exiba o comentário censurado.
        // Exemplo de Entrada
        // Eu gosto muito de Java e Java é incrível.
        // Java
        // Exemplo de Saída
        // Eu gosto muito de *** e *** é incrível.

        String comment, commentAfterPii, regexString = "";
        String[] piiWords = {"dançar", "isso", "comprar", "isto", "gastar"};
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Comente algo: ");
        comment = keyboard.nextLine();
        // comment = "Eu gosto muito de dançar e isso é incrível";

        // Cria uma regexString usando as piiWords
        for (String word : piiWords) regexString = regexString.concat(word + "|");

        // Remove o | da última posição para evitar problemas
        regexString = regexString.substring(0, regexString.length() - 1);

        // Substitui o comentário pela censura se houver ocorrência
        regexString = ("(?im)" + "(" + regexString + ")");
        commentAfterPii = comment.replaceAll(regexString, "***");

        System.out.println("O comentário, após aplicado o filtro de censura: ");
        System.out.println(commentAfterPii);

        keyboard.close();
    }
}
