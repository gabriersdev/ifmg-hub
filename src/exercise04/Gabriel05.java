package exercise04;

import java.util.Scanner;

public class Gabriel05 {
    public static void main(String[] args) {
        // Faça um programa que recebe de entrada três valores. Verificar se esses valores podem formar um
        // triângulo. Caso não, informar que não forma um triângulo; caso sim, imprima que tipo de triângulo é
        // formado (escaleno, isósceles ou equilátero).

        Scanner keyboard = new Scanner(System.in);
        double side1, side2, side3;
        boolean isValidTriangle;

        System.out.print("Informe o valor de um lado do triângulo: ");
        side1 = keyboard.nextDouble();

        System.out.print("Informe o valor de outro lado do triângulo: ");
        side2 = keyboard.nextDouble();

        System.out.print("Informe o valor do último lado do triângulo: ");
        side3 = keyboard.nextDouble();

        isValidTriangle = (side1 < side2 + side3) && 
                          (side2 < side1 + side3) && 
                          (side3 < side1 + side2);

        System.out.println();

        if (isValidTriangle) {
            if (side1 == side2 && side1 == side3) {
                System.out.println("De acordo com os valores informados, o triângulo é do tipo EQUILÁTERO.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("De acordo com os valores informados, o triângulo é do tipo ISÓSCELES.");
            } else {
                System.out.println("De acordo com os valores informados, o triângulo é do tipo ESCALENO.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        keyboard.close();
    }
}
