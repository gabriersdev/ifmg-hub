import java.util.Scanner;

public class Gabriel06 {
    public static void main(String[] args) {
        // Funcionários da IFVende tem como benefício a receber ao final de cada mês um salário fixo mais 4% de
        // comissão sobre as vendas realizadas pelo mesmo. Assim, faça um algoritmo que receba o salário fixo e o
        // valor de vendas realizadas por um funcionário, calcule e mostre o benefício a ser recebido pelo mesmo.

        double salary, commissionTotal, salaryWithCommission, commissionPercentage;

        commissionPercentage = 0.04;
        System.out.println(":: Cálculo do valor de comissão + salário ::");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe o seu salário: ");
        salary = keyboard.nextDouble();

        System.out.println("Informe o valor total das comissões recebidas: ");
        commissionTotal = keyboard.nextDouble();
        salaryWithCommission = salary * (commissionTotal * commissionPercentage);

        System.out.printf("O valor total que você deve receber é de %.2f", salaryWithCommission);
    }
}
