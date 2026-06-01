package exercise08;

import java.util.Random;

public class Gabriel9 {
    public static void main(String[] args) {
        double[] alturas;
        int[] sexos;
        double maiorAltura, menorAltura, mediaAlturaTurma, mediaAlturaHomens, mediaAlturaMulheres, somaAlturasTurma, somaAlturasHomens, somaAlturasMulheres;
        int i, totalHomens, totalMulheres;
        final int TOTAL_ALUNOS = 50;

        alturas = new double[TOTAL_ALUNOS];
        sexos = new int[TOTAL_ALUNOS];
        Random random = new Random();

        somaAlturasTurma = 0;
        somaAlturasHomens = 0;
        somaAlturasMulheres = 0;
        totalHomens = 0;
        totalMulheres = 0;

        // Gerar dados aleatórios para altura (entre 1.50 e 2.00) e sexo (1 ou 2)
        for (i = 0; i < TOTAL_ALUNOS; i++) {
            alturas[i] = 1.50 + (2.00 - 1.50) * random.nextDouble();
            sexos[i] = random.nextInt(2) + 1; // 1 para masculino, 2 para feminino
        }

        maiorAltura = alturas[0];
        menorAltura = alturas[0];

        for (i = 0; i < TOTAL_ALUNOS; i++) {
            // Maior e menor altura da turma
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }

            somaAlturasTurma += alturas[i];

            if (sexos[i] == 1) { // Masculino
                somaAlturasHomens += alturas[i];
                totalHomens++;
            } else { // Feminino
                somaAlturasMulheres += alturas[i];
                totalMulheres++;
            }
        }

        mediaAlturaTurma = somaAlturasTurma / TOTAL_ALUNOS;
        mediaAlturaHomens = (totalHomens > 0) ? somaAlturasHomens / totalHomens : 0;
        mediaAlturaMulheres = (totalMulheres > 0) ? somaAlturasMulheres / totalMulheres : 0;

        System.out.printf("Maior altura da turma: %.2f m%n", maiorAltura);
        System.out.printf("Menor altura da turma: %.2f m%n", menorAltura);
        System.out.printf("Média de altura da turma: %.2f m%n", mediaAlturaTurma);
        System.out.printf("Média de altura dos homens: %.2f m%n", mediaAlturaHomens);
        System.out.printf("Média de altura das mulheres: %.2f m%n", mediaAlturaMulheres);

        System.out.println("\n--- Análises ---");

        System.out.println("\nMulheres com altura acima da média dos homens:");
        for (i = 0; i < TOTAL_ALUNOS; i++) {
            if (sexos[i] == 2 && alturas[i] > mediaAlturaHomens) {
                System.out.printf("Mulher %d: %.2f m%n", (i + 1), alturas[i]);
            }
        }

        System.out.println("\nHomens com altura abaixo da média das mulheres:");
        for (i = 0; i < TOTAL_ALUNOS; i++) {
            if (sexos[i] == 1 && alturas[i] < mediaAlturaMulheres) {
                System.out.printf("Homem %d: %.2f m%n", (i + 1), alturas[i]);
            }
        }

        System.out.println("\nPessoas com altura abaixo da média da turma:");
        for (i = 0; i < TOTAL_ALUNOS; i++) {
            if (alturas[i] < mediaAlturaTurma) {
                System.out.printf("Pessoa %d (Sexo: %d): %.2f m%n", (i + 1), sexos[i], alturas[i]);
            }
        }
    }
}
