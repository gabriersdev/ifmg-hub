import java.util.Scanner;

public class Gabriel16 {
    public static void main(String[] args) {
        // Faça um algoritmo que receba uma quantidade qualquer em minutos e converta em horas e minutos (utilize
        // divisão inteira e resto da divisão inteira).

        int minutes, countHours, restMinutes;
        Scanner keyboard = new Scanner(System.in);

        System.out.println(":: Conversão de minutos para horas e minutos");
        System.out.println("Informe uma quantidade de minutos: ");

        minutes = keyboard.nextInt();
        countHours = minutes / 60;
        restMinutes = minutes % 60;

        System.out.printf("Resultado: %d h %d min", countHours, restMinutes);
        keyboard.close();
    }
}
