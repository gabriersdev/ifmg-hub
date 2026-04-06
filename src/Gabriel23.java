import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Gabriel23 {
    public static void main(String[] args) {
        // Num dado momento, 3 canais de TV tinham, em sua programação, novelas em seu horário nobre: canal A,
        // novela A, canal B, novela B, canal C novela C. Numa pesquisa com 3000 pessoas, perguntou-se quais
        // novela agradavam. A tabela a seguir mostra o resultado da pesquisa:

        // Implemente um algoritmo que encontre o número de telespectadores que nenhuma das novelas os agradam.
        // Receba as informações de preferências na entrada de dados e utilize as fórmulas de teoria dos conjuntos.

        // T1DO - Fazer. Aproveitar e obter do usuário os parâmetros para cálculo

        Scanner keyboard = new Scanner(System.in);

        Integer A = 1450;
        Integer B = 1150;
        Integer C = 900;

        Integer AeB = 350;
        Integer AeC = 400;
        Integer BeC = 300;
        Integer AeBeC = 100;

        System.out.println("Informe o valor de A: ");
        A = keyboard.nextInt();

        System.out.println("Informe o valor de B: ");
        B = keyboard.nextInt();

        System.out.println("Informe o valor de C: ");
        C = keyboard.nextInt();

        System.out.println("Informe o valor de A e B: ");
        AeB = keyboard.nextInt();

        System.out.println("Informe o valor de A e C: ");
        AeC = keyboard.nextInt();

        System.out.println("Informe o valor de B e C: ");
        BeC = keyboard.nextInt();

        System.out.println("Informe o valor de A, B e C");
        AeBeC = keyboard.nextInt();

        // A lógica é pegar os valores totais e diminuir intercessões, depois somar os resultados obtidos e subtrair pelo tamanho "da amostra" (3000 pessoas)
        // Total da A = 1450 + 350 + 400 = 2200
        // Total da B = 1150 + 350 + 300 + 100 = 1900
        // Total da C = 900 + 400 + 300 + 100 = 1700

        // ?
        // Todos = 4800
        // Pessoas na pesquisa = 3000
    }
}
