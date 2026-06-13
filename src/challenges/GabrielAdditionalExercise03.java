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
        Scanner scanner = new Scanner(System.in);
        int height, i, j, k, canopyHeight, trunkSpaces;

        while (true) {
            System.out.println("Informe a quantidade de linhas que a árvore terá: ");

            if (scanner.hasNextInt()) {
                height = scanner.nextInt();

                if (height % 2 == 0) {
                    System.out.println("Por favor, informe um número ÍMPAR.");
                    continue;
                }

                if (height < 3) {
                    System.out.println("Por favor, informe um número MAIOR ou IGUAL a 3.");
                    continue;
                }

                canopyHeight = height - 1;
                trunkSpaces = canopyHeight - 1;

                for (i = 0; i < canopyHeight; i++) {
                    for (j = 0; j < trunkSpaces - i; j++) System.out.print(" ");
                    for (k = 0; k < (2 * i + 1); k++) System.out.print("#");
                    System.out.println();
                }

                for (j = 0; j < trunkSpaces; j++) System.out.print(" ");
                System.out.println("#");

                break;
            } else {
                System.out.println("O número informado precisa ser INTEIRO.");
                scanner.next(); // Limpa a entrada inválida do scanner para evitar loop infinito
            }
        }

        scanner.close();
    }
}