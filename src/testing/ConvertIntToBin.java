package testing;

public class ConvertIntToBin {
    private static final Integer NUMBER = 999999999;

    public static void main(String[] args) {
        String BINARY = Integer.toBinaryString(NUMBER);
        System.out.println(BINARY);

        // Integer.toHexString();
        // Integer.toOctalString();
    }
}
