package exercise03;

import java.util.Scanner;

public class Gabriel07 {
    public static void main(String[] args) {
        // Na cidade de Sabará, para transferências de veículos, a SABATRAN cobra uma taxa de 1% para carros
        // fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa está
        // incidindo sobre o valor de tabela do carro. Implemente um algoritmo que lê o ano de fabricação e o preço
        // do carro e a seguir calcula e imprime imposto a ser pago.

        double carPrice, percentageTax, tax;
        int releaseYear;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Qual o preço do carro em R$? ");
        carPrice = keyboard.nextDouble();

        System.out.println("Em que ano o carro foi fabricado? ");
        releaseYear = keyboard.nextInt();

        if (releaseYear < 1990) percentageTax = 0.01;
        else percentageTax = 0.015;

        tax = carPrice * percentageTax;

        System.out.println();
        System.out.printf("O valor do imposto a ser pago é de R$ %.4f.", tax);
        keyboard.close();
    }
}
