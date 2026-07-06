package exercise10;

import java.util.Arrays;
import java.util.Scanner;

public class Gabriel18 {
    public static void main(String[] args) {
        // 18. A brincadeira da Pedra, Papel e Tesoura, muita gente conhece. Mas dá para fazer uma mais legal com cinco opções e não só três! Dois jogadores, dario e xerxes, jogam uma partida com N rodadas. Em cada rodada os jogadores escolhem uma "mão" entre cinco opções, que vamos representar aqui com os números 0, 1, 2, 3 e 4. A figura define exatamente quem ganha a rodada. Por exemplo, se dario escolheu 0 e xerxes escolheu 3, então xerxes ganha a rodada, pois existe uma seta na figura indo de 3 para 0.
        // Depois de N rodadas, o vencedor da partida é o jogador que ganhou mais rodadas. O número N será sempre ímpar, para não haver empate na partida. Vamos também considerar que os jogadores nunca escolhem a mesma mão numa rodada, para não haver empate na rodada. Você deve escrever um programa que determine quem venceu a partida, se foi dario ou xerxes.
        // ENTRADA: primeira linha da entrada contém um inteiro N, o número de rodadas na partida. Cada uma das N linhas seguintes contém dois inteiros De X, representando a mão que os jogadores dario e xerxes, respectivamente, jogaram em uma rodada.
        // SAÍDA: Seu programa deve imprimir uma linha contendo o nome do jogador que venceu a partida: dario ou xerxes. Todas as letras devem ser minúsculas, sem nenhum acento!
        // EXEMPLOS
        // Entrada   Saída
        // 3         dario
        // 4 2
        // 0 2
        // 3 1
        // 
        // Entrada   Saída
        // 1         xerxes
        // 3 1

        int rounds, player1CurrentValue = -1, player2CurrentValue = -1, player1WinCount = 0, player2WinCount = 0;
        Scanner scanner = new Scanner(System.in);

        // Tem os apontamentos: {X para Y}
        String matrixCord = "{0, 1},{0, 2},{1, 2},{1, 3},{2, 3},{2, 4},{3, 4},{3, 0},{4, 0},{4, 1}";

        System.out.println("Informe a quantidade de rodadas para jogar: ");
        rounds = scanner.nextInt();

        int[] winnerPerRound = new int[rounds];

        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.println("Dário, informe um valor: ");
                    player1CurrentValue = scanner.nextInt();
                }

                //
                else {
                    System.out.println("Xerxes, informe um valor: ");
                    player2CurrentValue = scanner.nextInt();
                }
            }

            if (matrixCord.contains("{" + player1CurrentValue + ", " + player2CurrentValue + "}")) winnerPerRound[i] = 1;
            else if (matrixCord.contains("{" + player2CurrentValue + ", " + player1CurrentValue + "}")) winnerPerRound[i] = 2;
            else winnerPerRound[i] = 0;
        }

        System.out.println(Arrays.toString(winnerPerRound));

        for (int j : winnerPerRound) {
            if (j == 1) player1WinCount++;
            else if (j == 2) player2WinCount++;
            else {
                player1WinCount++;
                player2WinCount++;
            }
        }

        if (player1WinCount > player2WinCount) System.out.println("dario");
        else System.out.println("xerxes");
    }
}
