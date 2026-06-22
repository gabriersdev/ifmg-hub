package exercise10;

import java.util.Scanner;

public class Gabriel14 {
    public static void main(String[] args) {
        // 14. Uma floricultura conhecedora de sua clientela gostaria de fazer um algoritmo que pudesse controlar sempre um estoque mínimo de determinadas plantas, pois todos os dias, pela manhã, o dono faz novas aquisições. Crie um algoritmo que possua as seguintes opções:
        // 
        // FLORICULTURA MARIASFLOR
        // 1. CADASTRAR NOVA PLANTA
        // 2. RETIRAR PLANTA
        // 3. INSERIR PLANTA
        // 4. IMPRIMIR RELATÓRIO
        // 5. SAIR
        // 
        // O algoritmo deve permitir o cadastro de 50 tipos de plantas. Na opção de cadastro, para cada planta, o algoritmo deve cadastrar um código (inteiro), o nome (string), o estoque ideal e a quantidade atual em estoque. Na opção retirar planta, o sistema deve permitir a retirada do estoque atual de uma planta, dado o código digitado pelo usuário, lembre-se de verificar se o estoque é suficiente para atender o pedido. Para a opção de inserção, seu algoritmo deve atualizar o estoque atual de uma certa planta, dadas as informações de quantidade comprada e do código da planta que são digitadas pelo usuário. Na opção de imprimir relatório, seu algoritmo deve imprimir os nomes, os estoques atuais e as quantidades a serem compradas das plantas que possuem estoque abaixo do ideal.

        Scanner scanner = new Scanner(System.in);
        int maxPlants = 50, option = 0, plantCount = 0, code, amount, index, i, amountToBuy;
        int[] codes = new int[maxPlants], idealStocks = new int[maxPlants], currentStocks = new int[maxPlants];
        String[] names = new String[maxPlants];

        while (option != 5) {
            System.out.println("\nFLORICULTURA");
            System.out.println("1. CADASTRAR NOVA PLANTA");
            System.out.println("2. RETIRAR PLANTA");
            System.out.println("3. INSERIR PLANTA");
            System.out.println("4. IMPRIMIR RELATÓRIO");
            System.out.println("5. SAIR");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();

            if (option == 1) {
                if (plantCount >= maxPlants) System.out.println("Limite de plantas (" + maxPlants + ") atingido.");

                else {
                    System.out.print("Código (inteiro): ");
                    codes[plantCount] = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    names[plantCount] = scanner.nextLine();

                    System.out.print("Estoque ideal: ");
                    idealStocks[plantCount] = scanner.nextInt();

                    System.out.print("Estoque atual: ");
                    currentStocks[plantCount] = scanner.nextInt();

                    plantCount++;
                }
            }

            //
            else if (option == 2) {
                System.out.print("Código da planta: ");
                code = scanner.nextInt();
                index = getIndex(codes, plantCount, code);

                if (index == -1) System.out.println("Planta não encontrada.");

                else {
                    System.out.print("Quantidade a retirar: ");
                    amount = scanner.nextInt();

                    if (amount > currentStocks[index]) System.out.println("Estoque insuficiente para a operação.");

                    else {
                        currentStocks[index] -= amount;
                        System.out.println("Planta retirada com sucesso.");
                    }
                }
            }

            //
            else if (option == 3) {
                System.out.print("Código da planta: ");
                code = scanner.nextInt();
                index = getIndex(codes, plantCount, code);

                if (index == -1) System.out.println("Planta não encontrada.");
                else {
                    System.out.print("Quantidade comprada: ");
                    amount = scanner.nextInt();
                    currentStocks[index] += amount;
                    System.out.println("Estoque atualizado.");
                }
            }

            //
            else if (option == 4) {
                System.out.println();
                System.out.println("Relatório de plantas: ");
                for (i = 0; i < plantCount; i++) {
                    if (currentStocks[i] < idealStocks[i]) {
                        amountToBuy = idealStocks[i] - currentStocks[i];
                        System.out.printf("Planta: %s | Estoque atual: %d | Comprar: %d%n", names[i], currentStocks[i], amountToBuy);
                    }
                }
            }
        }

        scanner.close();
    }

    private static int getIndex(int[] array, int size, int target) {
        int i;
        for (i = 0; i < size; i++) if (array[i] == target) return i;
        return -1;
    }
}
