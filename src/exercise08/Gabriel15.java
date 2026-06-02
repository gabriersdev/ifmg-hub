package exercise08;

import java.util.Scanner;

public class Gabriel15 {
    public static void main(String[] args) {
        /* 15. Faça um programa que simule um controle bancário. Devem ser lidos os códigos de dez contas e seus respectivos saldos.
        Os códigos devem ser armazenados em um vetor de inteiros (não pode haver mais de uma conta com o mesmo código) e os saldos em um vetor de reais.
        O saldo deverá ser cadastrado na mesma posição do código. Depois da leitura, deverá aparecer o menu de operações:
        1. Efetuar depósito  2. Efetuar saque  3. Consultar saldo em conta  4. Finalizar o programa
        - Depósito: solicita código e valor; se a conta não existir, mostra "Conta não encontrada!" e volta ao menu; se existir, atualiza o saldo.
        - Saque: solicita código e valor; conta inexistente mostra "Conta não encontrada!"; se o saldo for suficiente, efetua o saque; senão mostra "Saldo insuficiente!".
        - Consulta: solicita o código; conta inexistente mostra "Conta não encontrada!"; senão mostra a conta e seu saldo.
        - O programa termina quando for digitada a opção 4. */

        int i, option, count, code, index;
        double amount;
        boolean isDuplicate;
        int[] codes;
        double[] balances;
        Scanner scanner = new Scanner(System.in);

        codes = new int[10];
        balances = new double[10];
        count = 0;
        option = 0;

        System.out.println("Cadastro de 10 contas bancárias");

        while (count < 10) {
            System.out.print("Digite o código da conta " + (count + 1) + ": ");
            code = scanner.nextInt();

            isDuplicate = false;
            for (i = 0; i < count; i++) {
                if (codes[i] == code) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                System.out.println("Código já cadastrado! Tente outro.");
                continue;
            }

            codes[count] = code;
            System.out.print("Digite o saldo da conta " + (count + 1) + ": ");
            balances[count] = scanner.nextDouble();
            count++;
        }

        while (option != 4) {
            System.out.println("\nMenu de Operações");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar saldo em conta");
            System.out.println("4. SAIR do programa");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Digite o código da conta para depósito: ");
                code = scanner.nextInt();
                index = -1;

                for (i = 0; i < 10; i++) {
                    if (codes[i] == code) {
                        index = i;
                        break;
                    }
                }

                if (index == -1) {
                    System.out.println("Conta não encontrada!");
                    continue;
                }

                System.out.print("Digite o valor do depósito: ");
                amount = scanner.nextDouble();
                balances[index] += amount;
                System.out.println("Depósito efetuado com sucesso!");
                continue;
            }

            if (option == 2) {
                System.out.print("Digite o código da conta para saque: ");
                code = scanner.nextInt();
                index = -1;

                for (i = 0; i < 10; i++) {
                    if (codes[i] == code) {
                        index = i;
                        break;
                    }
                }

                if (index == -1) {
                    System.out.println("Conta não encontrada!");
                    continue;
                }

                System.out.print("Digite o valor do saque: ");
                amount = scanner.nextDouble();

                if (balances[index] >= amount) {
                    balances[index] -= amount;
                    System.out.println("Saque efetuado com sucesso!");
                    continue;
                }

                System.out.println("Saldo insuficiente!");
                continue;
            }

            if (option == 3) {
                System.out.print("Digite o código da conta para consulta: ");
                code = scanner.nextInt();
                index = -1;

                for (i = 0; i < 10; i++) {
                    if (codes[i] == code) {
                        index = i;
                        break;
                    }
                }

                if (index == -1) {
                    System.out.println("Conta não encontrada!");
                    continue;
                }

                System.out.printf("Conta: %d | Saldo: %.2f%n", codes[index], balances[index]);
                continue;
            }

            if (option == 4) {
                System.out.println("Programa finalizado.");
                continue;
            }

            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
