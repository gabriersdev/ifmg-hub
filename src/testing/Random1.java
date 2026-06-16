package testing;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 0;

        while (true) {
            // #
            if (random.nextInt(1, (99 + 1)) == 99) {
                System.out.println("CHEGOU em 100");
                break;
            }

            // #
            else System.out.println("Iteração: " + i + ". Ainda não chegou em 99.");

            i++;
        }
    }
}
