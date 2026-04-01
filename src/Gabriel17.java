import java.util.Scanner;

public class Gabriel17 {
    public static void main(String[] args) {
        // Faça um programa que receba de entrada um número real, encontre e mostre:
        // a. A parte inteira desse número;
        // b. A parte fracionária desse número

        double realNumber, floatingPointPart;
        int integerPart;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um número real: ");
        realNumber = keyboard.nextDouble();

        integerPart = (int) realNumber;
        floatingPointPart = realNumber - integerPart;

        System.out.printf("A parte inteira de %.4f é %d e a parte decimal é %.4f.", realNumber, integerPart, floatingPointPart);
    }
}
