package exercise07;

public class Gabriel22 {
    public static void main(String[] args) {
        // 22. O valor aproximado de PI pode ser calculado usando os 51 primeiros termos da seguinte série:
        // S = 1 - ((1/3^3) + (1/5^3) - (1/7^3) + (1/9^3)...)
        // Sendo PI = ³^Raiz(Sx32). Sabendo disso, implemente um algoritmo que calcule e imprima o valor de PI utilizando a série apresentada.

        double s, pi, denominator, term;
        int i;

        s = 1.0;

        for (i = 1; i <= 50; i++) {
            denominator = 2.0 * i + 1.0;
            term = 1.0 / Math.pow(denominator, 3);

            if (i % 2 != 0) s = s - term;
            else s = s + term;
        }

        pi = Math.cbrt(s * 32);

        System.out.println("O valor aproximado de PI é: " + pi);
    }
}
