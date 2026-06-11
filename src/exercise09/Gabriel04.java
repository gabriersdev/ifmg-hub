package exercise09;

import java.util.Scanner;

public class Gabriel04 {
    public static void main(String[] args) {
        // Questão 4 - Palíndromo
        // Leia uma palavra e verifique se ela é um palíndromo.
        // 
        // Uma palavra é considerada palíndromo quando pode ser lida da mesma forma da esquerda para a direita e da direita para a esquerda.
        // 
        // Exemplos:
        // - arara
        // - ovo
        // - radar
        // 
        // Exiba:
        // 'Palíndromo' ou 'Não é palíndromo'.

        String word = "";
        boolean reverseIsEqual = true;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        word = keyboard.next().trim();

        // Se conter espaço, não é uma palavra
        if (word.contains(" ")) {

        } else {
            String[] wordSplitted = word.split("");
            String[] reverseWordSplitted = new String[wordSplitted.length];
            int i = wordSplitted.length - 1;

            // Colocando a palavra ao contrário
            for (String letter : wordSplitted) {
                reverseWordSplitted[i] = letter;
                i--;
            }

            for (int a = 0, b = wordSplitted.length - 1; a < wordSplitted.length - 1; a++, b--) {
                if (!wordSplitted[a].equalsIgnoreCase(reverseWordSplitted[b])) {
                    reverseIsEqual = false;
                    break;
                }
            }

            System.out.println(reverseIsEqual);
        }
    }
}
