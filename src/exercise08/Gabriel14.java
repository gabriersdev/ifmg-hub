package exercise08;

import java.util.Scanner;

public class Gabriel14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* 14. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à média.
        As latas devem possuir 390 ml, com desvio padrão de + ou - 5 ml.
        Foram coletadas 20 amostras aleatórias da linha de produção, medindo-se a quantidade de produto das mesmas.
        Mostre a média e o desvio padrão entre os elementos das amostras e exiba se o processo deve ou não ser revisado. */

        int i;
        double soma, media, desvioPadrao, variancia;
        double[] amostras;

        amostras = new double[20];
        soma = 0.0;

        System.out.println("Digite as 20 amostras (em ml):");
        for (i = 0; i < 20; i++) {
            amostras[i] = in.nextDouble();
            soma += amostras[i];
        }

        media = soma / 20;

        variancia = 0.0;
        for (i = 0; i < 20; i++) {
            variancia += Math.pow(amostras[i] - media, 2);
        }
        variancia /= 20;

        desvioPadrao = Math.sqrt(variancia);

        System.out.printf("Média: %.2f ml%n", media);
        System.out.printf("Desvio Padrão: %.2f ml%n", desvioPadrao);

        if (desvioPadrao > 5) System.out.println("Processo de fabricação precisa ser revisado.");
        else System.out.println("Processo de fabricação está dentro dos padrões.");

        in.close();
    }
}
