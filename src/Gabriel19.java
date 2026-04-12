import java.util.Scanner;

public class Gabriel19 {
    public static void main(String[] args) {
        // Implemente m programa que receba um número positivo, calcule e mostre:
        // - O número digitado elevado ao quadrado;
        // - O número digitado elevado ao cubo;
        // - A raiz quadrada do número;
        // - A raiz cúbica do número.

        double number, numberPow2, numberPow3, numberSQRT, numberCBRT;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um número: ");
        number = keyboard.nextDouble();
        keyboard.close();

        numberPow2 = Math.pow(number, 2);
        numberPow3 = Math.pow(number, 3);

        numberSQRT = Math.sqrt(number);
        numberCBRT = Math.cbrt(number);

        System.out.println();
        System.out.printf("Esse número elevado ao quadrado é %.2f.", numberPow2);
        System.out.println();

        System.out.printf("Esse número elevado ao cubo é %.2f.", numberPow3);
        System.out.println();

        System.out.printf("A raiz quadrada desse número é %.2f.", numberSQRT);
        System.out.println();

        System.out.printf("A raiz cúbica desse número é %.2f.", numberCBRT);
        System.out.println();
    }
}
