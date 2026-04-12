package exercise02;

import java.util.Scanner;

public class Gabriel07 {
    public static void main(String[] args) {
        // Faça um algoritmo que calcule a área e o perímetro de um retângulo recebendo de
        // entrada os valores dos lados.

        double base, height, perimeter, ray;

        System.out.println(":: Cálculo da área e perímetro de um retângulo ::");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Valor da base: ");
        base = keyboard.nextDouble();
        System.out.println("Valor da altura: ");
        height = keyboard.nextDouble();

        perimeter = base * 2 + height * 2;
        ray = (base * height);

        System.out.printf("O perímetro desse triângulo é %f e a área dele é %f.", perimeter, ray);
        keyboard.close();
    }
}
