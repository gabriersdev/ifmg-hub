package exercise08;

import java.util.Random;

public class Gabriel8 {
    public static void main(String[] args) {
        int[] notas, frequenciaAbsoluta;
        double[] frequenciaRelativa;
        int i, nota;
        final int TOTAL_ALUNOS = 80;

        notas = new int[TOTAL_ALUNOS];
        frequenciaAbsoluta = new int[11];
        frequenciaRelativa = new double[11];
        Random random = new Random();

        // a. Leia um conjunto de valores inteiros correspondentes a 80 notas
        // Para simular, vamos gerar notas aleatórias de 0 a 10
        for (i = 0; i < TOTAL_ALUNOS; i++) {
            notas[i] = random.nextInt(11); // Gera números de 0 a 10
        }

        // b. Calcule a frequência absoluta
        for (i = 0; i < TOTAL_ALUNOS; i++) {
            nota = notas[i];
            frequenciaAbsoluta[nota]++;
        }

        // b. Calcule a frequência relativa
        for (i = 0; i < frequenciaAbsoluta.length; i++) {
            frequenciaRelativa[i] = (double) frequenciaAbsoluta[i] / TOTAL_ALUNOS;
        }

        // c. Imprima uma tabela
        System.out.println("Tabela de Frequência das Notas");
        System.out.println("-------------------------------------------");
        System.out.printf("%-10s | %-20s | %-15s%n", "Nota", "Frequência Absoluta", "Frequência Relativa");
        System.out.println("-------------------------------------------");

        for (i = 0; i < 11; i++) {
            System.out.printf("%-10d | %-20d | %-15.2f%%%n", i, frequenciaAbsoluta[i], frequenciaRelativa[i] * 100);
        }
        System.out.println("-------------------------------------------");
    }
}
