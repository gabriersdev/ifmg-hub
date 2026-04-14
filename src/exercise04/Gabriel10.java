package exercise04;

import java.util.Scanner;

public class Gabriel10 {
    public static void main(String[] args) {
        // Faça um programa que recebe de entrada o código de um produto e a quantidade comprada do mesmo.
        // Calcule e mostre:
        // a) O preço unitário do produto, segundo Tabela I
        // b) Preço total da nota
        // c) O valor do desconto, segundo Tabela II, aplicado sobre o valor total da nota
        // d) Preço final ao consumidor após desconto
        // e) Não se esqueça de verificar a existência do produto

        int code, quantity;
        double priceItemsRange1, priceItemsRange2, priceItemsRange3, priceItemsRange4;
        double percentageDiscountMax250, percentageDiscountMax500, percentageDiscountMore500, totalNote = 0, total = 0;
        Scanner keyboard = new Scanner(System.in);

        priceItemsRange1 = 10;
        priceItemsRange2 = 20;
        priceItemsRange3 = 30;
        priceItemsRange4 = 40;

        percentageDiscountMax250 = 0.05;
        percentageDiscountMax500 = 0.1;
        percentageDiscountMore500 = 0.15;

        System.out.println("Informe o código do produto: ");
        code = keyboard.nextInt();

        System.out.println("Informe a quantidade de itens: ");
        quantity = keyboard.nextInt();

        if (code >= 1 && code <= 10) totalNote = quantity * priceItemsRange1;
        else if (code <= 20) totalNote = quantity * priceItemsRange2;
        else if (code <= 30) totalNote = quantity * priceItemsRange3;
        else if (code <= 40) totalNote = quantity * priceItemsRange4;

        if (totalNote <= 250) totalNote = totalNote * (1 - percentageDiscountMax250);
        else if (totalNote <= 500) totalNote = totalNote * (1 - percentageDiscountMax500);
        else totalNote = totalNote * (1 - percentageDiscountMore500);

        System.out.println();
        System.out.printf("Total à pagar: R$ %.2f", totalNote);
    }
}
