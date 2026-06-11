package exercise02;

import java.util.Scanner;

public class Gabriel23 {
    public static void main(String[] args) {
        // Num dado momento, 3 canais de TV tinham, em sua programação, novelas em seu horário nobre: canal varA,
        // novela varA, canal varB, novela varB, canal varC novela varC. Numa pesquisa com 3000 pessoas, perguntou-se quais
        // novela agradavam. varA tabela a seguir mostra o resultado da pesquisa:

        // [Tabela]

        // Implemente um algoritmo que encontre o número de telespectadores que nenhuma das novelas os agradam.
        // Receba as informações de preferências na entrada de dados e utilize as fórmulas de teoria dos conjuntos.

        Scanner keyboard = new Scanner(System.in);
        int totalSurvey, varA, varB, varC, varAB, varAC, varBC, varABC, noneValue, inclusion;

        System.out.println("Enter the total number of people in the survey: ");
        totalSurvey = keyboard.nextInt();

        System.out.println("Enter the number of people who liked varA: ");
        varA = keyboard.nextInt();

        System.out.println("Enter the number of people who liked varB: ");
        varB = keyboard.nextInt();

        System.out.println("Enter the number of people who liked varC: ");
        varC = keyboard.nextInt();

        System.out.println("Enter the number of people who liked varA and varB: ");
        varAB = keyboard.nextInt();

        System.out.println("Enter the number of people who liked varA and varC: ");
        varAC = keyboard.nextInt();

        System.out.println("Enter the number of people who liked varB and varC: ");
        varBC = keyboard.nextInt();

        System.out.println("Enter the number of people who liked varA, varB and varC: ");
        varABC = keyboard.nextInt();

        // Inclusão - Exclusão
        inclusion = varA + varB + varC - varAB - varAC - varBC + varABC;
        noneValue = totalSurvey - inclusion;

        System.out.println("The number of viewers who do not like any of the soap operas is: " + noneValue);
        keyboard.close();
    }
}