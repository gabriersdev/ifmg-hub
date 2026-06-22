package exercise10;

import java.util.Arrays;
import java.util.Scanner;

public class Gabriel13 {
    public static boolean verifyIfExistsAccommodations(int[][] matrix) {
        boolean exists = false;

        for (int[] ints : matrix) {
            for (int anInt : ints)
                if (anInt == 0) {
                    exists = true;
                    break;
                }
        }

        return exists;
    }

    public static void main(String[] args) {
        // 13. Uma empresa de possui ônibus com 48 lugares (24 nas janelas e 24 no corredor). Faça um programa que utilize uma matriz para controlar as poltronas ocupadas no corredor e janela. Considere que 0 representa poltrona desocupada e 1, poltrona ocupada. Inicialmente, todas as poltronas estarão livres. Depois disso, o programa deverá apresentar as seguintes opções:
        // 
        // MARIAS UNIDAS
        // 1. Vender passagem
        // 2. Mostrar mapa de ocupação do ônibus
        // 3. Encerrar
        // 
        // - Quando a opção escolhida for o número '1', deve-se verificar se o ônibus ainda possui poltronas a serem vendidas. Caso haja poltrona vazia, deve ser perguntado ao usuário qual poltrona o mesmo deseja ocupar. O programa deverá, então dar uma das seguintes mensagens: 1) Venda efetivada se a poltrona solicitada estiver livre, marcando-a como ocupada; 2) Poltrona ocupada se a poltrona solicitada não estiver disponível para venda.
        // - Quando a opção escolhida for o número '2', deverá ser mostrada uma listagem separando as poltronas da janela e corredor, o número da poltrona e se está livre ou ocupada.
        // - Quando for escolhida a opção o número '3', a execução do programa deverá ser finalizada.

        int l = 24, c = 2, optionInf, whileCondition = 1, lineSelected, colSelected;
        int[][] matrix = new int[l][c];
        Scanner scanner = new Scanner(System.in);

        while (whileCondition == 1) {
            System.out.println("Menu");
            System.out.println("1. Vender passagem");
            System.out.println("2. Mostrar mapa de ocupação do ônibus");
            System.out.println("3. Encerrar");
            System.out.println("Selecione uma opção: ");

            optionInf = scanner.nextInt();

            switch (optionInf) {
                case 1:
                    if (verifyIfExistsAccommodations(matrix)) {
                        // Faz demais verificações
                        System.out.println("Informe qual a linha da poltrona você deseja ocupar (0 à " + (l - 1) + "): ");
                        lineSelected = scanner.nextInt();

                        if (lineSelected < 0 || lineSelected >= l) {
                            System.out.println("Não é possível trabalhar com valores negativos ou fora do range.");
                            continue;
                        }

                        System.out.println("Informe qual a coluna da poltrona você deseja ocupar (0 para a da janela | 1 para a do corredor): ");
                        colSelected = scanner.nextInt();

                        if (colSelected < 0 || colSelected >= c) {
                            System.out.println("Não é possível trabalhar com valores negativos ou fora do range.");
                            continue;
                        }

                        if (matrix[lineSelected][colSelected] == 0) {
                            System.out.println("Venda efetivada!");
                            matrix[lineSelected][colSelected] = 1;
                        } else
                            System.out.println("A poltrona selecionada já está ocupada! Comece o processo novamente.");

                    } else System.out.println("Sem lugares disponíveis no momento.");
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Poltronas da Janela | Poltronas do Corredor");
                    System.out.println(
                            Arrays.deepToString(matrix)
                                    .replace("], ", "],\n")
                                    .replace("0", "Disponível")
                                    .replace("1", "Ocupada")
                    );
                    System.out.println();
                    break;

                case 3:
                default:
                    whileCondition = 0;
                    break;
            }

            if (whileCondition != 1) break;
        }
    }

}
