package exercise08;

import java.util.Scanner;

public class Gabriel9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* 9. Escreva um programa que leia um conjunto de 50 fichas correspondente à alunos e armazene-as em vetores,
        cada uma contendo a altura e o código do sexo de uma pessoa (codigo=1 se for masculino e 2 se for feminino), e calcule e imprima:
        - A maior, menor e a médias das alturas da turma;
        - As mulheres com altura acima da média da altura dos homens;
        - Os homens com altura abaixo da média da altura das mulheres;
        - As pessoas com altura abaixo da média da turma. */

        double[] alturas;
        int[] sexos;
        double maiorAltura, menorAltura, mediaTurma, mediaHomens, mediaMulheres, somaTurma, somaHomens, somaMulheres;
        int i, totalHomens, totalMulheres, totalAlunos = 50;

        alturas = new double[totalAlunos];
        sexos = new int[totalAlunos];
        somaTurma = 0;
        somaHomens = 0;
        somaMulheres = 0;
        totalHomens = 0;
        totalMulheres = 0;

        for (i = 0; i < totalAlunos; i++) {
            System.out.printf("Ficha %d - altura (m): ", i + 1);
            alturas[i] = in.nextDouble();
            System.out.printf("Ficha %d - sexo (1-masculino, 2-feminino): ", i + 1);
            sexos[i] = in.nextInt();
        }

        maiorAltura = alturas[0];
        menorAltura = alturas[0];

        for (i = 0; i < totalAlunos; i++) {
            if (alturas[i] > maiorAltura) maiorAltura = alturas[i];
            if (alturas[i] < menorAltura) menorAltura = alturas[i];

            somaTurma += alturas[i];

            if (sexos[i] == 1) {
                somaHomens += alturas[i];
                totalHomens++;
            } else {
                somaMulheres += alturas[i];
                totalMulheres++;
            }
        }

        mediaTurma = somaTurma / totalAlunos;
        mediaHomens = (totalHomens > 0) ? somaHomens / totalHomens : 0;
        mediaMulheres = (totalMulheres > 0) ? somaMulheres / totalMulheres : 0;

        System.out.printf("%nMaior altura da turma: %.2f m%n", maiorAltura);
        System.out.printf("Menor altura da turma: %.2f m%n", menorAltura);
        System.out.printf("Média de altura da turma: %.2f m%n", mediaTurma);

        System.out.println("\nMulheres com altura acima da média dos homens:");
        for (i = 0; i < totalAlunos; i++) {
            if (sexos[i] == 2 && alturas[i] > mediaHomens) System.out.printf("Aluna %d: %.2f m%n", i + 1, alturas[i]);
        }

        System.out.println("\nHomens com altura abaixo da média das mulheres:");
        for (i = 0; i < totalAlunos; i++) {
            if (sexos[i] == 1 && alturas[i] < mediaMulheres) System.out.printf("Aluno %d: %.2f m%n", i + 1, alturas[i]);
        }

        System.out.println("\nPessoas com altura abaixo da média da turma:");
        for (i = 0; i < totalAlunos; i++) {
            if (alturas[i] < mediaTurma) System.out.printf("Pessoa %d (sexo %d): %.2f m%n", i + 1, sexos[i], alturas[i]);
        }

        in.close();
    }
}
