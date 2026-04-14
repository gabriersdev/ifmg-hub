package exercise04;

public class Gabriel04 {
    public static void main(String[] args) {
        // Faça um programa que receba de entrada a data de votação do ano atual e a data de nascimento de uma
        // pessoa. As datas podem ser lidas em 3 informações (dia, mês e ano). Faça as devidas comparações e
        // verifique se essa pessoa não pode votar, é obrigada a votar ou o voto é facultativo, segundo as regras
        // brasileiras.

        // Idade Voto
        // Menor de 16 Não vota
        // 16 à 18 e acima de 70 Facultativo
        // Entre 18 e 70 Obrigatório

        int electionDay, electionMonth, electionYear, birthDay, birthMonth, birthYear;
        int diffYear, diffMonths, diffDays = 0;
        boolean facultative = false, required = false, unauthorized = false;

        electionDay = 10;
        electionMonth = 10;
        electionYear = 2020;

        birthDay = 1;
        birthMonth = 10;
        birthYear = 2004;

        diffYear = electionYear - birthYear;
        diffMonths = electionMonth - birthMonth;
        diffDays = electionDay - birthDay;

        // Se o ano já for maior que 18 (19, 20...) já deve votar e se for menor que 70
        if (diffYear > 18 && diffYear < 70) required = true;

        // Se for maior ou igual a 16, já pode votar (facultativo)
        else if (diffYear > 16) facultative = true;

        else if (diffYear > 15 && diffDays > 70) {
            if (diffMonths >= 0) facultative = true;

            else if (diffMonths == 0) {
                if (diffDays >= 1) facultative = true;
                else unauthorized = true;
            }

            else unauthorized = true;
        }

        else unauthorized = true;

        if (unauthorized) System.out.printf("Você não tem idade suficiente para votar.");
        if (facultative) System.out.println("Você pode votar (voto facultativo)");
        if (required) System.out.println("Você deve votar (voto obrigatório)");
    }
}
