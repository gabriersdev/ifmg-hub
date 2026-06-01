package exercise08;

public class Gabriel11 {
    public static void main(String[] args) {
        /*
         * 11. Desenvolva um programa que identifique, armazene em um vetor e mostre os 10 primeiros números primos a partir de 100. O algoritmo fica muito mais eficiente utilizando o crivo de Eratóstenes.
         * Como desafio, implemente o algoritmo utilizando a "forma tradicional" e depois utilizando o crivo de Eratóstenes, compute os tempos de ambas implementações e verifique a diferença entre os mesmos.
         */
        int count, num, i, j, maxLimit;
        long startTimeTradicional, endTimeTradicional, startTimeCrivo, endTimeCrivo;
        boolean isPrime;
        int[] primesTradicional, primesCrivo;
        boolean[] crivo;

        count = 0;
        num = 100;
        primesTradicional = new int[10];
        
        startTimeTradicional = System.nanoTime();
        
        while (count < 10) {
            isPrime = true;
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primesTradicional[count] = num;
                count++;
            }
            num++;
        }
        
        endTimeTradicional = System.nanoTime();
        
        maxLimit = 200;
        crivo = new boolean[maxLimit + 1];
        primesCrivo = new int[10];
        count = 0;
        
        startTimeCrivo = System.nanoTime();
        
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
        
        for (i = 100; i <= maxLimit; i++) {
            if (crivo[i] && count < 10) {
                primesCrivo[count] = i;
                count++;
            }
        }
        
        endTimeCrivo = System.nanoTime();
        
        System.out.println("Primos (Tradicional):");
        for (i = 0; i < 10; i++) {
            System.out.print(primesTradicional[i] + " ");
        }
        System.out.println("\nTempo Tradicional (ns): " + (endTimeTradicional - startTimeTradicional));
        
        System.out.println("Primos (Crivo):");
        for (i = 0; i < 10; i++) {
            System.out.print(primesCrivo[i] + " ");
        }
        System.out.println("\nTempo Crivo (ns): " + (endTimeCrivo - startTimeCrivo));
    }
}
