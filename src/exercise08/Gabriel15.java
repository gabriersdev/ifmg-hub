package exercise08;

import java.util.Scanner;

public class Gabriel15 {
    public static void main(String[] args) {
        /*
         * 15. Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os códigos de dez contas e seus respectivos saldos.
         * Os códigos devem ser armazenados em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de números reais.
         * O saldo deverá ser cadastrado na mesma posição do código.
         * Por exemplo, se a conta 504 foi armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta posição do vetor de saldos.
         * Depois de fazer uma leitura dos valores, deverá aparecer o seguinte menu na tela:
         * Menu de Operações
         * 1. Efetuar depósito
         * 2. Efetuar saque
         * 3. Consultar saldo em conta
         * 4. Finalizar o programa
         * - Para efetuar o depósito, deve-se solicitar o código da conta e o valor a ser depositado. Se a conta não estiver cadastrada, deverá aparecer a mensagem "Conta não encontrada!" e voltar ao menu. Se a conta existir, atualizar seu saldo;
         * - Para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver cadastrada, deverá aparecer a mensagem "Conta não encontrada!" e voltar ao menu. Se a conta existir, verificar se o seu saldo é suficiente para cobrir o saque. (Suponha que a conta não possa ficar com saldo negativo). Se o saldo for suficiente, realizar o saque e voltar ao menu. Caso contrário, mostrar a mensagem "Saldo insuficiente!" e voltar ao menu.
         * - Para consultar saldo em conta, deve-se solicitar o código da conta a ser pesquisada. Se a conta não estiver cadastrada, deverá aparecer a mensagem "Conta não encontrada!"; senão, mostrar a conta com seu respectivo saldo e voltar ao menu;
         * - O programa termina quando for digitada a opção 4 - Finalizar o programa.
         */

        int i, option, count, codeInput, indexFound;
        double valueInput;
        boolean isDuplicate;
        int[] codes;
        double[] balances;
        Scanner scanner;

        scanner = new Scanner(System.in);
        codes = new int[10];
        balances = new double[10];
        count = 0;

        System.out.println("Cadastro de 10 contas bancarias");

        while (count < 10) {
            System.out.print("Digite o codigo da conta " + (count + 1) + ": ");
            codeInput = scanner.nextInt();

            isDuplicate = false;

            for (i = 0; i < count; i++) {
                if (codes[i] == codeInput) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) System.out.println("Codigo ja cadastrado! Tente outro.");

            else {
                codes[count] = codeInput;
                System.out.print("Digite o saldo da conta " + (count + 1) + ": ");
                balances[count] = scanner.nextDouble();
                count++;
            }
        }

        option = 0;

        while (option != 4) {
            System.out.println("\nMenu de Operacoes");
            System.out.println("1. Efetuar deposito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar saldo em conta");
            System.out.println("4. Finalizar o programa");
            System.out.print("Escolha uma opcao: ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Digite o codigo da conta para deposito: ");
                codeInput = scanner.nextInt();
                indexFound = -1;

                for (i = 0; i < 10; i++) {
                    if (codes[i] == codeInput) {
                        indexFound = i;
                        break;
                    }
                }

                if (indexFound == -1) System.out.println("Conta nao encontrada!");
                else {
                    System.out.print("Digite o valor do deposito: ");
                    valueInput = scanner.nextDouble();
                    balances[indexFound] += valueInput;
                    System.out.println("Deposito efetuado com sucesso!");
                }
            }

            //
            else if (option == 2) {
                System.out.print("Digite o codigo da conta para saque: ");
                codeInput = scanner.nextInt();
                indexFound = -1;

                for (i = 0; i < 10; i++) {
                    if (codes[i] == codeInput) {
                        indexFound = i;
                        break;
                    }
                }

                if (indexFound == -1) System.out.println("Conta nao encontrada!");
                else {
                    System.out.print("Digite o valor do saque: ");
                    valueInput = scanner.nextDouble();
                    if (balances[indexFound] >= valueInput) {
                        balances[indexFound] -= valueInput;
                        System.out.println("Saque efetuado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                }

            } else if (option == 3) {
                System.out.print("Digite o codigo da conta para consulta: ");
                codeInput = scanner.nextInt();
                indexFound = -1;

                for (i = 0; i < 10; i++) {
                    if (codes[i] == codeInput) {
                        indexFound = i;
                        break;
                    }
                }

                if (indexFound == -1) System.out.println("Conta nao encontrada!");
                else System.out.printf("Conta: %d | Saldo: %.2f\n", codes[indexFound], balances[indexFound]);
            }

            //
            else if (option == 4) System.out.println("Programa finalizado.");
            else System.out.println("Opcao invalida!");
        }

        scanner.close();
    }
}