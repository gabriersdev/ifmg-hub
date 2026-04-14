package exercise04;

import java.util.Scanner;

public class Gabriel03 {
    public static void main(String[] args) {
        // Elabore um programa que calcule e exiba a tensão S de uma barra cilíndrica de diâmetro D
        // submetida a uma carga Q. Os valores de D e Q devem ser fornecidos pelo usuário do programa via
        // teclado. Utilize a fórmula: s = ((4 * Q)/(pi * D²) * n)
        // onde, n = 2 para D > 100; n = 6 para D < 50 e; n = 4 para outros valores de D.

        int valueN;
        double tensionS, diameterD, cargoQ, pi;
        Scanner keyboard = new Scanner(System.in);
        
        pi = 3.14;
        valueN = 4;

        System.out.println("Informe o diâmetro da barra: ");
        diameterD = keyboard.nextDouble();

        System.out.println("Informe a carga que a barra está submetida: ");
        cargoQ = keyboard.nextDouble();
        
        if (diameterD > 100) valueN = 2;
        else if (diameterD < 50) valueN = 6;
        
        tensionS = ((4 * cargoQ)/(pi * Math.pow(diameterD, 2)) * valueN);
        System.out.printf("A tensão em que a barra está submetida é de %.4f", tensionS);
        keyboard.close();
    }
}
