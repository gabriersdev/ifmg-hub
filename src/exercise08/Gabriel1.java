package exercise08;

import java.util.Scanner;

public class Gabriel1 {
    public static void main(String[] args) {
        /*
         * 1. Uma turma tem 40 alunos. Faça um programa para ler a idade de todos os alunos e logo em seguida imprimir:
         * a) Total de alunos com idade menor ou igual a 16 anos
         * b) Total de alunos com idade maior que 16 anos
         * c) Média das idades
         * d) Idade do aluno mais novo
         * e) Idade do aluno mais velho
         */

        int[] ages = new int[40];
        int countStudentsUnderAgeOF16 = 0, countStudentsOlderAge16 = 0, avg, olderAge = 0, youngerAge = Integer.MAX_VALUE, accAges = 0;
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Informe a idade do aluno: ");
            ages[i] = keyboard.nextInt();

            if (ages[i] < 1) System.out.println("A idade não pode ser menor que 1");

            if (ages[i] <= 16) countStudentsUnderAgeOF16 += 1;
            else countStudentsOlderAge16 += 1;

            accAges += ages[i];
            if (ages[i] > olderAge) olderAge = ages[i];
            if (ages[i] < youngerAge) youngerAge = ages[i];
        }

        System.out.printf("%nExistem %d alunos com idade menor ou igual à 16.", countStudentsUnderAgeOF16);
        System.out.printf("%nExistem %d alunos com idade maior que 16.", countStudentsOlderAge16);

        System.out.printf("%nO aluno mais novo tem %d anos.%n", youngerAge);
        System.out.printf("%nO aluno mais velho tem %d anos.%n", olderAge);

        avg = accAges / ages.length;
        System.out.printf("%nA média de idades dos alunos é: %d anos.%n", avg);
    }
}
