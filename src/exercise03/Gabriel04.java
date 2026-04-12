package exercise03;

import java.util.Scanner;

public class Gabriel04 {
    public static void main(String[] args) {
        // Faça um programa que simule uma calculadora simples. Para isso, o usuário deverá entrar com dois
        // números quaisquer e a operação que deseja realizar: '+' soma; ' - ' subtração; ' * ' multiplicação e ' / '
        // divisão. Lembre-se das condições para realizar a divisão (condicional aninhada).

        double number1, number2, result, OK;
        Scanner keyboard = new Scanner(System.in);
        String operation;

        result = 0;
        OK = 1;
        operation = "";

        System.out.println("Digite o primeiro numero: ");
        number1 = keyboard.nextDouble();

        System.out.println("Qual operação você deseja (Digite: + ou - ou * ou /)? ");
        // Remove espaços, se houverem, antes ou depois da inserção do usuário
        operation = keyboard.next().trim();

        System.out.println("Digite o segundo numero: ");
        number2 = keyboard.nextDouble();

        switch (operation) {
            case "+":
                result = number1 + number2;
                break;

            case "-":
                result = number1 - number2;
                break;

            case "*":
                result = number1 * number2;
                break;

            case "/":
                result = number1 / number2;
                break;

            default:
                System.out.println("Informe um operador válido!");
                OK = 0;
                break;
        }

        // Só imprime o resultado se a condição do switch default não for atendida
        if (OK == 1) System.out.printf("O resultado da operação é %.4f", result);
    }
}
