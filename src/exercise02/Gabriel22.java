package exercise02;

import java.util.Scanner;

public class Gabriel22 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia dois valores numéricos e armazene nas variáveis A e B, após isso, efetue a
        // troca dos valores de forma que A passe a possuir o valor de B e B passe a possuir o valor de A. Imprima os
        // valores após troca.

        double varA, varB, temp;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um valor para a variável A: ");
        varA = keyboard.nextDouble();

        System.out.println("Informe um valor para a variável B: ");
        varB = keyboard.nextDouble();

        // Trocando os valores
        // "temp" necessário para trocar os valores, senão acaba ficando tudo com o mesmo valor
        temp = varA;
        varA = varB;
        varB = temp;

        System.out.println();
        System.out.printf("Agora o valor de A é %.4f e o de B %.4f", varA, varB);
        keyboard.close();
    }
}