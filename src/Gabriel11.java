import java.util.Scanner;

public class Gabriel11 {
    public static void main(String[] args) {
        // João recebeu seu salário e precisa pagar 2 contas atrasadas. Em razão do atraso, ele deverá pagar multa de
        // 2% sobre cada conta. Faça um programa que receba o salário do João e o valor de cada conta, calcule e
        // mostre quanto restará de salário após o pagamento das duas contas.

        double invoice1Value, invoice2Value, salary, salaryDiscounted, incomeDefault, incomeInvoice1, incomeInvoice2;

        incomeDefault = 0.02;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Qual o valor da 1ª conta? (R$)");
        invoice1Value = keyboard.nextDouble();

        System.out.println("Qual o valor da 2ª conta? (R$)");
        invoice2Value = keyboard.nextDouble();

        System.out.println("Qual o valor do seu salário? (R$)");
        salary = keyboard.nextDouble();

        incomeInvoice1 = invoice1Value * incomeDefault;
        incomeInvoice2 = invoice2Value * incomeDefault;
        salaryDiscounted = salary - incomeInvoice1 - incomeInvoice2;

        System.out.printf("O valor do salário após pagar as duas contas é de R$ %f", salaryDiscounted);
        keyboard.close();
    }
}
