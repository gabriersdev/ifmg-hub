package exercise10;

import java.util.Scanner;

public class Gabriel19 {
    public static void main(String[] args) {
        // 19. Harry ganhou um mapa mágico no qual ele pode visualizar o trajeto realizado por seus amigos. Ele agora precisa de sua colaboração para, com a ajuda do mapa, determinar onde Hermione se encontra. O mapa tem L linhas e C colunas de caracteres, que podem ser '.' (ponto), a letra 'o' (minúscula) ou a letra 'H' (maiúscula). A posição inicial de Hermione no mapa é indicada pela letra 'o', que aparece exatamente uma vez no mapa. A letra 'H' indica uma posição em que Hermione pode ter passado o mapa é impreciso, e nem toda letra 'H' no mapa representa realmente uma posição pela qual Hermione passou. Mas todas as posições pelas quais Hermione passou são representadas pela letra 'H' no mapa. A partir da posição inicial de Hermione, Harry sabe determinar a posição atual de sua amiga, apesar da imprecisão do mapa, porque eles combinaram que Hermione somente se moveria de forma que seu movimento apareceria no mapa como estritamente horizontal ou estritamente vertical (nunca diagonal). Além disso, Hermione combinou que não se moveria de forma a deixar que Harry tivesse dúvidas sobre seu caminho (por exemplo, Hermione não passa duas vezes pela mesma posição). Considere o mapa abaixo, com 6 linhas e 7 colunas:
        // A posição inicial de Hermione no mapa é (5,3), e sua posição atual é (4,6). As posições marcadas em negrito ('H') são erros no mapa. Dado um mapa e a posição inicial de Hermione, você deve escrever um programa para determinar a posição atual de Hermione.
        // ENTRADA A primeira linha contém dois números inteiros L e C, indicando respectivamente o número de linhas e o número de colunas. Cada uma das seguintes L linhas contém C caracteres.
        // SAÍDA Seu programa deve produzir uma única linha na saída, contendo dois números inteiros: o número da linha e o número da coluna da posição atual de Hermione.
        // EXEMPLOS
        // Entrada   Saída
        // 3 4       1 4
        // HHHH
        // H...
        // o.HH
        // 
        // Entrada   Saída
        // 6 7       4 6
        // ...HHH.
        // HHH.H..
        // H.HHH..
        // H...HH.
        // H.o....
        // HHH.HH.

        int l, c, hermioneCordX = -1, hermioneCordY = -1, breakAll = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de Linhas: ");
        l = scanner.nextInt();

        System.out.println("Informe a quantidade de Colunas: ");
        c = scanner.nextInt();

        String[][] matrix = new String[l][c];

        // Preenche a matriz
        for (int i = 0; i < l; i++) {
            String line = scanner.next();
            for (int j = 0; j < c; j++) matrix[i][j] = String.valueOf(line.charAt(j));
        }

        // Verifica a posição de Hermione real (o)
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j].equals("o")) {
                    hermioneCordX = i;
                    hermioneCordY = j;
                    breakAll = 1;
                    break;
                }
            }

            // Sim, isso faz sentido para quebrar o loop externo.
            if (breakAll == 1) break;
        }

        // Percorre o caminho de Hermione
        while (true) {
            // Marca por onde já se sabe ou se acha que ela passou
            matrix[hermioneCordX][hermioneCordY] = ".";

            if (hermioneCordX > 0 && matrix[hermioneCordX - 1][hermioneCordY].equals("H")) hermioneCordX--;
            else if (hermioneCordX < l - 1 && matrix[hermioneCordX + 1][hermioneCordY].equals("H")) hermioneCordX++;
            else if (hermioneCordY > 0 && matrix[hermioneCordX][hermioneCordY - 1].equals("H")) hermioneCordY--;
            else if (hermioneCordY < c - 1 && matrix[hermioneCordX][hermioneCordY + 1].equals("H")) hermioneCordY++;
            else break; // Fim do caminho
        }

        System.out.println((hermioneCordX + 1) + " " + (hermioneCordY + 1));
    }
}
