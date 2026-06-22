package exercise10;

import java.util.Arrays;
import java.util.Random;

public class Gabriel05 {
    public static void main(String[] args) {
        // 5. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à média. Valores baixos indicam que os dados tendem a estar próximos à média, por outro lado, valores altos indicam maior dispersão dos dados. O gerente de produção da Refrigerator Tabajará está avaliando o processo de fabricação de seus refrigerantes em lata, especificamente a etapa de preenchimento do conteúdo. As latas devem possuir 390 ml, com desvio padrão de + ou - 5 ml.
        // Na análise foram coletadas 20 amostras aleatórias das 6 linhas de produção da fábrica, medindo-se a quantidade de produto das mesmas. Você é o programador da empresa, e ficou incumbido de implementar um programa que auxilie seu gerente, mostrando ao mesmo a média e o desvio padrão de cada linha de produção. Além disso, exiba, se for o caso, qual das linhas de produção precisa ser revisada.

        int l = 6, c = 20, recipientML = 390, deviationToleranceML = 5;
        double[][] matrix = new double[l][c];
        double[] deviationPerLines = new double[l], avgMLPerLines = new double[l];
        Random random = new Random();

        // Preenche a matriz com dados aleatórios
        for (int i = 0; i < l; i++) {
            // Engloba valores de recipientML - X até recipientML
            // A GERAÇÃO ALEATÓRIA FOI MANTIDA INTACTA CONFORME SOLICITADO
            for (int j = 0; j < c; j++) matrix[i][j] = random.nextDouble(recipientML - 50, recipientML + 1);
        }

        // Itera e verifica a média DE CADA produção
        for (int i = 0; i < l; i++) {
            double accValuesForAVG = 0;
            for (int j = 0; j < c; j++) {
                accValuesForAVG += matrix[i][j];
            }
            avgMLPerLines[i] = accValuesForAVG / c;
        }

        // Calcula o desvio padrão DE CADA produção corretamente
        for (int i = 0; i < l; i++) {
            double currentDeviationL = 0;
            for (int j = 0; j < c; j++) {
                // Soma os quadrados da diferença entre o valor amostrado e a média daquela linha
                currentDeviationL += Math.pow(matrix[i][j] - avgMLPerLines[i], 2);
            }
            // Dividimos pela quantidade de elementos (variância) e tiramos a raiz quadrada (desvio padrão)
            currentDeviationL = currentDeviationL / c;
            deviationPerLines[i] = Math.sqrt(currentDeviationL);
        }

        System.out.println("Resultados:\n");
        System.out.println("Linha | Média de ML's nas latas | Desvio padrão | Status");
        System.out.println("-------------------------------------------------------------------------");

        // Mostrando os resultados e verifica se a linha precisa ser revisada
        for (int i = 0; i < l; i++) {
            double currentDeviationL = deviationPerLines[i];
            double currentAVGL = avgMLPerLines[i];
            
            String status = "OK";
            // Verifica se o desvio padrão passou da tolerância permitida (+ ou - 5ml)
            if (currentDeviationL > deviationToleranceML) {
                status = "REVISAR (Desvio > " + deviationToleranceML + "ml)";
            }

            System.out.printf("%d     | %.2f ml                 | %.2f ml         | %s%n", (i + 1), currentAVGL, currentDeviationL, status);
        }

        System.out.println("\nMatriz de Amostras:");
        System.out.println(Arrays.deepToString(matrix).replace("], ", "],\n"));
    }
}
