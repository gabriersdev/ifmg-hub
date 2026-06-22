package exercise10;

import java.util.Scanner;

public class Gabriel15 {
    public static void main(String[] args) {
        // 15. Uma rede social de amizades pode ser representada por uma matriz quadrada (mesmo número de linhas e colunas) de dimensão número de pessoas da rede social. A amizade entre as pessoas presentes nessa rede se dá da seguinte forma: suponha que n0, n1, n2... representa uma pessoa e, caso duas pessoas sejam amigas, então a posição da matriz será 1, caso contrário será 0 (zero). Considere a matriz de exemplo abaixo:
        // 
        // id  n0  n1  n2  n3  n4
        // n0  0   1   1   0   1
        // n1  1   0   0   1   0
        // n2  1   0   0   0   0
        // n3  0   1   0   0   1
        // n4  1   0   0   1   0
        // 
        // Essa matriz representa uma rede social entre 5 pessoas: n0, n1, n2, n3 e n4. Além disso, quando a posição (i, j) da matriz é 1, então as pessoas ni e nj são amigas entre si. Caso a posição (i, j) da matriz é 0, então ni e nj não são amigas. Observe que a pessoa n0 é amiga das pessoas n1, n2 e n4, mas não é amiga da pessoa n3. Importante: a relação de amizade é simétrica: se ni é amigo de nj, então nj é, necessariamente, amigo de ni. Além disso, em redes sociais de amizade, não existe amizade da pessoa com ela mesma. Sabendo disso, implemente um algoritmo que:
        // a) preencha a matriz de amizades de uma rede social contendo 5 pessoas;
        // b) calcule e imprima a quantidade de amigos que cada pessoa possui.

        Scanner scanner = new Scanner(System.in);
        int networkSize = 5, i, j, friendCount;
        int[][] friendships = new int[networkSize][networkSize];

        System.out.println("Preencha a matriz de amizades (0 para nao, 1 para sim):");
        for (i = 0; i < networkSize; i++) {
            for (j = i + 1; j < networkSize; j++) {
                System.out.printf("A pessoa n%d e amiga da pessoa n%d? (1/0): ", i, j);
                friendships[i][j] = scanner.nextInt();
                friendships[j][i] = friendships[i][j];
            }
        }

        System.out.println("\nQuantidade de amigos por pessoa:");
        for (i = 0; i < networkSize; i++) {
            friendCount = countFriends(friendships[i]);
            System.out.printf("Pessoa n%d possui %d amigo(s).%n", i, friendCount);
        }

        scanner.close();
    }

    private static int countFriends(int[] personFriendships) {
        int count = 0, i;
        for (i = 0; i < personFriendships.length; i++) if (personFriendships[i] == 1) count++;
        return count;
    }
}
