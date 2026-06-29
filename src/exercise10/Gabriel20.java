package exercise10;

import java.util.Random;
import java.util.Scanner;

public class Gabriel20 {
    public static void main(String[] args) {
        // 20. Joãozinho está aprendendo sobre matrizes. Hoje ele aprendeu como deixar matrizes na forma escada, e está exercitando. Para ajudá-lo, você deve escrever um programa que determine se o resultado dele realmente está no formato correto. Uma matriz está na forma escada quando, para cada linha, as condições a seguir forem satisfeitas: Se a linha só possuir zeros, então todas as linhas abaixo desta também só possuem zeros. Caso contrário, seja X o elemento diferente de zero mais à esquerda da linha; então, para todas as linhas abaixo da linha de X, todos os elementos nas colunas à esquerda de X e na coluna de X são iguais a zero.
        // ENTRADA: A primeira linha possui dois inteiros N e M, as dimensões da matriz. Cada uma das N linhas seguintes contém M inteiros não-negativos, os elementos da matriz.
        // SAÍDA: Seu programa deve produzir uma única linha, contendo o caractere 'S' caso a matriz esteja no formato escada, ou 'N', caso contrário.
        // EXEMPLOS
        // Entrada
        // 4 6
        // 1 2 9 9 9 9
        // 0 0 3 9 9 9
        // 0 0 0 0 5 9
        // 0 0 0 0 0 6
        // Saída
        // S
        // 
        // Entrada
        // 5 8
        // 0 5 1 0 3 2 2 0
        // 0 0 0 0 4 0 1 2
        // 0 0 0 0 0 0 3 2
        // 0 0 0 0 0 0 0 0
        // 0 0 0 0 0 0 0 0
        // Saída
        // S
        // 
        // Entrada
        // 5 5
        // 1 1 2 3 4
        // 0 1 1 4 5
        // 0 1 2 3 6
        // 0 0 0 2 0
        // 0 0 0 0 0
        // Saída
        // N
        // 
        // Entrada
        // 5 5
        // 1 1 2 3 4
        // 0 1 1 4 5
        // 0 1 2 3 6
        // 0 0 0 2 0
        // 0 0 0 0 0
        // Saída
        // N

        int valueM, valueN, staircaseMatrix = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Informe a quantidade de colunas para a matriz:");
        valueM = scanner.nextInt();

        System.out.println("Informe a quantidade de linhas para a matriz:");
        valueN = scanner.nextInt();

        if (valueN <= 0 && valueM <= 0) {
            System.out.println("Não é possível trabalhar com números negativos para formar a matriz, por favor execute novamente.");
            return;
        }

        int[][] matrix = new int[valueN][valueM];

        // Preenche a matriz com valores randômicos
        for (int i = 0; i < valueN; i++) for (int j = 0; j < valueM; j++)  matrix[i][j] = random.nextInt(0, 10);

        // Verifica a escadinha
        // Uma matriz está na forma escada quando, para cada linha, as condições a seguir
        // forem satisfeitas:
        // - Se a linha só possuir zeros, então todas as linhas abaixo desta também só possuem zeros.
        // - Caso contrário, seja X o elemento diferente de zero mais à esquerda da linha; então, para todas as
        // linhas abaixo da linha de X, todos os elementos nas colunas à esquerda de X e na coluna de X são
        // iguais a zero.

        // TODO - aplicar restante da lógica fazendo um favor

        System.out.println("Saída: ");
        if (staircaseMatrix == 1) System.out.println("S");
        else System.out.println("N");
    }
}
