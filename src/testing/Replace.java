package testing;

public class Replace {
    public static void main(String[] args) {
        String ns = "AAAAA ##### SAPO EEEEE IIIII OOOOO UUUUU".replaceAll("(?i)" + "[AEIOU]", "?");
        System.out.println(ns);
        System.out.println("ABCD".equalsIgnoreCase("ABCDE"));
    }
}
