package exercise07;

import java.util.Scanner;

public class Gabriel24 {
    public static void main(String[] args) {
        /*
         * 24.Suponha que JAVA possua somente as operações de soma e subtração. Dados dois números inteiros
         * positivos A e B, determine o quociente e o resto da divisão de A por B.
         */

        // TODO - corrigir

        int numberA, numberB, continueExec;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Calcular");

            System.out.println("Informe o número A: ");
            numberA = keyboard.nextInt();

            System.out.println("Informe o número B: ");
            numberB = keyboard.nextInt();

            System.out.println("Quociente: " + (numberA / numberB));
            System.out.println("Resto: " + (numberA % numberB));

            System.out.println("Digite 1 para continuar: ");
            continueExec = keyboard.nextInt();

            if (continueExec == 1) continue;
            else break;
        }
    }
}
