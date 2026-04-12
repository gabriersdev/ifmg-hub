package exercise03;

import java.util.Scanner;

public class Gabriel03 {
    public static void main(String[] args) {
        // O custo de um carro novo ao consumidor é a soma do custo de fábrica, a porcentagem do distribuidor e os
        // impostos. O valor pago pela distribuição e dos impostos é calculado com base no custo de fábrica. As
        // porcentagens estão apresentadas na tabela abaixo. Faça um programa que receba o custo de fábrica de um
        // carro e mostre o custo ao consumidor

        // Custo de Fábrica % Distribuidor % Impostos
        // Até R$ 28000.00 5 Isento
        // Entre R$28000.01 e R$45000.00 10 15
        // Acima de R$45000.00 15 20

        double factoryCost, customerCost, distributorPercentage, taxPercentage;
        Scanner keyboard = new Scanner(System.in);

        distributorPercentage = 0.05;
        taxPercentage = 0;

        System.out.println("Qual o custo de fábrica do carro (em R$)? ");
        factoryCost = keyboard.nextDouble();

        if (factoryCost > 28000 && factoryCost <= 45000) {
            distributorPercentage = 0.1;
            taxPercentage = 0.15;
        }

        else if (factoryCost > 45001) {
            distributorPercentage = 0.15;
            taxPercentage = 0.2;
        }

        customerCost = factoryCost + (factoryCost * distributorPercentage) + (factoryCost * taxPercentage);
        System.out.println();
        System.out.printf("Para o consumidor, custo do carro novo será de R$ %.4f", customerCost);
    }
}
