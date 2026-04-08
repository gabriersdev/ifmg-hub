import java.util.Scanner;

public class Gabriel23 {
    public static void main(String[] args) {
        // Num dado momento, 3 canais de TV tinham, em sua programação, novelas em seu horário nobre: canal A,
        // novela A, canal B, novela B, canal C novela C. Numa pesquisa com 3000 pessoas, perguntou-se quais
        // novela agradavam. A tabela a seguir mostra o resultado da pesquisa:

        // Implemente um algoritmo que encontre o número de telespectadores que nenhuma das novelas os agradam.
        // Receba as informações de preferências na entrada de dados e utilize as fórmulas de teoria dos conjuntos.

        // TODO - traduzir
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe o total de pessoas na pesquisa: ");
        int totalPesquisa = keyboard.nextInt();

        System.out.println("Informe o valor de A: ");
        int A = keyboard.nextInt();

        System.out.println("Informe o valor de B: ");
        int B = keyboard.nextInt();

        System.out.println("Informe o valor de C: ");
        int C = keyboard.nextInt();

        System.out.println("Informe o valor de A e B: ");
        int AeB = keyboard.nextInt();

        System.out.println("Informe o valor de A e C: ");
        int AeC = keyboard.nextInt();

        System.out.println("Informe o valor de B e C: ");
        int BeC = keyboard.nextInt();

        System.out.println("Informe o valor de A, B e C: ");
        int AeBeC = keyboard.nextInt();

        // Pela fórmula da teoria dos conjuntos (Princípio da Inclusão-Exclusão),
        // o total de pessoas que assistem a pelo menos uma novela é:
        // A união B união C = A + B + C - (A inter B) - (A inter C) - (B inter C) + (A inter B inter C)
        int assistemPeloMenosUma = A + B + C - AeB - AeC - BeC + AeBeC;

        // As pessoas que não gostam de nenhuma novela são o total da pesquisa menos as que assistem a pelo menos uma
        int nenhuma = totalPesquisa - assistemPeloMenosUma;

        System.out.println("O número de telespectadores que não gostam de nenhuma das novelas é: " + nenhuma);
        
        keyboard.close();
    }
}
