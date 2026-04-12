package exercise03;

import java.util.Scanner;

public class Gabriel01 {
    public static void main(String[] args) {
        // Faça um algoritmo que receba a idade de um nadador e mostre a categoria do mesmo. Faça os testes
        // necessários em relação a idade inválida.

        // Infantil 5 a 7 (inclusive)
        // Juvenil 8 a 10 (inclusive)
        // Adolescente 11 a 15 (inclusive)
        // Adulto 16 a 40 (inclusive)
        // Sênior Acima de 40 (inclusive)

        int age;
        String category = "";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Qual a idade do nadador? ");
        age = keyboard.nextInt();

        if (age < 5) category = "não apropriada para o esporte";
        else if (age <= 7) category = "infantil";
        else if (age <= 10) category = "juvenil";
        else if (age <= 15) category = "adolescente";
        else if (age <= 40) category = "adulto";
        else if (age > 41) category = "sênior";

        System.out.printf("A categoria para o nadador é %s.", category);
        keyboard.close();
    }
}
