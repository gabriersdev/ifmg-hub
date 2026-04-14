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
        if (diffYear > 16) {

        } else if (diffYear < 16) {
            // Não pode
        } else {
            // Diff de meses

            if (diffMonths > 1) {
                // N vota
            }

            else if (diffMonths < 1) {
                // Vota
            }

             else {
                 // Olhar diff dias

                // diffDays < 0 => não vota
                // diffDays > 0 => vota
                // diffDays = 0 => vota
            }
        }
    }
}
