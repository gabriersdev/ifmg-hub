package exercise03;

import java.util.Scanner;

public class Gabriel06 {
    public static void main(String[] args) {
        // Uma empresa decide dar um aumento de 30% aos funcionários com salário inferior a R$700,00 e 10% aos
        // funcionários com salário superior ou igual a R$700,00. Faça um algoritmo que calcule o reajuste e mostre
        // o novo salário.

        double currentSalary, newSalary, percentage;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe o salário em R$: ");
        currentSalary = keyboard.nextDouble();

        if (currentSalary < 700) percentage = 0.3;
        else percentage = 0.1;

        newSalary = currentSalary * (1 + percentage);
        System.out.println();
        System.out.printf("O novo salário será de R$ %.4f", newSalary);
        keyboard.close();
    }
}
