package exercise08;

import java.util.Scanner;

public class Gabriel8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* 8. Fazer um algoritmo que:
        a. Leia um conjunto de valores inteiros correspondentes a 80 notas dos alunos de uma turma, notas estas que variam de 0 a 10;
        b. Calcule a frequência absoluta e a frequência relativa de cada nota;
        c. Imprima uma tabela contendo os valores das notas (de 0 a 10) e suas respectivas frequências absoluta e relativa. */

        int[] notas, frequenciaAbsoluta;
        double[] frequenciaRelativa;
        int i, nota, totalAlunos = 80;

        notas = new int[totalAlunos];
        frequenciaAbsoluta = new int[11];
        frequenciaRelativa = new double[11];

        System.out.println("Digite as 80 notas (de 0 a 10):");
        for (i = 0; i < totalAlunos; i++) {
            notas[i] = in.nextInt();
        }

        for (i = 0; i < totalAlunos; i++) {
            nota = notas[i];
            frequenciaAbsoluta[nota]++;
        }

        for (i = 0; i < frequenciaAbsoluta.length; i++) {
            frequenciaRelativa[i] = (double) frequenciaAbsoluta[i] / totalAlunos;
        }

        System.out.println("Tabela de Frequência das Notas");
        System.out.println("-------------------------------------------");
        System.out.printf("%-10s | %-20s | %-15s%n", "Nota", "Frequência Absoluta", "Frequência Relativa");
        System.out.println("-------------------------------------------");

        for (i = 0; i < 11; i++) {
            System.out.printf("%-10d | %-20d | %-15.2f%%%n", i, frequenciaAbsoluta[i], frequenciaRelativa[i] * 100);
        }

        System.out.println("-------------------------------------------");

        in.close();
    }
}
