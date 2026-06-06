package testing;

public class Switch {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
        SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        String status = "SUCCESS";
        Day day = Day.SATURDAY;

        // System.out.println(Day.values().length);

        String rec = switch (status) {
            case "SUCCESS" -> "Operação concluída";
            case "ERROR" -> "Erro na operação";
            case "PENDING" -> "Processando";
            default -> "Status desconhecido";
        };

        String dayType = switch (day) {
            case SATURDAY, SUNDAY -> "Fim de semana";
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Dia útil";
        };

        System.out.println(rec);
        System.out.println(dayType);
    }
}