import java.nio.DoubleBuffer;
import java.util.Scanner;

public class Gabriel22 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia dois valores numéricos e armazene nas variáveis A e B, após isso, efetue a
        // troca dos valores de forma que A passe a possuir o valor de B e B passe a possuir o valor de A. Imprima os
        // valores após troca.

        double varA, varB;

        Scanner keyboard = new Scanner(System.in);

        // TODO - corrigir o problema de endereçamento de memória
        System.out.println("Informe um valor para a varíavel A: ");
        varA = keyboard.nextDouble();

        System.out.println("Informe um valor para a varíavel B: ");
        varB = keyboard.nextDouble();

        // TODO - verificar uso de método clone ou utilitário para clonagem de objetos instanciados
        varB = varA;
        varA = varB;

        System.out.println();
        System.out.printf("Agora o valor de A é %.4f e o de B %.4f", varA, varB);
    }
}
