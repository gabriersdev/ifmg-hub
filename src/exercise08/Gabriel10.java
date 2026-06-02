package exercise08;

import java.util.Scanner;

public class Gabriel10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* 10. Faça um programa que carregue dois vetores de dez elementos e mostre um terceiro vetor resultante da intercalação desses dois vetores. */

        int[] vetor1, vetor2, intercalado;
        int i;

        vetor1 = new int[10];
        vetor2 = new int[10];
        intercalado = new int[20];

        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (i = 0; i < 10; i++) {
            vetor1[i] = in.nextInt();
        }

        System.out.println("Digite os 10 elementos do segundo vetor:");
        for (i = 0; i < 10; i++) {
            vetor2[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            intercalado[2 * i] = vetor1[i];
            intercalado[2 * i + 1] = vetor2[i];
        }

        System.out.print("Vetor intercalado: ");
        for (i = 0; i < 20; i++) {
            System.out.print(intercalado[i] + " ");
        }
        System.out.println();

        in.close();
    }
}
