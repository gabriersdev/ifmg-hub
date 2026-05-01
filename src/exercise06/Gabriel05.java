package exercise06;

public class Gabriel05 {
    public static void main(String[] args) {
        //    5. Faça um programa que calcule e imprima a soma e a média dos 10 primeiros números positivos.
        //    Soma = 1 + 2 + 3 + ... + 10

        double i, acc = 0, avg = 0, count = 0;

        for (i = 1; i <= 10; i++) {
            acc += i;
            count += 1;
        }

        if (acc != 0) avg = acc / count;
        System.out.printf("A soma dos números é %.2f e a média %.2f.", acc, avg);
    }
}
