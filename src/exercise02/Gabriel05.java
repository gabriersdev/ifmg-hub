package exercise02;

import java.util.Scanner;

public class Gabriel05 {
    public static void main(String[] args) {
        // Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber,
        // sabendo que esse funcionário possui uma gratificação de 10% sobre o salário base e paga 5% de imposto
        // sobre o valor acumulado (salário base + gratificação).

        double salary, salaryWithGratification, liquidSalary, gratificationPercentage, farePercentage;
        Scanner keyboard = new Scanner(System.in);

        gratificationPercentage = 0.10;
        farePercentage = 0.05;

        System.out.println(":: Cálculo do salário líquido ::");
        System.out.println("Informe o seu salário: ");
        salary = keyboard.nextDouble();
        salaryWithGratification = salary * (1 + gratificationPercentage);
        liquidSalary = salaryWithGratification * (1 - farePercentage);

        System.out.printf("O valor do seu salário líquido é %.2f", liquidSalary);
        keyboard.close();
    }
}
