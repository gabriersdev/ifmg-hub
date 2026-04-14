package exercise04;

import java.util.Scanner;

public class Gabriel05 {
    public static void main(String[] args) {
        // Faça um programa que recebe de entrada três valores. Verificar se esses valores podem formar um
        // triângulo. Caso não, informar que não forma um triângulo; caso sim, imprima que tipo de triângulo é
        // formado (escaleno, isósceles ou equilátero).

        // Um triângulo só é possível de ser montado se um lado for menor que a soma dos outros dois

        Scanner keyboard = new Scanner(System.in);
        boolean side1IsValid, side2IsValid, side3IsValid;
        double side1, side2, side3;
        // triangleType usada como variável de controle. Os valores correspondentes: 1 = equilátero, 2 = isóceles, 3 = escaleno, 0 = não é possível ser um triângulo
        int triangleType = 0;

        System.out.println("Informe o valor de um lado do triângulo: ");
        side1 = keyboard.nextDouble();

        System.out.println("Informe o valor de outro lado do triângulo: ");
        side2 = keyboard.nextDouble();

        System.out.println("Informe o valor do último lado do triângulo: ");
        side3 = keyboard.nextDouble();

        side1IsValid = side1 < (side2 + side3);
        side2IsValid = side2 < (side1 + side3);
        side3IsValid = side3 < (side1 + side2);

        if (side1IsValid && side2IsValid && side3IsValid) {
            // Equilátero ocorre quando TODOS os lados tem o mesmo tamanho
            if (side1 == side2 && side1 == side3) triangleType = 1;

            // Isóceles quando tem DOIS lados com o mesmo tamanho
            else if (side1 == side2 || side1 == side3 || side2 == side3) triangleType = 2;

            // Para nenhum desses 2 casos, será escaleno, quando todos os 3 lados tem medidas diferentes
            else triangleType = 3;
        }

        System.out.println();

        switch (triangleType) {
            case 1:
                System.out.printf("De acordo com os valores informados, o triângulo é do tipo EQUILÁTERO.");
                break;

            case 2:
                System.out.printf("De acordo com os valores informados, o triângulo é do tipo ISÓCELES.");
                break;

            case 3:
                System.out.printf("De acordo com os valores informados, o triângulo é do tipo ESCALENO.");
                break;

            default:
                System.out.println("Os valores informados não formam um triângulo.");
                break;
        }

        keyboard.close();
    }
}
