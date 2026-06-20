package exercise10;

import java.util.Random;
import java.util.Scanner;

public class Gabriel04 {
    public static void main(String[] args) {
        // 4. Faça um programa que:
        // Receba as notas de 10 alunos em cinco provas diferentes e armazene-as em uma matriz 10 x 5.
        // Receba o nome dos 10 alunos e armazene-os em um vetor de string com 10 posições
        // Calcule e exiba o nome do aluno, a média das notas do mesmo e a situação:
        // Aprovado: média maior ou igual a 7
        // Reprovado: média menor que 4
        // O Exame Especial: média entre 4 e 7

        int countLines = 10, countColumns = 5;
        double avgCurrentStudent = 0, sumCurrentStudent = 0;
        double[][] originalMatrix = new double[countLines][countColumns];
        String[] studentsNames = new String[countLines];
        double[] avgStudentsNotes = new double[countLines];

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < countLines; i++) {
            for (int j = 0; j < countColumns; j++) originalMatrix[i][j] = random.nextDouble(10);
            System.out.printf("%nInforme o nome do aluno #%d: ", i + 1);
            studentsNames[i] = scanner.next();
        }

        // Cálcula e obtém a média de notas dos alunos
        for (int i = 0; i < countLines; i++) {
            sumCurrentStudent = 0;

            for (int j = 0; j < countColumns; j++) sumCurrentStudent += originalMatrix[i][j];
            avgCurrentStudent = sumCurrentStudent / countLines;

            avgStudentsNotes[i] = avgCurrentStudent;
        }

        // Exibe o nome do aluno e a situação dele
        System.out.printf("%nAluno | Média | Situação");
        for (int i = 0; i < countLines; i++) {
            avgCurrentStudent = avgStudentsNotes[i];

            if (avgCurrentStudent >= 7)
                System.out.printf("%n%s | %.2f | %s", studentsNames[i], avgCurrentStudent, "APROVADO");
            else if (avgCurrentStudent >= 4)
                System.out.printf("%n%s | %.2f | %s", studentsNames[i], avgCurrentStudent, "EM EXAME");
            else System.out.printf("%n%s | %.2f | %s", studentsNames[i], avgCurrentStudent, "REPROVADO");
        }
    }
}
