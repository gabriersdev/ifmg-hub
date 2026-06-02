package exercise07;

public class Gabriel25 {
    public static void main(String[] args) {
        /*
         * 25. Escrever um algoritmo que gera e escreve os 5 primeiros números perfeitos. Um número perfeito é aquele
         * que é igual a soma dos seus divisores. (Ex.: 6 = 1+2+3; 28= 1+2+4+7+14 etc).
         */

        int quantityPNumbers = 5, quantityPNFound = 0;
        int number = 1, sum, i;

        System.out.println("Os 5 primeiros números perfeitos são:");

        while (quantityPNFound < quantityPNumbers) {
            sum = 0;
            
            // Otimização: só precisamos verificar os divisores até a metade do número
            for (i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number) {
                System.out.println(number);
                quantityPNFound++;
            }
            
            number++;
        }
    }
}
