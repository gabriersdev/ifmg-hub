package learning;

public class BitwiseOperators {
    public static void main(String[] args) {
        String binary = Integer.toBinaryString(Integer.parseUnsignedInt("10", 2));
        System.out.println(binary);

        System.out.println();
        System.out.printf("~%s", binary);
    }
}
