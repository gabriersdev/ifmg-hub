package exercise07;

import java.util.Scanner;

public class Gabriel13 {
    public static void main(String[] args) {
        /*
         * 13. Faça um algoritmo para identificar se um determinado número fornecido pelo usuário é primo ou não.
         * Lembrando que um número primo só é divisível por 1 e por ele mesmo. Exemplos: 2, 5, 7, etc.
         */

        int n, i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificação de número PRIMO");

        while (true) {
            System.out.println("Informe um número: ");

            if (scanner.hasNextInt()) {
                n = scanner.nextInt();

                // For que só roda uma vez para fazer as verificações e retornar as informações
                for (int forControl = 0; true; forControl += 1) {
                    // Verifica se é negativo, 0 ou 1
                    if (n <= 1) {
                        System.out.println("NÃO é PRIMO");
                        break;
                    }

                    // Verifica os casos específicos de 2 e 3
                    if (n == 2 || n == 3) {
                        System.out.println("É PRIMO");
                        break;
                    }

                    // Verifica se é par ou se a divisão por 3 não tem resto
                    if (n % 2 == 0 || n % 3 == 0) {
                        System.out.println("NÃO é PRIMO");
                        break;
                    }

                    // Verifica se, para algum dos números entre 5 e N seja possível dividir
                    for (i = 5; i * i <= n; i = i + 6) {
                        if (n % i == 0 || n % (i + 2) == 0) {
                            System.out.println("NÃO é PRIMO");
                            break;
                        }
                    }

                    System.out.printf("%d o número É PRIMO", n);
                    break;
                }

                break;
            }
        }

        scanner.close();
    }
}
