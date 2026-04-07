import java.util.Scanner;

public class Gabriel13 {
    public static void main(String[] args) {
        // A copa do mundo de futebol da FIFA é uma competição internacional que iniciou em 1930, acontecendo
        // desde então de 4 em 4 anos, exceto durante o período das guerras mundiais que impossibilitaram a
        // realização 2 copas mundiais. Sabendo dessas informações, faça um algoritmo em JAVA que dado o ano
        // atual calcule o número de copas já realizadas e exiba o resultado ao usuário.

        int firstYearCoup, currentYearCoup, intervalInYears, countCoups;

        System.out.println(":: Cálculo da quantidade de Copas do Mundo FIFA realizadas ::");
        Scanner keyboard = new Scanner(System.in);

        intervalInYears = 4;
        firstYearCoup = 1930;

        System.out.println("Qual é o ano atual? ");
        currentYearCoup = keyboard.nextInt();

        // Subtrai do ano atual o primeiro ano que teve copa, divide pelo intervalo em anos e subtraí 2 (quantidade de anos que não tiveram copas)
        // Para considerar 1930, soma-se + 1
        countCoups = ((currentYearCoup - firstYearCoup) / intervalInYears) - 2 + 1;

        System.out.println();
        System.out.printf("Entre %d e %d tiveram %d copas.", firstYearCoup, currentYearCoup, countCoups);
    }
}
