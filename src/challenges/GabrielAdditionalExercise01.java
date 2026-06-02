package challenges;

public class GabrielAdditionalExercise01 {
    public static void main(String[] args) {
        String hourWithZero, minutesWithZero, secondsWithZero, formatHour, formatMinutes, formatSeconds;

        System.out.println("hora:minutos:segundos");
        for (int hour = 0; hour <= 23; hour += 1) {
            for (int minutes = 0; minutes <= 59; minutes += 1) {
                for (int seconds = 0; seconds <= 59; seconds += 1) {
                    hourWithZero = "0" + hour;
                    minutesWithZero = "0" + minutes;
                    secondsWithZero = "0" + seconds;

                    formatHour = hourWithZero.substring(hourWithZero.length() - 2);
                    formatMinutes = minutesWithZero.substring(minutesWithZero.length() - 2);
                    formatSeconds = secondsWithZero.substring(secondsWithZero.length() - 2);

                    try {
                        System.out.printf("%s:%s:%s", formatHour, formatMinutes, formatSeconds);
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
