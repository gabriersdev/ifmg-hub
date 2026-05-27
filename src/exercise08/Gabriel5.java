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
        int currentValue = 0, valueExistsInVector = 0;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor: ");
            currentValue = keyboard.nextInt();

            for (int u = 0; u < vector.length; u++) {
                if (vector[u] == currentValue) {
                    System.out.printf("%nValor %d está na %dª posição do vetor.%n", currentValue, (u + 1));
                    valueExistsInVector = 1;
                    i = 10; // para parar o FOR externo
                    break;
                }
            }

            if (valueExistsInVector == 0) System.out.printf("%nO Valor %d não está presente no vetor. Tente novamente.%n", currentValue);
        }

        System.out.printf("O vetor era: " + Arrays.toString(vector));

        keyboard.close();
    }
}
