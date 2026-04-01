import java.util.Scanner;

public class Gabriel12 {
    public static void main(String[] args) {
        // Dona Maria das Couve é uma mulher muito preocupada com sua saúde e busca a prática de exercícios
        // físicos constantes. Devido a crise financeira, Dona Maria está sem dinheiro para pagar academia, e teve
        // como alternativa fazer caminhada diária ao redor do quarteirão de sua casa. O quarteirão da casa dela
        // possui formato de um triângulo retângulo (figura abaixo), sabendo que ela deve caminhar um valor fixo de
        // km por dia e dadas as medidas das ruas A e B (em metros) da figura abaixo, calcule e mostre quantas
        // voltas Dona Maria precisa fazer no quarteirão para que ela atinja sua meta.

        double diaryGoalInMeters, sizeRoadA, sizeRoadB, hypotenuse;
        int countRound;

        System.out.println(":: Calculadora de voltas para caminhada ::");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Qual a sua meta diária de caminhada em METROS? ");
        diaryGoalInMeters = keyboard.nextDouble();

        System.out.println("Qual o tamanho da rua A em METROS? ");
        sizeRoadA = keyboard.nextDouble();

        System.out.println("Qual o tamanho da rua B em METROS? ");
        sizeRoadB = keyboard.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(sizeRoadA, 2) + Math.pow(sizeRoadB, 2));
        countRound = (int) Math.ceil(diaryGoalInMeters / hypotenuse);

        System.out.println();
        System.out.printf("Você precisa dar %d voltas.", countRound);
    }
}
