package exercise02;

import java.util.Scanner;

public class Gabriel04 {
    public static void main(String[] args) {
        // Faça um algoritmo que receba 3 notas e seus respectivos pesos, calcule e mostre a media ponderada dessas notas.

        double number1, number2, number3, avgPond;
        int weight1, weight2, weight3;
        Scanner keyboard = new Scanner(System.in);

        System.out.println(":: Cálculo da média ponderada de notas ::");
        System.out.println("Informe a 1ª nota: ");
        number1 = keyboard.nextDouble();
        System.out.println("Informe o peso desta 1ª nota: ");
        weight1 = keyboard.nextInt();

        System.out.println("Informe o 2ª nota: ");
        number2 = keyboard.nextDouble();
        System.out.println("Informe o peso desta 2ª nota: ");
        weight2 = keyboard.nextInt();

        System.out.println("Informe o 3ª nota: ");
        number3 = keyboard.nextDouble();
        System.out.println("Informe o peso desta 3ª nota: ");
        weight3 = keyboard.nextInt();

        avgPond = (number1 * weight1) + (number2 * weight2) + (number3 * weight3);
        System.out.printf("A média ponderada das notas e pesos informados é de %f.", avgPond);
        keyboard.close();
    }
}
