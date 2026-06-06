package testing;

public class Gabriel {
    public static void main(String[] args) {
        System.out.println(4 | 5);
        System.out.println(5 | 4);

        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("1111111111111111111111111111111".length());
        System.out.println(Integer.toBinaryString(-Integer.MAX_VALUE));
        System.out.println("10000000000000000000000000000001".length());

        System.out.println();
        System.out.println(-Integer.MAX_VALUE);
        System.out.println(Integer.parseUnsignedInt("10000000000000000000000000000001", 2));
    }
}
