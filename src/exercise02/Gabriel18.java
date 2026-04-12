package exercise02;

import java.util.Scanner;

public class Gabriel18 {
    public static void main(String[] args) {
        // Sabe-se que o valor pago por quilowatt de energia custa um quinto do valor do salário mínimo. Faça um
        // algoritmo que receba o valor atual do salário mínimo e a quantidade de quilowatt consumida em uma
        // residência, calcule e mostre:
        // a. O valor pago por quilowatt;
        // b. O valor a ser pago pelo consumo nessa residência;
        // c. O valor a ser pago considerando um desconto de 15%.

        double currentSalaryMin, countKW, valuePerKW, valuePerKWInHome, valuePerKWWithDiscount, discountValue;

        Scanner keyboard = new Scanner(System.in);
        discountValue = 0.15;

        System.out.println("Qual o salário mínimo atual em R$? ");
        currentSalaryMin = keyboard.nextDouble();

        System.out.println("Quantos KW foi consumido? ");
        countKW = keyboard.nextDouble();

        valuePerKW = currentSalaryMin / 5;
        valuePerKWInHome = valuePerKW * countKW;

        // Desconto de 15% x(0.75)
        valuePerKWWithDiscount = valuePerKW * countKW * (1 - discountValue);

        System.out.printf("O valor de 1 KW é %.4f.", valuePerKW);
        System.out.println();

        System.out.printf("Você deve pagar R$ %.4f", valuePerKWInHome);
        System.out.println();

        System.out.printf("Com %.2f%% de desconto, o valor a ser pago é de R$ %.4f", discountValue * 100, valuePerKWWithDiscount);
        keyboard.close();
    }
}
