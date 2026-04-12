import java.util.Scanner;

public class Gabriel10 {
    public static void main(String[] args) {
        //  Uma pessoa depositou R$2000,00 em um fundo de investimento que rende 0.5% ao mês. Essa pessoa
        // gostaria de saber qual o total acumulado após 2 anos. Faça um programa que forneça tais informações.
        // (Obs. desconsidere correção monetária e utilize a fórmula de juros compostos).

        double initialDeposit, accDeposit, income;
        int periodInMonths, years;

        years = 2;
        periodInMonths = (years * 12);
        income = 0.5;

        System.out.println(":: Calculando o total do investimento ::");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Qual o valor do depósito inicial? (R$)");
        initialDeposit = keyboard.nextDouble();

        accDeposit = Math.pow((initialDeposit * (1 + (income / periodInMonths))), initialDeposit * years);
        System.out.printf("O valor acumulado do investimento é de R$ %f", accDeposit);
        keyboard.close();
    }
}
