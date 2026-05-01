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
        Scanner input = new Scanner(System.in);

        int countCities = 5;

        int maxAccidents = 0;
        int minAccidents = 0;
        String cityMaxAccidents = "";
        String cityMinAccidents = "";

        int totalVehicles = 0;
        int totalAccidents = 0;

        int accidentsLess200Vehicles = 0;
        int countLess200Vehicles = 0;

        for (int i = 1; i <= countCities; i++) {
            System.out.printf("Informe os dados para a cidade #%d:%n", i);
            System.out.print("Nome da cidade: ");
            String cityName = input.nextLine();

            int vehicles;
            while (true) {
                System.out.print("Número de veículos: ");
                vehicles = input.nextInt();
                if (vehicles >= 0) break;
                System.out.println("O valor não pode ser negativo.");
            }

            int accidents;
            while (true) {
                System.out.print("Número de acidentes de trânsito: ");
                accidents = input.nextInt();
                if (accidents >= 0) break;
                System.out.println("O valor não pode ser negativo.");
            }
            input.nextLine();

            if (accidents > maxAccidents) {
                maxAccidents = accidents;
                cityMaxAccidents = cityName;
            }
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

        System.out.println("Resultado do que foi analisado: ");

        System.out.printf("a) Maior índice de acidentes: %d (Cidade: %s)%n", maxAccidents, cityMaxAccidents);
        System.out.printf("   Menor índice de acidentes: %d (Cidade: %s)%n", minAccidents, cityMinAccidents);

        double ratio = (totalVehicles > 0) ? (double) totalAccidents / totalVehicles : 0;
        System.out.printf("b) Razão de acidentes por veículos: %.4f%n", ratio);

        double avgVehicles = (double) totalVehicles / countCities;
        System.out.printf("c) Média de veículos: %.2f%n", avgVehicles);

        if (countLess200Vehicles > 0) {
            double avgAccidentsLess200 = (double) accidentsLess200Vehicles / countLess200Vehicles;
            System.out.printf("d) Média de acidentes (cidades com menos de 200 veículos): %.2f%n", avgAccidentsLess200);
        } else {
            System.out.println("d) Não houve cidades com menos de 200 veículos.");
        }
    }
}
