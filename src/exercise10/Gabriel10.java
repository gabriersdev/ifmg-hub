package exercise10;

import java.util.Scanner;

public class Gabriel10 {
    public static void main(String[] args) {
        // 10. Considere n cidades numeradas de 0 a n-1 que estão interligadas por uma série de estradas de mão única. As ligações entre as cidades são representadas pelos elementos de uma matriz quadrada L_nxn cujos elementos l_ij assumem o valor 1 ou 0, conforme exista ou não estrada direta que saia da cidade i e chegue à cidade j. Assim, os elementos da linha i indicam as estradas que saem da cidade i, e os elementos da coluna j indicam as estradas que chegam à cidade j. Por convenção l_ii = 1. A figura abaixo um exemplo para n = 4.
        // L = ( 1 1 1 0
        //       0 1 1 0
        //       1 0 1 1
        //       0 0 1 1 )
        // [Nota de transcrição: A imagem da página 5 representa graficamente este sistema de estradas como um círculo de 5 vértices numerados de 0 a 4 interconectados por setas direcionadas. As conexões orientadas que partem de cada vértice são: O vértice 0 aponta para 1 e 2; O vértice 1 aponta para 2 e 3; O vértice 2 aponta para 3 e 4; O vértice 3 aponta para 4 e 0; O vértice 4 aponta para 0 e 1.]
        // a) Dada uma cidade k, determine quantas estradas saem de k e quantas cidades chegam à k.
        // b) Qual das cidades possuem maior número de estradas chegando?
        // c) Encontre, se existirem, as cidades isoladas. Ou seja, aquelas em que não chegam nem saem estradas.
        // d) Dada uma determinada rota de m cidades, representada por um vetor de inteiros cujos valores estão entre 0 e n-1, tal como exercício anterior, verifique se é possível realizar tal rota.
        // No exemplo anterior, a rota (m=5) 2 3 2 1 0 é impossível; já a rota (m=6) 0 1 2 3 2 0 é possível.
        int countCities, cityK, routeSize, maxIncomingCount = -1, maxIncomingCity = -1, currentIncomingCount = 0, currentOutgoingCount = 0;
        int[][] roadMatrix;
        int[] route;
        boolean isRouteValid, isFirstIsolated;
        Scanner scanner = new Scanner(System.in);

        countCities = scanner.nextInt();
        roadMatrix = new int[countCities][countCities];

        for (int i = 0; i < countCities; i++) {
            for (int j = 0; j < countCities; j++) {
                System.out.println("Informe o valor para a posição [" + (i + 1) + "][" + (j + 1) + "] da matriz: ");
                roadMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Informe a cidade k: ");
        cityK = scanner.nextInt();

        for (int i = 0; i < countCities; i++) {
            if (i != cityK && roadMatrix[cityK][i] == 1) currentOutgoingCount++;
            if (i != cityK && roadMatrix[i][cityK] == 1) currentIncomingCount++;
        }

        System.out.println("a) Estradas saindo de " + cityK + ": " + currentOutgoingCount + ". Estradas chegando em " + cityK + ": " + currentIncomingCount);

        for (int i = 0; i < countCities; i++) {
            currentIncomingCount = 0;
            for (int j = 0; j < countCities; j++) if (i != j && roadMatrix[j][i] == 1) currentIncomingCount++;

            if (currentIncomingCount > maxIncomingCount) {
                maxIncomingCount = currentIncomingCount;
                maxIncomingCity = i;
            }
        }

        System.out.println("b) Cidade com maior numero de estradas chegando: " + maxIncomingCity);

        System.out.print("c) Cidades isoladas: ");
        isFirstIsolated = true;

        for (int i = 0; i < countCities; i++) {
            currentIncomingCount = 0;
            currentOutgoingCount = 0;

            for (int j = 0; j < countCities; j++) {
                if (i != j && roadMatrix[i][j] == 1) currentOutgoingCount++;
                if (i != j && roadMatrix[j][i] == 1) currentIncomingCount++;
            }

            if (currentIncomingCount == 0 && currentOutgoingCount == 0) {
                if (!isFirstIsolated) System.out.print(", ");
                System.out.print(i);
                isFirstIsolated = false;
            }
        }

        if (isFirstIsolated) System.out.print("Nenhuma");
        System.out.println();

        System.out.println("Informe o tamanho da rota: ");
        routeSize = scanner.nextInt();
        route = new int[routeSize];

        for (int i = 0; i < routeSize; i++) {
            System.out.println("Informe a cidade " + (i + 1) + " da rota: ");
            route[i] = scanner.nextInt();
        }

        isRouteValid = true;

        for (int i = 0; i < routeSize - 1; i++) {
            if (roadMatrix[route[i]][route[i + 1]] == 0) {
                isRouteValid = false;
                break;
            }
        }

        if (isRouteValid) System.out.println("d) A rota e possivel.");
        else System.out.println("d) A rota e impossivel.");
    }
}
