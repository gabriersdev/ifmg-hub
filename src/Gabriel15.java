import java.util.Scanner;

public class Gabriel15 {
    public static void main(String[] args) {
        // Faça um algoritmo que calcule a área de uma circunferência, recebendo o valor do raio. Obs.: Defina PI
        // como constante de valor 3.1416.
        final double pi;
        double circumferenceArea, ray;

        pi = 3.1416;

        System.out.println(":: Cálculo da área da circunferência ::");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe o valor do raio desse círculo: ");
        ray = keyboard.nextDouble();

        circumferenceArea = pi * Math.pow(ray, 2);
        System.out.println();
        System.out.printf("A área da circunferência é %f.", circumferenceArea);
    }
}
