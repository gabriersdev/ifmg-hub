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

        int countCities = 5, maxAccidents = 0, minAccidents = 0, totalVehicles = 0, totalAccidents = 0;
        int i, valueInitIterator = 1, accidentsLess200Vehicles = 0, countLess200Vehicles = 0, vehicles, accidents;
        double ratio, avgVehicles, avgAccidentsLess200;
        String cityName = "", cityMaxAccidents = "", cityMinAccidents = "";
        Scanner input = new Scanner(System.in);

        for (i = valueInitIterator; i <= countCities; i++) {
            System.out.printf("Informe os dados para a cidade #%d:%n", i);

            while (true) {
                System.out.println("Nome da cidade: ");

                if (input.hasNextLine()) {
                    cityName = input.nextLine();

                    if (!cityName.trim().isEmpty()) {
                        cityName = cityName.toUpperCase();
                        break;
                    }

                    System.out.println("É preciso informar um nome para identificar a cidade!");
                }

                // Solicita novamente que o usuário informe um nome da cidade
                // Usa o .nextLine()
                else {
                    System.out.println("Informe o nome da cidade.");
                    input.nextLine();
                }
            }

            while (true) {
                System.out.println("Quantidade de veículos: ");

                if (input.hasNextInt()) {
                    vehicles = input.nextInt();

                    if (vehicles >= 0) {
                        input.nextLine();
                        break;
                    }

                    System.out.println("O valor não pode ser negativo.");
                }

                // Solicita novamente que o usuário informe um número, enfatizando que precisa ser inteiro
                // Usa o .next() pois o .nextInt() estoura um erro no console de tipo de variável
                else {
                    System.out.println("Informe um número inteiro.");
                    input.next();
                }
            }

            while (true) {
                System.out.println("Quantidade de acidentes de trânsito: ");

                if (input.hasNextInt()) {
                    accidents = input.nextInt();

                    if (accidents >= 0) {
                        input.nextLine();
                        break;
                    }

                    System.out.println("O valor não pode ser negativo.");
                }

                // Solicita novamente que o usuário informe um número, enfatizando que precisa ser inteiro
                // Usa o .next() pois o .nextInt() estoura um erro no console de tipo de variável
                else {
                    System.out.println("Informe um número inteiro.");
                    input.next();
                }
            }

            // Verifica se o índice de acidentes da cidade atual é MAIOR que o que já foi verificado
            // E atualiza as informações
            if (accidents > maxAccidents || i == valueInitIterator) {
                maxAccidents = accidents;
                cityMaxAccidents = cityName;
            }

            // Verifica se o índice de acidentes da cidade atual é MENOR que o que já foi verificado
            // E atualiza as informações
            if (minAccidents > accidents || i == valueInitIterator) {
                minAccidents = accidents;
                cityMinAccidents = cityName;
            }

            totalVehicles += vehicles;
            totalAccidents += accidents;

            if (vehicles < 200) {
                accidentsLess200Vehicles += accidents;
                countLess200Vehicles++;
            }

            System.out.printf("RAZÃO: acidentes por veículos: %.2f%n", (accidents != 0 ? (double) accidents / vehicles : 0));
            System.out.println();
        }

        input.close();
        System.out.println("Resultados: ");

        System.out.printf("Total de veículos: %d%n", totalVehicles);
        System.out.printf("Maior índice de acidentes: %d na cidade de %s%n", maxAccidents, cityMaxAccidents);
        System.out.printf("Menor índice de acidentes: %d na cidade de %s%n", minAccidents, cityMinAccidents);

        ratio = (totalVehicles > 0) ? (double) totalAccidents / totalVehicles : 0;
        System.out.printf("Quantidade de acidentes por veículos: %.2f%n", ratio);

        avgVehicles = (double) totalVehicles / countCities;
        System.out.printf("Média de veículos por cidade: %.2f%n", avgVehicles);

        if (countLess200Vehicles > 0) {
            avgAccidentsLess200 = (double) accidentsLess200Vehicles / countLess200Vehicles;
            System.out.printf("Média de acidentes nas cidades com menos de 200 veículos: %.2f%n", avgAccidentsLess200);
        }

        //
        else System.out.println("Não houve apontamentos de cidades com menos de 200 veículos.");
    }
}
