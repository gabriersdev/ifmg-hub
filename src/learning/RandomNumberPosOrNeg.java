package learning;

import java.util.Random;

public class RandomNumberPosOrNeg {
    public static void main(String[] args) {

        Random random = new Random();
        int a;

        // Aqui sorteia um número, ou é 1 ou é 0
        if (random.nextInt(2) == 1) {
            // Vai sortear positivo
            a = random.nextInt(100 + 1);
            System.out.println(a);
        } else {
            // Vai sortear negativo
            a = random.nextInt(100 + 1) * -1;
            System.out.println(a);
        }
    }
}
