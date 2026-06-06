package testing;

public class Enum {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
        SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        System.out.println(Day.values().length);

        System.out.println(Day.values()[0]);

        for (Day day : Day.values()) {
            System.out.println(day.toString());
        }
    }
}