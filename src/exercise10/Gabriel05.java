package exercise10;

import java.util.Arrays;
import java.util.Random;

public class Gabriel05 {
    public static void main(String[] args) {
        // 5. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à média. Valores baixos indicam que os dados tendem a estar próximos à média, por outro lado, valores altos indicam maior dispersão dos dados. O gerente de produção da Refrigerator Tabajará está avaliando o processo de fabricação de seus refrigerantes em lata, especificamente a etapa de preenchimento do conteúdo. As latas devem possuir 390 ml, com desvio padrão de + ou - 5 ml.
        // Na análise foram coletadas 20 amostras aleatórias das 6 linhas de produção da fábrica, medindo-se a quantidade de produto das mesmas. Você é o programador da empresa, e ficou incumbido de implementar um programa que auxilie seu gerente, mostrando ao mesmo a média e o desvio padrão de cada linha de produção. Além disso, exiba, se for o caso, qual das linhas de produção precisa ser revisada.

        int c = 6, l = 20, recipientML = 390, deviationToleranceML = 5, deviationTolerancePercentage = ((recipientML * deviationToleranceML) / 100);
        double[][] matrix = new double[l][c];
        double[] deviationPerLines = new double[l], avgMLPerLines = new double[l], accMLPerLines = new double[l];
        double currentDeviationL = 0, accValuesForAVG = 0, currentAVGL = 0;
        Random random = new Random();

        // Preenche a matriz com dados aleatórios
        for (int i = 0; i < l; i++) {
            // Engloba valores de recipientML - X até recipientML
            for (int j = 0; j < c; j++) matrix[i][j] = random.nextDouble(recipientML - 50, recipientML + 1);
        }

        // Itera e verifica a média DE CADA produção e o desvio padrão DE CADA produção
        for (int i = 0; i < l; i++) {
            accValuesForAVG = 0;
            for (int j = 0; j < c; j++) accValuesForAVG += matrix[i][j];
            accMLPerLines[i] = accValuesForAVG;
            avgMLPerLines[i] = accValuesForAVG / c;
        }

        // TODO - rever! Esta fórmula está errada! A verificação não faz sentido
        for (int i = 0; i < l; i++) {
            currentDeviationL = 0;
            for (int j = 0; j < c; j++)
                currentDeviationL = accValuesForAVG + Math.pow(accMLPerLines[i] - avgMLPerLines[j], 2);
            currentDeviationL = currentDeviationL / c;
            deviationPerLines[i] = Math.sqrt(currentDeviationL);
        }

        System.out.println("Resultados:");

        // Mostrando os resultados e verifica se o desvio padrão do item está maior que o tolerado
        for (int i = 0; i < l; i++) {
            currentDeviationL = deviationPerLines[i];
            currentAVGL = avgMLPerLines[i];

            System.out.println("Linha | Média de ML's nas latas | Desvio padrão | % do desvio padrão");
            System.out.printf("%n%d, %.2f, %.2f, %.2f%%", i + 1, currentAVGL, currentDeviationL, (recipientML / currentDeviationL * 100));
        }

        System.out.println(Arrays.deepToString(matrix).replace("], ", "],\n"));
    }
}
