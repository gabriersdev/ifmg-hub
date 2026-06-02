package exercise08;

import java.util.Scanner;

public class Gabriel8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 8. Fazer um algoritmo que:
        a. Leia um conjunto de valores inteiros correspondentes a 80 notas dos alunos de uma turma, notas estas que variam de 0 a 10;
        b. Calcule a frequência absoluta e a frequência relativa de cada nota;
        c. Imprima uma tabela contendo os valores das notas (de 0 a 10) e suas respectivas frequências absoluta e relativa. */

        int[] grades, absoluteFrequency;
        double[] relativeFrequency;
        int i, grade, totalStudents = 80;

        grades = new int[totalStudents];
        absoluteFrequency = new int[11];
        relativeFrequency = new double[11];

        System.out.println("Digite as 80 notas (de 0 a 10):");
        for (i = 0; i < totalStudents; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        for (i = 0; i < totalStudents; i++) {
            grade = grades[i];
            absoluteFrequency[grade]++;
        }

        for (i = 0; i < absoluteFrequency.length; i++)
            relativeFrequency[i] = (double) absoluteFrequency[i] / totalStudents;

        System.out.println("Tabela de Frequência das Notas");
        System.out.println();
        System.out.printf("%-10s | %-20s | %-15s%n", "Nota", "Frequência Absoluta", "Frequência Relativa");
        System.out.println();

        for (i = 0; i < 11; i++)
            System.out.printf("%-10d | %-20d | %-15.2f%%%n", i, absoluteFrequency[i], relativeFrequency[i] * 100);

        System.out.println();
        scanner.close();
    }
}
