package exercise03;

import java.util.Scanner;

public class Gabriel08 {
    public static void main(String[] args) {
        // Crie um algoritmo que receba o valor de x, calcule e imprima o valor de f(x)
        // f(x) = 1, se x <= 1
        // f(x) = 2, se 1 < x <= 2
        // f(x) = x², se 2 < x <= 3
        // f(x) = x³, se x > 3

        double valueX, resultFx;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um número como valor de X: ");
        valueX = keyboard.nextDouble();

        if (valueX <= 1) resultFx = 1;
        else if (valueX <= 2) resultFx = 2;
        else if (valueX <= 3) resultFx = Math.pow(valueX, 2);
        else resultFx = Math.pow(valueX, 3);

        System.out.printf("O valor de f(x) é: %.2f", resultFx);
        keyboard.close();
    }
}