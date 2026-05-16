package exercise07;

import java.util.Scanner;

public class Gabriel27 {
    public static void main(String[] args) {
        /*
         * 27. Escreva um programa em JAVA que imprima o triângulo abaixo, em que a altura do triângulo (número de
         * linhas) é fornecido pelo usuário.
         */
        String hashtagSign = "#";
        Scanner keyboard = new Scanner(System.in);
        int i, numberOfLines;

        while (true) {
            System.out.println("Informe a quantidade de linhas que você deseja no triângulo: ");
            numberOfLines = keyboard.nextInt();

            if (keyboard.hasNextLine()) {
                if (numberOfLines < 1) {
                    System.out.println("O número não pode ser negativo nem zero");
                    continue;
                }

                for (i = 0; i < numberOfLines; i += 1) {
                    System.out.println(hashtagSign);
                    hashtagSign = hashtagSign.concat("#");
                }
                break;
            }

            //
            else System.out.println("Informe apenas números inteiros");
        }
    }
}
