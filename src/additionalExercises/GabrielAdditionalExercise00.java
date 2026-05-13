package additionalExercises;

public class GabrielAdditionalExercise00 {
    public static void main(String[] args) {
        String hourWithZero, minutesWithZero, formatHour, formatMinutes;

        System.out.println("hora:minutos");
        for (int hour = 0; hour <= 23; hour += 1) {
            for (int minutes = 0; minutes <= 59; minutes += 1) {
                hourWithZero = "0" + hour;
                minutesWithZero = "0" + minutes;

                formatHour = hourWithZero.substring(hourWithZero.length() - 2);
                formatMinutes = minutesWithZero.substring(minutesWithZero.length() - 2);

                try {
                    System.out.printf("%s:%s", formatHour, formatMinutes);
                    Thread.sleep(1);
                    System.out.println();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
