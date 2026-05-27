package exercise08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Gabriel5 {
    public static void main(String[] args) {
        /*
         * 5. Implemente um algoritmo que preencha com valores inteiros um vetor de 10 posições.
         * Em seguida solicite o usuário que digite um valor qualquer e pesquise se o valor informado
         * pelo usuário pertence ou não ao vetor preenchido inicialmente.
         * Caso não, mostre a mensagem "O valor X não está presente no vetor";
         * caso sim, mostre a mensagem "O valor X está na posição Y do vetor". Exemplo:
         * Vetor preenchido: [50 60 15 22 33 84 100]
         * Valor digitado pelo usuário: 30 -> Mensagem: "Valor 30 não está presente no vetor"
         * Valor digitado pelo usuário: 84 -> Mensagem: "Valor 84 está na 6ª posição do vetor"
         */

        int[] vector = {24, 56, 19, 69, 43, 53, 51, 13, 40, 70};
        int currentValue;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            currentValue = keyboard.nextInt();

            for (int u = 0; u < vector.length; u++) {
                if (vector[u] == currentValue) {
                    System.out.printf("%n Valor XX não está presente no vetor %n");
                    System.out.printf("%n Valor XX está XX no vetor %n");

                    break;
                }
            }
        }

        System.out.println(Arrays.toString(vector));

        keyboard.close();
    }
}
