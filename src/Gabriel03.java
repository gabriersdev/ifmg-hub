import java.util.Scanner;

public class Gabriel03 {
    public static void main(String[] args) {
        // Implemente um algoritmo que receba 3 números reais de entrada.
        // Calcule e mostre o resultado da multiplicação dos dois primeiros números dividido pelo terceiro número fornecido pelo usuário.
        // Sabe-seque o denominador não pode ser zero, mas neste momento não se preocupe com as validações.
        int number1, number2, number3;
        double result;

        System.out.println(":: Cálculo do resultado da multiplicação de 2 números dividido pelo terceiro número ::");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe o 1º número: ");
        number1 = keyboard.nextInt();

        System.out.println("Informe o 2º número: ");
        number2 = keyboard.nextInt();

        System.out.println("Informe o 3º número: ");
        number3 = keyboard.nextInt();

        result = (double) (number1 * number2) / number3;

        System.out.printf("O resultado o cálculo é: %f.", result);
    }
}
