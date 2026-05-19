package exercise07;

import java.util.Scanner;

public class Gabriel18 {
    public static void main(String[] args) {
        /*
         * 18. Construa um algoritmo para calcular a média de valores PARES e ÍMPARES, que serão digitados pelo
         * usuário. Ao final, o algoritmo deve mostrar estas duas médias bem como o maior número PAR e o menor
         * número ÍMPAR digitado. O algoritmo finaliza quando o usuário digitar um valor negativo.
         */

        double evenAVG, pairAVG;
        int currentNumber = 1, minNumber = Integer.MAX_VALUE, maxNumber = Integer.MIN_VALUE, evenSUM = 0, pairSUM = 0, evenCount = 0, pairCount = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Cálculo de média de PARES e ÍMPARES");

        while (currentNumber > 0) {
            System.out.println("Informe um número: ");
            currentNumber = keyboard.nextInt();

            if (currentNumber <= 0) continue;

            if (currentNumber % 2 == 0) {
                pairSUM += currentNumber;
                pairCount += 1;

                if (currentNumber > maxNumber) maxNumber = currentNumber;
            }

            //
            else {
                evenSUM += currentNumber;
                evenCount += 1;
                if (currentNumber < minNumber) minNumber = currentNumber;
            }
        }

        if (evenCount > 0) {
            evenAVG = (double) evenSUM / evenCount;
            System.out.printf("%nA média dos números ÍMPARES informados é de %.2f.%n", evenAVG);
            System.out.printf("O MENOR número ÍMPAR é %d%n", minNumber);
        }

        if (pairCount > 0) {
            pairAVG = (double) pairSUM / pairCount;
            System.out.printf("%nA média dos números PARES informados é de %.2f.%n", pairAVG);
            System.out.printf("O MAIOR número PAR é %d%n", maxNumber);
        }
    }
}
