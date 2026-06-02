package exercise08;

import java.util.Scanner;

public class Gabriel12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* 12. Implemente um algoritmo que verifique se um vetor preenchido pelo usuário está ordenado crescentemente ou não. */

        int i, tamanho;
        boolean ordenado;
        int[] vetor;

        System.out.print("Informe o tamanho do vetor: ");
        tamanho = in.nextInt();

        if (tamanho <= 0) {
            System.out.println("Tamanho inválido.");
            in.close();
            return;
        }

        vetor = new int[tamanho];
        System.out.println("Digite os " + tamanho + " elementos do vetor:");
        for (i = 0; i < tamanho; i++) {
            vetor[i] = in.nextInt();
        }

        ordenado = true;
        for (i = 0; i < tamanho - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado) System.out.println("O vetor está ordenado crescentemente.");
        else System.out.println("O vetor NÃO está ordenado crescentemente.");

        in.close();
    }
}
