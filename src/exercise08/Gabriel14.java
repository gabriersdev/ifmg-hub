package exercise08;

import java.util.Scanner;

public class Gabriel14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 14. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à média.
        As latas devem possuir 390 ml, com desvio padrão de + ou - 5 ml.
        Foram coletadas 20 amostras aleatórias da linha de produção, medindo-se a quantidade de produto das mesmas.
        Mostre a média e o desvio padrão entre os elementos das amostras e exiba se o processo deve ou não ser revisado. */

        int indice;
        double somaDasAmostras, mediaDasAmostras, desvioPadrao, somaDosQuadradosDaDiferenca;
        final int numeroDeAmostras = 20;
        double[] amostras;

        amostras = new double[numeroDeAmostras];
        somaDasAmostras = 0.0;

        System.out.println("Digite as " + numeroDeAmostras + " amostras (em ml):");
        for (indice = 0; indice < numeroDeAmostras; indice++) {
            amostras[indice] = scanner.nextDouble();
            somaDasAmostras += amostras[indice];
        }

        mediaDasAmostras = somaDasAmostras / numeroDeAmostras;

        somaDosQuadradosDaDiferenca = 0.0;
        for (indice = 0; indice < numeroDeAmostras; indice++) {
            somaDosQuadradosDaDiferenca += Math.pow(amostras[indice] - mediaDasAmostras, 2);
        }
        
        // A variância é a média da soma dos quadrados da diferença
        double variancia = somaDosQuadradosDaDiferenca / numeroDeAmostras;

        desvioPadrao = Math.sqrt(variancia);

        System.out.printf("Média: %.2f ml%n", mediaDasAmostras);
        System.out.printf("Desvio Padrão: %.2f ml%n", desvioPadrao);

        final double desvioPadraoMaximo = 5.0;
        if (desvioPadrao > desvioPadraoMaximo) {
            System.out.println("Processo de fabricação precisa ser revisado.");
        } else {
            System.out.println("Processo de fabricação está dentro dos padrões.");
        }

        scanner.close();
    }
}
