package exercise04;

public class Gabriel09 {
    public static void main(String[] args) {

        int number1, number2, number3, temp;

        number1 = 2;
        number2 = 30;
        number3 = 5;

        if (number1 > number2) {
            temp = number2;
            number2 = number1;
            number1 = temp;
        }

        if (number2 > number3) {
            temp = number3;
            number3 = number2;
            number2 = temp;
        }

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}
