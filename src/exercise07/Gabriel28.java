package exercise07;

import java.util.Scanner;

public class Gabriel28 {
    public static void main(String[] args) {
        /*
         * 28. Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. Os
         * dados utilizados para a contagem dos votos obedecem à seguinte codificação:
         * - 1, 2, 3, 4: voto para os respectivos candidatos;
         * - 5: voto em branco;
         * - Outros valores: voto nulo.
         *
         * Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
         * - total de votos para cada candidato;
         * - total de votos nulos;
         * - total de votos em branco;
         *
         * Como finalizador do conjunto de votos, tem-se o valor de código igual à 0.
         */

        Scanner scanner = new Scanner(System.in);
        int vote;
        int candidate1 = 0, candidate2 = 0, candidate3 = 0, candidate4 = 0;
        int blankVotes = 0, nullVotes = 0;

        System.out.println("Digite o código do voto (1, 2, 3, 4, 5 para branco, ou 0 para finalizar):");

        while (true) {
            System.out.println("Informe o voto: ");
            vote = scanner.nextInt();

            if (vote == 0) {
                nullVotes++;
                break;
            }

            switch (vote) {
                case 1:
                    candidate1++;
                    break;
                case 2:
                    candidate2++;
                    break;
                case 3:
                    candidate3++;
                    break;
                case 4:
                    candidate4++;
                    break;
                case 5:
                    blankVotes++;
                    break;
                default:
                    nullVotes++;
                    break;
            }
        }

        System.out.printf("%nResultados da Eleição%n");
        System.out.println("Total de votos para o Candidato 1: " + candidate1);
        System.out.println("Total de votos para o Candidato 2: " + candidate2);
        System.out.println("Total de votos para o Candidato 3: " + candidate3);
        System.out.println("Total de votos para o Candidato 4: " + candidate4);
        System.out.println("Total de votos em branco: " + blankVotes);
        System.out.println("Total de votos nulos: " + nullVotes);

        scanner.close();
    }
}
