package exercise10;

import java.util.Random;
import java.util.Scanner;

public class Gabriel03 {
    public static void main(String[] args) {
        // 3. A produção diária de uma fábrica é armazenada, semana a semana, em uma tabela com o seguinte formato.
        // 
        //           Dia1  Dia2  Dia3  Dia4  Dia5  Dia6  Dia7
        // Semana 1
        // Semana 2
        // Semana 3
        // Semana N
        // 
        // Faça um programa que a partir dos dados contidos na tabela gere o seguinte relatório:
        // 
        // RELATÓRIO DE PRODUÇÃO RELATIVO À N SEMANAS
        // Produção média = xxxx.x
        // Número de dias com produção acima da média = xx
        // INDICAÇÃO DOS DIAS DE MÍNIMA PRODUÇÃO:
        // Semana 1
        // Semana 2
        // Semana 3
        // DIA x
        // DIA x
        // DIA x

        int countWeeks = 0, countDaysProductionAccAVG = 0, days = 7, minProduction = 0, i, j;
        double productionAVG = 0, productionAcc = 0;
        int[][] matrix;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Informe a quantidade de semanas: ");
        countWeeks = scanner.nextInt();

        if (countWeeks < 1) {
            System.out.println("Não é possível trabalhar com menos de 1 semana");
            return;
        }

        matrix = new int[countWeeks][days];

        // Preenche os dados
        for (i = 0; i < countWeeks; i++) for (j = 0; j < days; j++) matrix[i][j] = random.nextInt(1, 100);

        // Obtém a média de produção
        for (i = 0; i < countWeeks; i++) for (j = 0; j < days; j++) productionAcc += matrix[i][j];
        productionAVG = productionAcc / (countWeeks * days);

        System.out.println("Relatório de produção relativo às " + countWeeks + " semanas: ");
        System.out.println("Produção média = " + productionAVG);

        // Verifica quantidade de dias acima da média
        for (i = 0; i < countWeeks; i++)
            for (j = 0; j < days; j++) if (matrix[i][j] > productionAVG) countDaysProductionAccAVG++;

        System.out.println("Número de dias com produção acima da média = " + countDaysProductionAccAVG);

        // Produção mínima
        System.out.println("Dias com produção mínima: ");
        for (i = 0; i < countWeeks; i++) {
            System.out.println("Semana " + (i + 1));

            // A produção mínima é inicializada com o primeiro valor da linha e depois alterada para o valor corrente, se o valor corrente FOR MENOR que o primeiro valor da linha
            minProduction = matrix[i][0];

            for (j = 1; j < days; j++)
                if (matrix[i][j] < minProduction) minProduction = matrix[i][j];

            // Verifica se a produção do valor corrente da iteraçxão é igual ao minProduction
            for (j = 0; j < days; j++)
                if (matrix[i][j] == minProduction) System.out.println("DIA " + (j + 1));
        }

        scanner.close();
    }
}
