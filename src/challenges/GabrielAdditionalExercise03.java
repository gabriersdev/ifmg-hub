package challenges;

import java.util.Scanner;

public class GabrielAdditionalExercise03 {
    public static void main(String[] args) {
        /*
         * ENUNCIADO: Desenvolva um programa que desenhe uma árvore de Natal na tela. O usuário deverá
         * fornecer a altura da árvore como um número inteiro ímpar. O programa deve validar a entrada,
         * garantindo que o número seja ímpar e maior ou igual a 3. A árvore deve ser construída usando
         * o caractere '#' e espaços em branco, de forma que o tronco e a copa fiquem centralizados.
         */
        double height;
        int middle, i, j, k, intermediateHeight;
        // LÓGICA: a quantidade de linhas PODE ser PAR. O que não pode ser PAR é a quantidade de itens na linha, pois não vai ficar legal.
        // OBJETIVO: criar uma árvore de acordo com o que é informado pelo usuário
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Informe a quantidade de linhas que a árvore terá: ");

            if (keyboard.hasNextInt()) {

                intermediateHeight = keyboard.nextInt();
                height = intermediateHeight;
                System.out.println("height: " + height);

                if (height % 2 != 1) {
                    System.out.println("Por favor, informe um número ÍMPAR");
                    continue;
                }

                //
                else if (height < 3) {
                    System.out.println("Por favor, informe um número MAIOR ou IGUAL à 3");
                    continue;
                }

                // TODO - BUG - a quantidade de linhas não está funcionando!
                middle = ((int) Math.ceil(height / 2)) + (height > 3 ? 1 : 0);

                for (i = 0; i <= middle; i++) {
                    // Parte de J = 0 e para na METADE da quantidade de linhas - I
                    for (j = 0; j < middle - i; j++) System.out.print(" ");
                    // Parte de K = 0 e para no DOBRO de I + 1
                    for (k = 0; k < (2 * i + 1); k++) System.out.print("#");

                    // Pula a linha
                    System.out.println();
                }

                break;
            }

            //
            else System.out.println("O número informado precisa ser INTEIRO");
        }
    }
}