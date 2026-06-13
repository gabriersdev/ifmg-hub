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

        String word, lowerWord;
        boolean reverseIsEqual = true;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        word = keyboard.nextLine().trim();

        // Se conter espaço, não é uma palavra
        if (word.contains(" ")) {
            System.out.println("A palavra não pode conter espaços");
        }

        // Verifica as strings
        else {
            lowerWord = word.toLowerCase();
            String[] wordSplit = lowerWord.split("");
            String[] wordSplitReverse = new String[wordSplit.length];

            // Preenche wordSplitReverse
            for (int i = 0; i < wordSplit.length; i++) {
                // Se i = 3 e wordSplit.length = 3, busca a string em wordSplit na posição 0, porquê 3 - 1 - 2 => 0
                wordSplitReverse[i] = wordSplit[wordSplit.length - 1 - i];
            }

            // Compara os dois vetores comparando cada posição
            for (int i = 0; i < wordSplit.length; i++) {
                if (!wordSplit[i].equals(wordSplitReverse[i])) {
                    reverseIsEqual = false;
                    break;
                }
            }

            System.out.println(reverseIsEqual ? "Palíndromo" : "A palavra \"" + word + "\" não é palíndromo.");
        }
    }
}
