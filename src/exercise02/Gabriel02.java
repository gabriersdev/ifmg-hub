package exercise02;

import java.util.Scanner;

public class Gabriel02 {
    public static void main(String[] args) {
        // Ler um número inteiro e imprimir o seu sucessor e seu antecessor.
        int number, ant, suc;
        Scanner keyboard = new Scanner(System.in);

        System.out.println(":: Antecessor e sucessor de um número ::");
        System.out.println("Informe um número: ");
        number = keyboard.nextInt();

        ant = number - 1;
        suc = number + 1;

        System.out.printf("O antecessor de %d é %d.", number, ant);
        System.out.println();
        System.out.printf("O sucessor de %d é %d.", number, suc);
        keyboard.close();
    }
}
