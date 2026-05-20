package exercise07;

import java.util.Scanner;

public class Gabriel24 {
    public static void main(String[] args) {
        /*
         * 24.Suponha que JAVA possua somente as operações de soma e subtração. Dados dois números inteiros
         * positivos A e B, determine o quociente e o resto da divisão de A por B.
         */

        int numberA, numberB;
        Scanner keyboard = new Scanner(System.in);

        numberA = keyboard.nextInt();
        numberB = keyboard.nextInt();

        System.out.println("Quociente: " + (numberA / numberB));
        System.out.println("Resto: " + (numberA % numberB));
    }
}
