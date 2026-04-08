import java.util.Scanner;

public class Gabriel13 {
    public static void main(String[] args) {
        // A copa do mundo de futebol da FIFA é uma competição internacional que iniciou em 1930, acontecendo
        // desde então de 4 em 4 anos, exceto durante o período das guerras mundiais que impossibilitaram a
        // realização 2 copas mundiais. Sabendo dessas informações, faça um algoritmo em JAVA que dado o ano
        // atual calcule o número de copas já realizadas e exiba o resultado ao usuário.

        int firstYearCoup, currentYear, intervalInYears, countCoups, initGapWWII, finishGapWWII;

        System.out.println(":: Cálculo da quantidade de Copas do Mundo FIFA realizadas ::");
        Scanner keyboard = new Scanner(System.in);

        countCoups = 0;
        intervalInYears = 4;
        firstYearCoup = 1930;
        initGapWWII = 1942;
        finishGapWWII = 1946;

        System.out.println("Qual é o ano atual? ");
        currentYear = keyboard.nextInt();

        // TODO - fazer validações
        // IF condicao e ELSE condicao

        if (currentYear < firstYearCoup) {
            System.out.println("O ano informado é anterior a primeira Copa.");
        }

        // 1947 => TRUE && FALSE
        // 1930 1934 1938 => 3 copas

        // TODO - verificar se essa lógica está correta (parece que não)

        else if (currentYear >= initGapWWII && currentYear <= finishGapWWII) {
            // Não subtrai, pois os estamos no período em que não houve copa ou anterior a ele
            countCoups = ((currentYear - firstYearCoup) / intervalInYears) + 1;
        }

        else {
            // Subtrai do ano atual o primeiro ano que teve copa, divide pelo intervalo em anos e subtraí 2 (quantidade de anos que não tiveram copas)
            // Para considerar 1930, soma-se + 1
            countCoups = ((currentYear - firstYearCoup) / intervalInYears) - 2 + 1;
        }

        System.out.println();
        System.out.printf("Entre %d e %d tiveram %d copas.", firstYearCoup, currentYear, countCoups);
    }
}
