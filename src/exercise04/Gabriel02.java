package exercise04;

import java.util.Scanner;

public class Gabriel02 {
    public static void main(String[] args) {
        // O IMC (Índice de Massa Corporal) é um critério da Organização Mundial de Saúde para dar uma
        // indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = PESO/(ALTURA²).
        // Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição.

        double weight, height, imc;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Qual o seu peso? ");
        weight = keyboard.nextDouble();

        System.out.println("Qual a sua altura? ");
        height = keyboard.nextDouble();

        imc = weight / Math.pow(height, 2);

        if (imc < 18.5) System.out.println("Você está ABAIXO DO PESO.");
        else if (imc < 25) System.out.println("Você está no PESO NORMAL.");
        else if (imc < 30) System.out.println("Você está ACIMA DO PESO.");
        else System.out.println("Você está OBESO.");

        System.out.println();
        System.out.printf("Seu IMC é %.2f", imc);
    }
}
