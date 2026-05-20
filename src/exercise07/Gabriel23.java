package exercise07;

import java.util.Scanner;

public class Gabriel23 {
    public static void main(String[] args) {
        /*
         * 23. Implementar um algoritmo para calcular o sen(X). Sabe-se que o valor de X deverá ser fornecido pelo
         * usuário em graus, mas a sequência funciona com o valor em radianos. O valor do seno de X será
         * calculado pela soma dos 15 primeiros termos da série a seguir:
         *
         * sen(x) = x - x³/3! + x⁵/5! - x⁷/7! + ...
         */

        double xDegrees, xRadians, senX, term;
        int i, j;
        long factorial;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X em graus: ");
        xDegrees = scanner.nextDouble();

        // Converte de graus para radianos
        xRadians = Math.toRadians(xDegrees);
        senX = 0;

        for (i = 0; i < 15; i++) {
            int exponent = 2 * i + 1;
            term = Math.pow(xRadians, exponent);

            factorial = 1;
            for (j = 1; j <= exponent; j++) factorial *= j;

            term = term / factorial;

            if (i % 2 != 0) senX -= term;
            else senX += term;
        }

        System.out.println("O seno de " + xDegrees + " é: " + senX);
        scanner.close();
    }
}
