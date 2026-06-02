package exercise08;

import java.util.Scanner;

public class Gabriel9 {
    public static void main(String[] args) {
        /* 9. Escreva um programa que leia um conjunto de 50 fichas correspondente à alunos e armazene-as em vetores,
        cada uma contendo a altura e o código do sexo de uma pessoa (codigo=1 se for masculino e 2 se for feminino), e calcule e imprima:
        - A maior, menor e a médias das alturas da turma;
        - As mulheres com altura acima da média da altura dos homens;
        - Os homens com altura abaixo da média da altura das mulheres;
        - As pessoas com altura abaixo da média da turma. */

        double[] heights;
        int[] genders;
        double maxHeight, minHeight, classAverageHeight, menAverageHeight, womenAverageHeight, classHeightSum, menHeightSum, womenHeightSum;
        int i, totalMen, totalWomen, totalStudents = 50;
        Scanner scanner = new Scanner(System.in);

        heights = new double[totalStudents];
        genders = new int[totalStudents];
        classHeightSum = 0;
        menHeightSum = 0;
        womenHeightSum = 0;
        totalMen = 0;
        totalWomen = 0;

        for (i = 0; i < totalStudents; i++) {
            System.out.printf("Ficha %d - altura (m): ", i + 1);
            heights[i] = scanner.nextDouble();
            System.out.printf("Ficha %d - sexo (1-masculino, 2-feminino): ", i + 1);
            genders[i] = scanner.nextInt();
        }

        maxHeight = heights[0];
        minHeight = heights[0];

        for (i = 0; i < totalStudents; i++) {
            if (heights[i] > maxHeight) maxHeight = heights[i];
            if (heights[i] < minHeight) minHeight = heights[i];

            classHeightSum += heights[i];

            if (genders[i] == 1) {
                menHeightSum += heights[i];
                totalMen++;
            } else {
                womenHeightSum += heights[i];
                totalWomen++;
            }
        }

        classAverageHeight = classHeightSum / totalStudents;
        menAverageHeight = (totalMen > 0) ? menHeightSum / totalMen : 0;
        womenAverageHeight = (totalWomen > 0) ? womenHeightSum / totalWomen : 0;

        System.out.printf("%nMaior altura da turma: %.2f m%n", maxHeight);
        System.out.printf("Menor altura da turma: %.2f m%n", minHeight);
        System.out.printf("Média de altura da turma: %.2f m%n", classAverageHeight);

        System.out.println("\nMulheres com altura acima da média dos homens:");
        for (i = 0; i < totalStudents; i++) {
            if (genders[i] == 2 && heights[i] > menAverageHeight)
                System.out.printf("Aluna %d: %.2f m%n", i + 1, heights[i]);
        }

        System.out.println("\nHomens com altura abaixo da média das mulheres:");
        for (i = 0; i < totalStudents; i++) {
            if (genders[i] == 1 && heights[i] < womenAverageHeight)
                System.out.printf("Aluno %d: %.2f m%n", i + 1, heights[i]);
        }

        System.out.println("\nPessoas com altura abaixo da média da turma:");
        for (i = 0; i < totalStudents; i++) {
            if (heights[i] < classAverageHeight)
                System.out.printf("Pessoa %d (sexo %d): %.2f m%n", i + 1, genders[i], heights[i]);
        }

        scanner.close();
    }
}
