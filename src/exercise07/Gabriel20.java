package exercise07;

public class Gabriel20 {
    public static void main(String[] args) {
        /*
         * 20. Sabe-se que um país A possui 500000 habitantes e uma taxa de natalidade de 3% ao ano, já o país B
         * possui 700000 habitantes e uma taxa de natalidade de 2% ao ano. Escreva um algoritmo, sabendo que
         * estamos no ano de 2015, que calcule em que ano a população do país A ultrapassará a população de B.
         */

        long populationA = 500000, populationB = 700000;
        double birthsTaxA = 0.03, birthsTaxB = 0.02;
        int year = 2015;

        while (populationA < populationB) {
            populationA += populationA * birthsTaxA;
            populationB += populationB * birthsTaxB;

            // System.out.println("POPULACAO A: " + populationA);
            // System.out.println("POPULACAO B: " + populationB);

            year += 1;
        }

        System.out.printf("No ano de %d a população da cidade A %s a cidade B.", year, (year > 2026 ? "passará" : "passou"));
        System.out.println();
        System.out.printf("Nesse ano, a população da cidade A %s de %d e a cidade B, de %d.", (year > 2026 ? "será" : "era"), populationA, populationB);
    }
}
