package exercise08;

import java.util.Scanner;

public class Gabriel15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* 15. Faça um programa que simule um controle bancário. Devem ser lidos os códigos de dez contas e seus respectivos saldos.
        Os códigos devem ser armazenados em um vetor de inteiros (não pode haver mais de uma conta com o mesmo código) e os saldos em um vetor de reais.
        O saldo deverá ser cadastrado na mesma posição do código. Depois da leitura, deverá aparecer o menu de operações:
        1. Efetuar depósito  2. Efetuar saque  3. Consultar saldo em conta  4. Finalizar o programa
        - Depósito: solicita código e valor; se a conta não existir, mostra "Conta não encontrada!" e volta ao menu; se existir, atualiza o saldo.
        - Saque: solicita código e valor; conta inexistente mostra "Conta não encontrada!"; se o saldo for suficiente, efetua o saque; senão mostra "Saldo insuficiente!".
        - Consulta: solicita o código; conta inexistente mostra "Conta não encontrada!"; senão mostra a conta e seu saldo.
        - O programa termina quando for digitada a opção 4. */

        int i, opcao, count, codigo, indice;
        double valor;
        boolean duplicado;
        int[] codigos;
        double[] saldos;

        codigos = new int[10];
        saldos = new double[10];
        count = 0;

        System.out.println("Cadastro de 10 contas bancárias");
        while (count < 10) {
            System.out.print("Digite o código da conta " + (count + 1) + ": ");
            codigo = in.nextInt();

            duplicado = false;
            for (i = 0; i < count; i++) {
                if (codigos[i] == codigo) {
                    duplicado = true;
                    break;
                }
            }

            if (duplicado) {
                System.out.println("Código já cadastrado! Tente outro.");
                continue;
            }

            codigos[count] = codigo;
            System.out.print("Digite o saldo da conta " + (count + 1) + ": ");
            saldos[count] = in.nextDouble();
            count++;
        }

        opcao = 0;
        while (opcao != 4) {
            System.out.println("\nMenu de Operações");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar saldo em conta");
            System.out.println("4. Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o código da conta para depósito: ");
                codigo = in.nextInt();
                indice = -1;
                for (i = 0; i < 10; i++) {
                    if (codigos[i] == codigo) {
                        indice = i;
                        break;
                    }
                }

                if (indice == -1) System.out.println("Conta não encontrada!");
                else {
                    System.out.print("Digite o valor do depósito: ");
                    valor = in.nextDouble();
                    saldos[indice] += valor;
                    System.out.println("Depósito efetuado com sucesso!");
                }
            } else if (opcao == 2) {
                System.out.print("Digite o código da conta para saque: ");
                codigo = in.nextInt();
                indice = -1;
                for (i = 0; i < 10; i++) {
                    if (codigos[i] == codigo) {
                        indice = i;
                        break;
                    }
                }

                if (indice == -1) System.out.println("Conta não encontrada!");
                else {
                    System.out.print("Digite o valor do saque: ");
                    valor = in.nextDouble();
                    if (saldos[indice] >= valor) {
                        saldos[indice] -= valor;
                        System.out.println("Saque efetuado com sucesso!");
                    } else System.out.println("Saldo insuficiente!");
                }
            } else if (opcao == 3) {
                System.out.print("Digite o código da conta para consulta: ");
                codigo = in.nextInt();
                indice = -1;
                for (i = 0; i < 10; i++) {
                    if (codigos[i] == codigo) {
                        indice = i;
                        break;
                    }
                }

                if (indice == -1) System.out.println("Conta não encontrada!");
                else System.out.printf("Conta: %d | Saldo: %.2f%n", codigos[indice], saldos[indice]);
            } else if (opcao == 4) System.out.println("Programa finalizado.");
            else System.out.println("Opção inválida!");
        }

        in.close();
    }
}
