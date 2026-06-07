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

        status = "ERROR";

        String result = switch (status) {
            case "SUCCESS" -> "OK";

            case "ERROR" -> {
                System.out.println("Erro encontrado");
                // yield funciona aqui como um RETURN, já que RETURN não é suportado neste contexto
                // Diferente do break, que apenas SAI do case, o yield saí e tem um retorno
                yield "FAIL";
            }

            default -> "UNKNOWN";
        };

        System.out.println(rec);
        System.out.println(dayType);
        System.out.println(result);
    }
}