import java.util.Scanner;

public class Gabriel09 {
    public static void main(String[] args) {
        // Implemente um algoritmo que receba o número de lados de um polígono convexo regular, calcule e mostre
        // o número de diagonais desse polígono. Sabe-se que ND = N*(N – 3)/2, em que N representa o número de
        // lados do polígono.

        int countSide, diagonalsCount;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe o número de lados do polígono");
        countSide = keyboard.nextInt();

        diagonalsCount = (countSide * (countSide - 3)) / 2;
        System.out.printf("A quantidade de diagonais do polígono com %d lados é %d", countSide, diagonalsCount);
    }
}
