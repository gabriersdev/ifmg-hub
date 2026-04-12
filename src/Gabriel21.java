import java.util.Scanner;

public class Gabriel21 {
    public static void main(String[] args) {
        // Faça um programa que receba a medida do ângulo formado por uma escada apoiada e a altura da parede.
        // Calcule e mostre a medida da escada para que a ponta da parede possa ser alcançada.

        double ladderAngle, wallHeight, ladderLength, angleInRadians;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Qual o ângulo que a escada se encontra? ");
        ladderAngle = keyboard.nextDouble();

        System.out.println("Qual a altura da parede? ");
        wallHeight = keyboard.nextDouble();

        angleInRadians = Math.toRadians(ladderAngle);
        ladderLength = wallHeight / Math.sin(angleInRadians);

        System.out.println();
        System.out.printf("O tamanho da escada é de %.4f metros\n", ladderLength);
        keyboard.close();
    }
}