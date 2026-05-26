package exercise08;

import java.util.Arrays;
import java.util.Scanner;

public class Gabriel3 {
    public static void main(String[] args) {
        /*
         * 3. Construa um programa JAVA que preenche dois vetores reais de 10 posições, depois crie um terceiro vetor cujo conteúdo de cada posição é: 1, se o número armazenado em uma posição do vetor é o mesmo armazenado na posição respectiva do 2º, e 0, caso contrário.
         */

        double[] vector1 = new double[10], vector2 = new double[10], vector3 = new double[10];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < vector3.length; i++) {
            System.out.print("Informe um valor para a posição " + (i + 1) + " do ARRAY 1: ");
            vector1[i] = keyboard.nextDouble();

            System.out.print("Informe um valor para a posição " + (i + 1) + " do ARRAY 2: ");
            vector2[i] = keyboard.nextDouble();

            if (vector1[i] == vector2[i]) vector3[i] = 1;
            else vector3[i] = 0;
        }

        System.out.println("O array 3 é: " + Arrays.toString(vector3));
    }
}
