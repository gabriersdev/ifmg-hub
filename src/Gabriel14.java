import java.util.Scanner;

public class Gabriel14 {
    public static void main(String[] args) {
        // Sabe-se que, para iluminar corretamente os cômodos de uma casa, para cada m², deve-se usar 18 W de
        // potência. Faça um programa que receba as dimensões de um cômodo retangular (em metros), calcule e
        // mostre a área de mesmo (em m²) e a potência de iluminação necessária para iluminar corretamente o
        // cômodo.

        double base, height, area, necessaryPowPerM2, necessaryPower;

        necessaryPowPerM2 = 18;

        System.out.println(":: Calculo da potência necessária para iluminar um cômodo ::");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe o tamanho da base ");
        base = keyboard.nextDouble();

        System.out.println("Informe a altura de um cômodo ");
        height = keyboard.nextDouble();

        area = base * height;
        necessaryPower = area * necessaryPowPerM2;

        System.out.printf("Para iluminar corretamente esse cômodo de área %f é necessário uma potência de %f.", area, necessaryPower);
        keyboard.close();
    }
}
