package learning;

public class ConvertIntToBin {
    private static final Integer NUMBER = 6;

    public static void main(String[] args) {
        String BINARY = Integer.toBinaryString(NUMBER);
        System.out.println(BINARY);

        // # Integer.toHexString();
        // Integer.toOctalString();

        System.out.println(Integer.parseUnsignedInt("10", 2));
    }
}
