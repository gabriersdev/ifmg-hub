package exercise02;

import java.util.Scanner;

public class Gabriel01 {
    public static void main(String[] args) {
        // Crie um algoritmo que calcule a soma e a média de 3 números informados pelo usuário.
        int number1, number2, number3;
        double sum, avg;
        Scanner keyboard = new Scanner(System.in);

        System.out.println(":: Cálculo de soma e média ::");
        System.out.println("Informe o 1º número: ");
        number1 = keyboard.nextInt();

        System.out.println("Informe o 2º número: ");
        number2 = keyboard.nextInt();

        System.out.println("Informe o 3º número: ");
        number3 = keyboard.nextInt();

        sum = number1 + number2 + number3;
        avg = sum / 3;

        System.out.printf("A soma dos 3 números informados é: %f.", sum);
        System.out.println();
        System.out.printf("A média dos 3 números informados é: %f.", avg);
        keyboard.close();
    }
}
