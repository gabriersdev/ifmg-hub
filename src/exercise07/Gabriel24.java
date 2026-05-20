package exercise07;

import java.util.Scanner;

public class Gabriel24 {
    public static void main(String[] args) {
        /*
         * 24.Suponha que JAVA possua somente as operações de soma e subtração. Dados dois números inteiros
         * positivos A e B, determine o quociente e o resto da divisão de A por B.
         */

        int numberA, numberB, continueExec, quotient, remainder;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Calculo da divisão");

            System.out.print("Informe o número A (dividendo): ");
            numberA = keyboard.nextInt();

            System.out.print("Informe o número B (divisor): ");
            numberB = keyboard.nextInt();

            if (numberB == 0) System.out.println("O divisor não pode ser zero.");

                //
            else {
                quotient = 0;
                remainder = numberA;

                while (remainder >= numberB) {
                    remainder = remainder - numberB;
                    quotient = quotient + 1;
                }

                System.out.println("Quociente: " + quotient);
                System.out.println("Resto: " + remainder);
            }

            System.out.print("Digite 1 para continuar: ");
            continueExec = keyboard.nextInt();

            if (continueExec != 1) break;
        }

        keyboard.close();
    }
}
