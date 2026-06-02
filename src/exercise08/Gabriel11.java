package exercise08;

public class Gabriel11 {
    public static void main(String[] args) {
        /* 11. Desenvolva um programa que identifique, armazene em um vetor e mostre os 10 primeiros números primos a partir de 100.
        O algoritmo fica muito mais eficiente utilizando o crivo de Eratóstenes.
        Como desafio, implemente o algoritmo utilizando a "forma tradicional" e depois utilizando o crivo de Eratóstenes,
        compute os tempos de ambas implementações e verifique a diferença entre os mesmos. */

        int contadorDePrimos, numeroAtual, i, j, limiteMaximo;
        long inicioTempoTradicional, fimTempoTradicional, inicioTempoCrivo, fimTempoCrivo;
        boolean ehPrimo;
        int[] primosMetodoTradicional, primosMetodoCrivo;
        boolean[] crivoDeEratostenes;

        contadorDePrimos = 0;
        numeroAtual = 100;
        limiteMaximo = 200; // Limite superior para encontrar os primos, pode ser ajustado
        primosMetodoTradicional = new int[10];
        primosMetodoCrivo = new int[10];
        crivoDeEratostenes = new boolean[limiteMaximo + 1];

        // --- Método Tradicional ---
        inicioTempoTradicional = System.nanoTime();
        while (contadorDePrimos < 10) {
            ehPrimo = true;
            if (numeroAtual <= 1) {
                ehPrimo = false;
            } else {
                for (i = 2; i <= Math.sqrt(numeroAtual); i++) {
                    if (numeroAtual % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }
            if (ehPrimo) {
                primosMetodoTradicional[contadorDePrimos] = numeroAtual;
                contadorDePrimos++;
            }
            numeroAtual++;
        }
        fimTempoTradicional = System.nanoTime();

        // --- Crivo de Eratóstenes ---
        inicioTempoCrivo = System.nanoTime();
        for (i = 2; i <= limiteMaximo; i++) {
            crivoDeEratostenes[i] = true;
        }
        for (i = 2; i * i <= limiteMaximo; i++) {
            if (crivoDeEratostenes[i]) {
                for (j = i * i; j <= limiteMaximo; j += i) {
                    crivoDeEratostenes[j] = false;
                }
            }
        }
        contadorDePrimos = 0;
        for (i = 100; i <= limiteMaximo && contadorDePrimos < 10; i++) {
            if (crivoDeEratostenes[i]) {
                primosMetodoCrivo[contadorDePrimos] = i;
                contadorDePrimos++;
            }
        }
        fimTempoCrivo = System.nanoTime();

        // --- Exibição dos Resultados ---
        System.out.print("Primos (Método Tradicional): ");
        for (i = 0; i < 10; i++) {
            System.out.print(primosMetodoTradicional[i] + " ");
        }
        System.out.printf("%nTempo (Método Tradicional): %d ns%n", fimTempoTradicional - inicioTempoTradicional);

        System.out.print("Primos (Crivo de Eratóstenes): ");
        for (i = 0; i < 10; i++) {
            System.out.print(primosMetodoCrivo[i] + " ");
        }
        System.out.printf("%nTempo (Crivo de Eratóstenes): %d ns%n", fimTempoCrivo - inicioTempoCrivo);
    }
}
