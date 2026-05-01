package exercise06;

import java.util.Scanner;

public class Gabriel12 {
    public static void main(String[] args) {
        //    12. No último ano foi realizada um estudo estatístico sobre acidentes de trânsito em 5 cidades brasileiras.
        //    Para isso os seguintes dados foram coletados:
        //    a) Nome da cidade (String ou char).
        //    b) Número de veículos
        //    c) Número de acidentes de trânsito

        //    Com esses dados deseja-se saber:
        //    a) O maior e o menor índice de acidentes e o nome da cidade a que pertencem
        //    b) A razão entre quantidade de acidentes por quantidade de veículos nas 5 cidades analisadas
        //    c) A média de veículos nas cinco cidades
        //    d) A média de acidentes de trânsito nas cidades com menos de 200 veículos

        int countCities = 1, maxAccidents = 0, minAccidents = 0, totalVehicles = 0, totalAccidents = 0;
        int accidentsLess200Vehicles = 0, countLess200Vehicles = 0, vehicles, accidents;
        double ratio, avgVehicles, avgAccidentsLess200;
        String cityMaxAccidents = "", cityMinAccidents = "";
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= countCities; i++) {
            System.out.printf("Informe os dados para a cidade #%d:%n", i);
            System.out.print("Nome da cidade: ");
            String cityName = input.nextLine();

            while (true) {
                System.out.print("Número de veículos: ");
                vehicles = input.nextInt();

                // TODO - aplicar verificação de TIPO
                if (input.hasNextInt()) System.out.println("INT");
                else continue;

                if (vehicles >= 0) break;
                System.out.println("O valor não pode ser negativo.");
            }

            while (true) {
                System.out.print("Número de acidentes de trânsito: ");
                accidents = input.nextInt();

                // TODO - aplicar verificação de TIPO
                if (input.hasNextInt()) System.out.println("INT");
                else continue;

                if (accidents >= 0) break;
                System.out.println("O valor não pode ser negativo.");
            }

            // ?
            input.nextLine();

            // Verifica se a razão de acidentes da cidade atual é MAIOR que o que já foi verificado
            // E atualiza as informações
            if (accidents > maxAccidents) {
                maxAccidents = accidents;
                cityMaxAccidents = cityName;
            }

            // Verifica se a razão de acidentes da cidade atual é MENOR que o que já foi verificado
            // E atualiza as informações
            if (accidents < minAccidents) {
                minAccidents = accidents;
                cityMinAccidents = cityName;
            }

            totalVehicles += vehicles;
            totalAccidents += accidents;

            if (vehicles < 200) {
                accidentsLess200Vehicles += accidents;
                countLess200Vehicles++;
            }

            System.out.println();
        }

        System.out.println("Resultados: ");

        System.out.printf("Maior índice de acidentes: %d na cidade %s%n", maxAccidents, cityMaxAccidents);
        System.out.printf("Menor índice de acidentes: %d na cidade %s%n", minAccidents, cityMinAccidents);

        ratio = (totalVehicles > 0) ? (double) totalAccidents / totalVehicles : 0;
        System.out.printf("Acidentes por veículos (total): %.4f%n", ratio);

        avgVehicles = (double) totalVehicles / countCities;
        System.out.printf("Média de veículos: %.2f%n", avgVehicles);

        if (countLess200Vehicles > 0) {
            avgAccidentsLess200 = (double) accidentsLess200Vehicles / countLess200Vehicles;
            System.out.printf("Média de acidentes nas cidades com menos de 200 veículos: %.2f%n", avgAccidentsLess200);
        }
        //
        else System.out.println("Não houve cidades com menos de 200 veículos.");
    }
}
