package learning;

public class ConvertBinToInt {
    private static final String BINARY = "101";

    public static void main(String[] args) {
        Integer NUMBER = Integer.parseUnsignedInt(BINARY, 2);
        System.out.println(NUMBER);

        // # Integer.parseUnsignedInt(HEX, 16);
        // # Integer.parseUnsignedInt(OCTAL, 8);
    }
}
