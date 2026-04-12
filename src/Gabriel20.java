import java.util.Scanner;

public class Gabriel20 {
    public static void main(String[] args) {
        // Faça um algoritmo que receba o número de horas trabalhadas, o valor do salário mínimo e o número de
        // horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as seguintes regras:
        // a) O valor a ser pago por hora trabalhada é 0.125 do salário mínimo;
        // b) O valor a ser pago por hora extra vale 0.25 do salário mínimo;
        // c) o salário bruto equivale ao número de horas trabalhadas vezes o valor pago por hora;
        // d) a quantia a receber por horas extras equivale à horas extras realizadas multiplicado pelo valor pago
        // por hora extra;
        // e) o salário a receber equivale à soma do salário bruto mais a quantia a receber pelas horas extras.

        double currentMinSalary, totalSalary, salaryPerHour, overtimePay, overtimeTotalPay, finalSalary;
        int workTime, overtime;

        Scanner keyboard = new Scanner(System.in);

        currentMinSalary = keyboard.nextDouble();
        workTime = keyboard.nextInt();
        overtime = keyboard.nextInt();

        salaryPerHour = currentMinSalary * 0.125;
        overtimePay = currentMinSalary * 0.25;

        totalSalary = workTime * salaryPerHour;
        overtimeTotalPay = overtime * overtimePay;

        finalSalary = totalSalary + overtimeTotalPay;

        System.out.printf("O salário final a ser recebido é de R$ %.2f", finalSalary);
        keyboard.close();
    }
}
