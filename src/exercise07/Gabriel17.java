package exercise07;

import java.util.Scanner;

public class Gabriel17 {
    public static void main(String[] args) {
        /*
         * 17. Faça um algoritmo que simule o funcionamento de uma calculadora que contenha as operações
         * aritméticas básicas com dois números digitados pelo usuário. O programa implementado deve mostrar
         * seguinte menu ao usuário. Não se esqueça de verificar se as operações podem ser realizadas.
         */

        // Operações:
        // 1 - Soma
        // 2 - Subtração
        // 3 - Multiplicação
        // 4 - Divisão
        // 5 - Sair
        // 6 - Continuar calculando

        int operation = 6;
        double number1, number2, result, continueCalc = 1;
        String resultOutput = "";
        Scanner input = new Scanner(System.in);

        while (operation != 5 && continueCalc == 1) {
            // MENU
            System.out.println("MENU");

            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            System.out.println("Escolha uma opção: ");
            operation = input.nextInt();

            // OK. Digitou um número válido para calcular
            if (operation >= 1 && operation <= 4) {

                System.out.println("Informe o 1º número: ");
                number1 = input.nextDouble();

                System.out.println("Informe o 2º número: ");
                number2 = input.nextDouble();

                // Verifica se a operação selecionada é a de divisão (4) e se o divisor é ZERO
                if (operation == 4 && number2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                    System.out.println("Retornando ao MENU...");
                    continue;
                }

                // Se não for divisão por ZERO, então calcula
                else {
                    switch (operation) {
                        case 1:
                            result = number1 + number2;
                            resultOutput = number1 + " + " + number2 + " = " + result;
                            break;

                        case 2:
                            result = number1 - number2;
                            resultOutput = number1 + " - " + number2 + " = " + result;
                            break;

                        case 3:
                            result = number1 * number2;
                            resultOutput = number1 + " * " + number2 + " = " + result;
                            break;

                        case 4:
                            result = number1 / number2;
                            resultOutput = number1 + " / " + number2 + " = " + result;
                            break;
                    }

                    System.out.printf("%nO resultado da operação é:%n%s%n%n", resultOutput);

                    while (true) {
                        System.out.println("Digite 6 para um novo cálculo ou 0 para SAIR:");
                        operation = input.nextInt();

                        if (operation == 6) break;
                        else if (operation == 0) {
                            continueCalc = 0;
                            break;
                        }
                    }
                }
            }

            // Saída
            else if (operation == 5) {
                break;
            }
        }

        System.out.println("Calculadora finalizada.");
    }
}
