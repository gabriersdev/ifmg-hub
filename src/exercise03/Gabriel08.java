package exercise03;

import java.util.Scanner;

public class Gabriel08 {
    public static void main(String[] args) {
        // Crie um algoritmo que receba o valor de x, calcule e imprima o valor de f(x)
        // f(x) = 1, se x <= 1
        // f(x) = 2, se 1 < x <= 2
        // f(x) = x², se 2 < x <= 3
        // f(x) = x³, se x > 3

        double valueX, resCalc1 = 0, resCalc2 = 0, resCalc3 = 0, resCalc4 = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um número como valor de X: ");
        valueX = keyboard.nextDouble();

        if (valueX <= 1) resCalc1 = 1;
        if (valueX > 1 && valueX <= 2) resCalc2 = 2;
        if (valueX > 2 && valueX <= 3) resCalc3 = Math.pow(valueX, 2);
        if (valueX > 3) resCalc4 = Math.pow(valueX, 3);

        System.out.printf("Para a função f(x) = 1, se x <= 1, o valor de X é: %.2f", resCalc1);
        System.out.println();

        System.out.printf("Para a função f(x) = 2, se 1 < x <= 2, o valor de X é: %.2f", resCalc2);
        System.out.println();

        System.out.printf("Para a função f(x) = x², se 2 < x <= 3, o valor de X é: %.2f", resCalc3);
        System.out.println();

        System.out.printf("Para a função f(x) = x³, se x > 3, o valor de X é: %.2f", resCalc4);
        System.out.println();

        keyboard.close();
    }
}
