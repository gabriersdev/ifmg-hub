package exercise08;

public class Gabriel11 {
    public static void main(String[] args) {
        /* 11. Desenvolva um programa que identifique, armazene em um vetor e mostre os 10 primeiros números primos a partir de 100.
        O algoritmo fica muito mais eficiente utilizando o crivo de Eratóstenes.
        Como desafio, implemente o algoritmo utilizando a "forma tradicional" e depois utilizando o crivo de Eratóstenes,
        compute os tempos de ambas implementações e verifique a diferença entre os mesmos. */

        int count, num, i, j, maxLimit;
        long inicioTradicional, fimTradicional, inicioCrivo, fimCrivo;
        boolean isPrimo;
        int[] primosTradicional, primosCrivo;
        boolean[] crivo;

        count = 0;
        num = 100;
        maxLimit = 200;
        primosTradicional = new int[10];
        primosCrivo = new int[10];
        crivo = new boolean[maxLimit + 1];

        inicioTradicional = System.nanoTime();
        while (count < 10) {
            isPrimo = true;
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                primosTradicional[count] = num;
                count++;
            }
            num++;
        }
        fimTradicional = System.nanoTime();

        inicioCrivo = System.nanoTime();
        for (i = 2; i <= maxLimit; i++) {
            crivo[i] = true;
        }
        for (i = 2; i * i <= maxLimit; i++) {
            if (crivo[i]) {
                for (j = i * i; j <= maxLimit; j += i) {
                    crivo[j] = false;
                }
            }
        }
        count = 0;
        for (i = 100; i <= maxLimit && count < 10; i++) {
            if (crivo[i]) {
                primosCrivo[count] = i;
                count++;
            }
        }
        fimCrivo = System.nanoTime();

        System.out.print("Primos (Tradicional): ");
        for (i = 0; i < 10; i++) {
            System.out.print(primosTradicional[i] + " ");
        }
        System.out.printf("%nTempo Tradicional (ns): %d%n", fimTradicional - inicioTradicional);

        System.out.print("Primos (Crivo): ");
        for (i = 0; i < 10; i++) {
            System.out.print(primosCrivo[i] + " ");
        }
        System.out.printf("%nTempo Crivo (ns): %d%n", fimCrivo - inicioCrivo);
    }
}
