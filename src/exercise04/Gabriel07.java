package exercise04;

import java.util.Scanner;

public class Gabriel07 {
    public static void main(String[] args) {
        // Implemente um algoritmo que receba de entrada um valor inteiro com 4 dígitos e verifique se o mesmo
        // pertence à família dos binários. Para isto, “desmembre” o número digitado verifique se foram digitados
        // somente bits. Caso seja binário, mostre o equivalente em decimal.

        double accNumberConversed;
        String numberString;
        // Trabalhando com array para usar split no número
        String[] numberStringArray;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um número inteiro com 4 dígitos: ");
        numberString = keyboard.next();
        numberStringArray = numberString.split("");

        // Verificando se é binário e válido
        if (
                numberStringArray.length == 4 &&
                (numberStringArray[0].equals("1") || numberStringArray[0].equals("0")) &&
                (numberStringArray[1].equals("1") || numberStringArray[1].equals("0")) &&
                (numberStringArray[2].equals("1") || numberStringArray[2].equals("0")) &&
                (numberStringArray[3].equals("1") || numberStringArray[3].equals("0"))
        ) {
            // Como o número terá sempre 4 casas decimais, trabalhando com a conversão de bin para dec sem iteração
            // SEMPRE necessário converter para INT quando se trata de Math.pow, que retorna DOUBLE
            accNumberConversed = Integer.parseInt(numberStringArray[3]);
            accNumberConversed += Integer.parseInt(numberStringArray[2]) * Math.pow(2, 1);
            accNumberConversed += Integer.parseInt(numberStringArray[1]) * Math.pow(2, 2);
            accNumberConversed += Integer.parseInt(numberStringArray[0]) * Math.pow(2, 3);

            System.out.println();
            System.out.printf("O número digitado em binário, é, em decimal: %.0f", accNumberConversed);
        }

        else {
            System.out.println("O número informado não é binário e/ou não tem 4 dígitos.");
        }

        keyboard.close();
    }
}
