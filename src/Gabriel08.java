import java.util.Scanner;

public class Gabriel08 {
    public static void main(String[] args) {
        // Zé Borba Gato é dono de um terreno na cidade de Sabará e deseja saber qual seria o preço médio de venda
        // desse terreno. Conforme visto na planta do mesmo, nota-se que o lote possui um formato de trapézio
        // (Figura abaixo).

        // Assim sendo, dados os valores das medidas da base maior, base menor e da altura do terreno (em metros), e
        // sabendo o valor médio (R$) pago por metro quadrado no local onde se encontra o lote, calcule e mostre a área
        // total e o valor médio de venda (R$) que Zé Borba Gato pode pedir pelo terreno.

        double minorBase, highBase, height, m2Value, area, saleValue;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Qual o tamanho em metros da base menor do terreno? ");
        minorBase = keyboard.nextDouble();

        System.out.println("Qual o tamanho em metros da base maior do terreno? ");
        highBase = keyboard.nextDouble();

        System.out.println("Qual o tamanho em metros da altura do terreno? ");
        height = keyboard.nextDouble();

        System.out.println("Qual o valor do metro quadrado na região (R$)? ");
        m2Value = keyboard.nextDouble();

        area = ((highBase + minorBase) * height) / 2;
        saleValue = area * m2Value;

        System.out.printf("O tamanho da área do terreno é %f. Ele pode ser vendido por R$ %.2f.", area, saleValue);
        keyboard.close();
    }
}
