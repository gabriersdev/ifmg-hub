package exercise04;

import java.util.Scanner;

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

        Scanner keyboard = new Scanner(System.in);
        int electionDay, electionMonth, electionYear, birthDay, birthMonth, birthYear, age, status = 0;
        // Usando status como variável de controle. Os valores são: 0 - não pode votar, 1 - voto facultativo, 2 - o voto é obrigatório

        // Infos. da eleição
        System.out.println("Informe o dia da eleição: ");
        electionDay = keyboard.nextInt();

        System.out.println("Informe o mês da eleição: ");
        electionMonth = keyboard.nextInt();

        System.out.println("Informe o ano da eleição: ");
        electionYear = keyboard.nextInt();

        // Infos. de nascimento
        System.out.println("Informe o dia em que você nasceu: ");
        birthDay = keyboard.nextInt();

        System.out.println("Informe o mês em que você nasceu: ");
        birthMonth = keyboard.nextInt();

        System.out.println("Informe o ano em que você nasceu: ");
        birthYear = keyboard.nextInt();

        // Calcula a idade baseada apenas no ano
        age = electionYear - birthYear;

        // Lógica para ajuste de idade, quando a pessoa ainda não fez aniversário no ano da eleição
        if (electionMonth < birthMonth || (electionMonth == birthMonth && electionDay < birthDay)) age = age - 1;

        // Não pode votar
        if (age < 16) status = 0;

        // Voto facultativo, para pessoas que tem 16 ou mais e menos de 18
        else if (age < 18 || age > 70) status = 1;

        // Voto obrigatório - definitivamente tem 18 ou mais e 70 ou menos
        else status = 2;

        // Exibe o resultado de acordo com o status
        System.out.println();
        if (status == 0) System.out.printf("No dia da eleição você terá %d anos e não vota.", age);
        else if (status == 1) System.out.println("Você pode votar (voto facultativo).");
        else if (status == 2) System.out.println("Você deve votar (voto obrigatório).");

        keyboard.close();
    }
}
