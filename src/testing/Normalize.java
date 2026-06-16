package testing;

import java.text.Normalizer;

public class Normalize {
    public static String stripAccents(String input) {
        if (input == null) return null;

        // A normalização remove acentuação para caracteres especiais
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);

        // \\p{M} é um prefixo para unicode scripts (Punch => caracteres especiais, M => para letras [a-z]
        return normalized.replaceAll("\\p{M}", "");
    }

    public static void main(String[] args) {
        System.out.println(stripAccents("ABRÃÃO NÃO É UM exemplo."));
    }
}
