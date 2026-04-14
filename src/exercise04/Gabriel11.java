package exercise04;

import java.util.Scanner;

public class Gabriel11 {
    public static void main(String[] args) {
        // Faça um algoritmo que receba o salário base e o tempo de serviço de um funcionário. Calcule e mostre:
        // O imposto, conforme tabela:
        // A gratificação em porcentagem, conforme tabela:
        // O salário líquido, ou seja, salário base menos imposto mais gratificação
        // A categoria que está na tabela a seguir:

        double baseSalary, gratificationPercentage, salaryLiquid, taxPercentage, gratification, tax;
        int serviceTime;
        String category; // A, B ou C
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Qual o seu salário base em R$? ");
        baseSalary = keyboard.nextDouble();

        System.out.println("Qual o seu tempo de serviço EM ANOS? ");
        serviceTime = keyboard.nextInt();

        // Verificando imposto
        if (baseSalary < 200) taxPercentage = 0;
        else if (baseSalary <= 450) taxPercentage = 0.03;
        else if (baseSalary < 700) taxPercentage = 0.08;
        else taxPercentage = 0.12;

        // Cálculo da gratificação
        if (baseSalary <= 500) {
            if (serviceTime <= 3) gratificationPercentage = 0.23;
            else if (serviceTime <= 6) gratificationPercentage = 0.35;
            else gratificationPercentage = 0.33;
        }

        else {
            if (serviceTime <= 3) gratificationPercentage = 0.2;
            else gratificationPercentage = 0.3;
        }

        gratification = (baseSalary * gratificationPercentage);
        tax = (baseSalary * taxPercentage);
        salaryLiquid = baseSalary - tax + gratification;

        if (salaryLiquid <= 350) category = "A";
        else if (salaryLiquid <= 600) category = "B";
        else category = "C";

        System.out.println();
        System.out.printf("O valor do imposto é R$ %.2f", tax);
        System.out.println();
        System.out.printf("O valor da gratificação é %.2f", gratification);
        System.out.println();
        System.out.printf("O seu salário líquido é de R$ %.2f", salaryLiquid);
        System.out.println();
        System.out.printf("A categoria em que você se enquadra é a %s", category);
    }
}
