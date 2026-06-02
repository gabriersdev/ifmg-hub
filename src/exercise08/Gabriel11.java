package exercise08;

public class Gabriel11 {
    public static void main(String[] args) {
        /* 11. Desenvolva um programa que identifique, armazene em um vetor e mostre os 10 primeiros números primos a partir de 100.
        O algoritmo fica muito mais eficiente utilizando o crivo de Eratóstenes.
        Como desafio, implemente o algoritmo utilizando a "forma tradicional" e depois utilizando o crivo de Eratóstenes,
        compute os tempos de ambas implementações e verifique a diferença entre os mesmos. */

        int primeCounter, currentNumber, i, j, upperLimit;
        long traditionalMethodStartTime, traditionalMethodEndTime, sieveMethodStartTime, sieveMethodEndTime;
        boolean isPrime;
        int[] traditionalMethodPrimes, sieveMethodPrimes;
        boolean[] sieveOfEratosthenes;

        primeCounter = 0;
        currentNumber = 100;
        upperLimit = 200; // Limite superior para encontrar os primos, pode ser ajustado
        traditionalMethodPrimes = new int[10];
        sieveMethodPrimes = new int[10];
        sieveOfEratosthenes = new boolean[upperLimit + 1];

        // Método Tradicional
        traditionalMethodStartTime = System.nanoTime();
        while (primeCounter < 10) {
            isPrime = true;
            if (currentNumber <= 1) isPrime = false;

            else {
                for (i = 2; i <= Math.sqrt(currentNumber); i++) {
                    if (currentNumber % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                traditionalMethodPrimes[primeCounter] = currentNumber;
                primeCounter++;
            }

            currentNumber++;
        }

        traditionalMethodEndTime = System.nanoTime();

        // Crivo de Eratóstenes
        sieveMethodStartTime = System.nanoTime();
        for (i = 2; i <= upperLimit; i++) sieveOfEratosthenes[i] = true;

        for (i = 2; i * i <= upperLimit; i++) {
            if (sieveOfEratosthenes[i]) {
                for (j = i * i; j <= upperLimit; j += i) sieveOfEratosthenes[j] = false;
            }
        }

        primeCounter = 0;

        for (i = 100; i <= upperLimit && primeCounter < 10; i++) {
            if (sieveOfEratosthenes[i]) {
                sieveMethodPrimes[primeCounter] = i;
                primeCounter++;
            }
        }

        sieveMethodEndTime = System.nanoTime();

        // Exibição dos Resultados
        System.out.print("Primos do método tradicional: ");
        for (i = 0; i < 10; i++) System.out.print(traditionalMethodPrimes[i] + " ");
        System.out.printf("%nTempo do método tradicional: %d ns%n", traditionalMethodEndTime - traditionalMethodStartTime);

        System.out.print("Primos no crivo de eratóstenes: ");
        for (i = 0; i < 10; i++) System.out.print(sieveMethodPrimes[i] + " ");
        System.out.printf("%nTempo do crivo de eratóstenes): %d ns%n", sieveMethodEndTime - sieveMethodStartTime);
    }
}
