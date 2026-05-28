package additionalExercises;

public class GabrielAdditionalExercise02 {
    public static void main(String[] args) {
        /*
         * ENUNCIADO: Escreva um programa que simule o funcionamento de um relógio digital. O programa
         * deve iterar por todas as horas do dia (de 0 a 23), minutos e segundos (de 0 a 59), exibindo
         * o tempo no formato de 12 horas, acompanhado do indicador AM ou PM. Os números devem ser
         * formatados para sempre exibir dois dígitos (ex: 01:05:09 PM) e deve haver um pequeno intervalo
         * de tempo (sleep) entre cada impressão para simular a passagem contínua do tempo.
         */
        String hourWithZero, minutesWithZero, secondsWithZero, formatHour, formatMinutes, formatSeconds, conditionAMPM;
        int hour, minutes, seconds;

        System.out.println("hora:minutos AM|PM");
        for (hour = 0; hour <= 23; hour += 1) {
            for (minutes = 0; minutes <= 59; minutes += 1) {
                for (seconds = 0; seconds <= 59; seconds += 1) {

                    if (hour > 13) hourWithZero = "0" + hour % 12;
                    else if (hour == 0) hourWithZero = "12";
                    else hourWithZero = "0" + hour;

                    minutesWithZero = "0" + minutes;
                    secondsWithZero = "0" + seconds;

                    formatHour = hourWithZero.substring(hourWithZero.length() - 2);
                    formatMinutes = minutesWithZero.substring(minutesWithZero.length() - 2);
                    formatSeconds = secondsWithZero.substring(secondsWithZero.length() - 2);

                    if (hour > 13) conditionAMPM = "PM";
                    else conditionAMPM = "AM";

                    try {
                        System.out.printf("%s:%s:%s %s", formatHour, formatMinutes, formatSeconds, conditionAMPM);
                        Thread.sleep(1);
                        System.out.println();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}