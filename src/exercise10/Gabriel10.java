package exercise10;

import java.util.Arrays;

public class Gabriel10 {

    public static void main(String[] args) {
        // TODO - fazer
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

        int countCities = 10;
        int[][] matrix = new int[10][10], matrix2 = new int[10][10];

        int[] citiesEntrances = new int[countCities];
        int[] citiesExists = new int[countCities];
        int[] citiesEntrancesC = new int[countCities];
        int[] citiesEntrancesCReversed = new int[countCities];

        int[] citiesWithMoreEntrances3 = new int[countCities];
        int[] citiesWithMoreEntrances3Order = new int[countCities];

        // TODO - rever!
        // Ordena

        // TODO - testar
        citiesEntrancesC = citiesEntrances.clone();
        Arrays.sort(citiesEntrancesC);

        // Inverte o vetor inteiro
        // Eu não entendi nada disso...
        for (int i = 0, j = countCities - 1; i < countCities; i++, j--) {
            citiesEntrancesCReversed[j] = citiesEntrancesC[i];
            citiesWithMoreEntrances3Order[i] = j;
            citiesWithMoreEntrances3[i] = citiesEntrancesC[i];
        }
    }
}
